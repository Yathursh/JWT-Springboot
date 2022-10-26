package jwt.io.jwtspringboot.service;

import java.util.ArrayList;
import java.util.List;

public class StudentDetails {

    List<Student> StudentList;

    public List<Student> getStudentList() {

        if (StudentList == null){
            StudentList = new ArrayList<Student>();
        }

        return StudentList;
    }

    public void setStudentList(List<Student> studentList) {
        StudentList = studentList;
    }
}
