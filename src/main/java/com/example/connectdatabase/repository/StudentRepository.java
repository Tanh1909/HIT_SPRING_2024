package com.example.connectdatabase.repository;

import com.example.connectdatabase.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
