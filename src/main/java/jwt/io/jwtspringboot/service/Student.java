package jwt.io.jwtspringboot.service;

public class Student {
    private int roleNo;
    private String firstName;
    private String lastName;

    public Student(int roleNo, String firstName, String lastName) {
        this.roleNo = roleNo;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getRoleNo() {
        return roleNo;
    }

    public void setRoleNo(int roleNo) {
        this.roleNo = roleNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
