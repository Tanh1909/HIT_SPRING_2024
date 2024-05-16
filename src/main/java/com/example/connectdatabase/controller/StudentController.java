package com.example.connectdatabase.controller;

import com.example.connectdatabase.entity.Student;
import com.example.connectdatabase.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private IStudentService studentService;
    @GetMapping("")
    public ResponseEntity<?> getAllStudents(){
        return ResponseEntity.ok(studentService.getAllStudent());
    }
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id){
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
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable Long id){
        studentService.delete(id);
        return ResponseEntity.ok("Xoa Thanh Cong");
    }

}
