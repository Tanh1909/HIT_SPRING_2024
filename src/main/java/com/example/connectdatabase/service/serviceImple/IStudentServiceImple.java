package com.example.connectdatabase.service.serviceImple;

import com.example.connectdatabase.entity.Student;
import com.example.connectdatabase.repository.StudentRepository;
import com.example.connectdatabase.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class IStudentServiceImple implements IStudentService {
    @Autowired
    private StudentRepository studentsRepository;

    @Override
    public List<Student> getAllStudent(String name,Integer age) {
        List<Student> students=studentsRepository.findAll();
        return students.stream().filter(student -> {
            return false;
        }).collect(Collectors.toList());

    }

    @Override
    public Student create(Student student) {

        return  student;
    }

    @Override
    public Student edit(Student student) {
        //logic
        return student;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }

    @Override
    public Student findById(Long id) {

        return  null;
    }
}
