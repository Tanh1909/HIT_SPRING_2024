package com.example.connectdatabase.service;

import com.example.connectdatabase.entity.Task;

import java.util.List;

public interface ITaskService {
    Task create(Task taskReq);
    Task edit(Task taskReq);
    Task findById(Long id);
    List<Task> findAll();
    void deleteById(Long id);
}
