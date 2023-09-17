package com.gk.studentCrud.repos;

import com.gk.studentCrud.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long> {
}
