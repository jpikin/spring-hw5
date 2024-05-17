package com.example.Spring_hw5.service;

import com.example.Spring_hw5.model.Task;
import com.example.Spring_hw5.model.TaskStatus;
import com.example.Spring_hw5.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TaskService {

    private TaskRepository repository;

    public List<Task> getAllTasks(){
        return repository.findAll();
    }
    public Task addTask(Task task){
        return repository.save(task);
    }
    public List<Task> getTasksByStatus(TaskStatus status){
        List<Task> oneStatusTasks = new ArrayList<>();
        for(Task task: repository.findAll()){
            if(task.getStatus().equals(status)){
                oneStatusTasks.add(task);
            }
        }
        return oneStatusTasks;
    }
    public Task updateStatus(Long id, Task taskDetails){
        Optional<Task> optionalTask = repository.findById(id);
        if(optionalTask.isPresent()){
            Task task = optionalTask.get();
            task.setStatus(taskDetails.getStatus());
            task.setCreate_date(LocalDateTime.now());
            return repository.save(task);
        }
        else {
            throw new IllegalArgumentException("Task not found by ID "+ id);
        }
    }
    public void deleteTask(Long id){
        repository.deleteById(id);
    }
}
