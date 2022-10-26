package jwt.io.jwtspringboot.controller;


import jwt.io.jwtspringboot.model.JwtRequest;
import jwt.io.jwtspringboot.model.JwtResponse;
import jwt.io.jwtspringboot.service.UserService;
import jwt.io.jwtspringboot.utility.JWTutility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private JWTutility jwTutility;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserService userService;



    @PostMapping("/authenticate")
    public JwtResponse authendicate (@RequestBody JwtRequest jwtRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            jwtRequest.getUsername(),
                            jwtRequest.getPassword()
                    )
            );
        }catch (BadCredentialsException e){
            throw new Exception("INVALID CREDENTIAL", e);
        } //Authendication part

//        Creates a JWT token
        final UserDetails userDetails
                = userService.loadUserByUsername(jwtRequest.getUsername());

        final String token =
                jwTutility.generateToken(userDetails); //Token will be created

        return new JwtResponse(token);



    }
    @GetMapping("/")
    public String home(){
        return "Hello";
    }
}
