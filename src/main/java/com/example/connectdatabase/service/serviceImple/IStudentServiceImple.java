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
    public List<Student> getAllStudent() {
        return studentsRepository.findAll();
    }

    @Override
    public Student create(Student student) {
        return  studentsRepository.save(student);
    }

    @Override
    public Student edit(Student student) {
        //logic
        return student;
    }

    @Override
    public void delete(Long id) {
        findById(id);
        studentsRepository.deleteById(id);
    }

    @Override
    public Student findById(Long id) {
        return studentsRepository.findById(id).orElseThrow(() -> new RuntimeException("Not Found User!"));
    }
}
