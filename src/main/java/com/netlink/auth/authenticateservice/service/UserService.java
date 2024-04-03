package com.netlink.auth.authenticateservice.service;

import com.netlink.auth.authenticateservice.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    List<Student> studentList = new ArrayList<>(List.of(
            new Student(101,"Adil","Java"),
            new Student(102,"Ritu","Java"),
            new Student(103,"Gunjan","React")
    ));
    public void addStudent(Student student)
    {
        studentList.add(student);
    }
    public List<Student> getStudentList()
    {
        return studentList;
    }
}
