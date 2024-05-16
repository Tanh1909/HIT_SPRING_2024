package com.example.connectdatabase.repository;

import com.example.connectdatabase.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
