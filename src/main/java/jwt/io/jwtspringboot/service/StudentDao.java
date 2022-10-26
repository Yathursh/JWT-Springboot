package jwt.io.jwtspringboot.service;

public class StudentDao {
    static StudentDetails studentDetails = new StudentDetails();

    static {
        studentDetails.getStudentList().add(new Student(1234,"Yoyo", "sss"));
        studentDetails.getStudentList().add(new Student(4567,"yaya", "eee"));
        studentDetails.getStudentList().add(new Student(8910,"lala", "rrr"));
        studentDetails.getStudentList().add(new Student(1112,"fafa", "yyy"));
        studentDetails.getStudentList().add(new Student(1314,"bobo", "uuu"));
    }

    public static StudentDetails getAllStudents() {

        return studentDetails;
    }
}
