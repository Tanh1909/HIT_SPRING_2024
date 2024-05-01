package com.example.connectdatabase.controller;

import com.example.connectdatabase.entity.Student;
import com.example.connectdatabase.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private IStudentService studentService;
    @GetMapping("")
    public Student getAllStudents(@RequestParam(required = false) String name,@RequestParam(required = false) Integer age){
        Student s=new Student();
        s.setName("abc");
        s.setAge(20);
        s.setId(1L);
        s.setAddress("cba");
        return s;
    }
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable(required = false)  Long id){
        System.out.println(id);
        return studentService.findById(id);
    }
    @PostMapping("")
    public Student createStudent(@RequestBody Student student){
        return studentService.create(student);
    }
    @PutMapping("")
    public Student editStudent(Student student){
        return  studentService.edit(student);
    }
    @DeleteMapping("")
    public boolean deleteStudent(Long id){
        return  studentService.delete(id);
    }

}
