package com.example.connectdatabase.service.serviceImple;

import com.example.connectdatabase.entity.Task;
import com.example.connectdatabase.repository.TaskRepository;
import com.example.connectdatabase.service.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ITaskImple implements ITaskService {
    @Autowired
    private TaskRepository taskRepository;
    @Override
    public Task create(Task taskReq) {
        return taskRepository.save(taskReq);
    }

    @Override
    public Task edit(Task taskReq) {
        //logic
        return null;
    }

    @Override
    public Task findById(Long id) {
        return taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Not Found Task!"));
    }

    @Override
    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        findById(id);
        taskRepository.deleteById(id);
    }
}
