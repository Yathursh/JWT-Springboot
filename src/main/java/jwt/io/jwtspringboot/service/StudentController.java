package jwt.io.jwtspringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class StudentController {

    @Autowired
    StudentDao service;

    @GetMapping("/students")
    public StudentDetails getAllStudents(){
        return service.getAllStudents();
    }

}
