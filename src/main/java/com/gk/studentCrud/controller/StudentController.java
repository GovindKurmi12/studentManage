package com.gk.studentCrud.controller;

import com.gk.studentCrud.model.Student;
import com.gk.studentCrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @QueryMapping("/create")
    public Student createStudent(@Argument Student student) {
        return studentService.createStudent(student);
    }

    @QueryMapping("/get")
    public Optional<Student> getById(@Argument Long id) {
        return studentService.getById(id);
    }

    @QueryMapping("/getAll")
    public List<Student> getAllStudent() {
        return studentService.getAllStudent();
    }

    @QueryMapping("/update")
    public Student updateStudent(@Argument Student student) {
        return studentService.updateStudent(student);
    }
}
