package com.example.connectdatabase.controller;

import com.example.connectdatabase.entity.Task;
import com.example.connectdatabase.service.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    private ITaskService taskService;

    @PostMapping("")
    public ResponseEntity<?> create(@RequestBody Task taskReq){
        return ResponseEntity.ok(taskService.create(taskReq));
    }
    @GetMapping("")
    public ResponseEntity<?> findAll(){
        return ResponseEntity.ok(taskService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok(taskService.findById(id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        taskService.deleteById(id);
        return ResponseEntity.ok("Xoa thanh cong");
    }

}
