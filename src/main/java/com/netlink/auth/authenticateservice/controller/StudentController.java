package com.netlink.auth.authenticateservice.controller;

import com.netlink.auth.authenticateservice.model.Student;
import com.netlink.auth.authenticateservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private UserService userService;

    @PostMapping("/add-student")
    public void addStudent(@RequestBody Student student)
    {
        userService.addStudent(student);
    }
    @GetMapping("/get-all-students")
    public List<Student> getStudentList()
    {
        return userService.getStudentList();
    }
}
