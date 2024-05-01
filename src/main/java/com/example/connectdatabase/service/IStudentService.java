package com.example.connectdatabase.service;

import com.example.connectdatabase.entity.Student;

import java.util.List;

public interface IStudentService {
    public List<Student> getAllStudent(String name, Integer age);
    public Student create(Student student);
    public Student edit(Student student);
    public boolean delete(Long id);
    public Student findById(Long id);
}
