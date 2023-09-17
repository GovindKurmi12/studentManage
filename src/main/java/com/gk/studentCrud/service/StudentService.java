package com.gk.studentCrud.service;

import com.gk.studentCrud.model.Student;
import com.gk.studentCrud.model.StudentInput;
import com.gk.studentCrud.repos.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public Student createStudent(Student student) {
        return studentRepo.save(student);
    }

    public List<Student> getAllStudent() {
        return studentRepo.findAll();
    }

    public Student updateStudent(Student student) {
        return studentRepo.save(student);
    }

    public Optional<Student> getById(Long id) {
        return studentRepo.findById(id);
    }
}
