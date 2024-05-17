package com.example.Spring_hw5.service;

import com.example.Spring_hw5.model.Task;
import com.example.Spring_hw5.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskService {

    private TaskRepository repository;

    public List<Task> getAllTasks(){
        return repository.findAll();
    }
    public Task createTask(Task task){
        return repository.save(task);
    }
}
