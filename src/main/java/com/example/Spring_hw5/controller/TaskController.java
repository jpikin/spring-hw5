package com.example.Spring_hw5.controller;

import com.example.Spring_hw5.model.Task;
import com.example.Spring_hw5.model.TaskStatus;
import com.example.Spring_hw5.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class TaskController {

    private final TaskService service;

    @GetMapping("tasks")
    public List<Task> getAllTasks(){
        return service.getAllTasks();
    }
    @PostMapping("tasks")
    public Task addTask(@RequestBody Task task){
        return service.addTask(task);
    }
    @GetMapping("/status/{status}")
    public List<Task> getTasksByStatus(@PathVariable TaskStatus status){
        return service.getTasksByStatus(status);
    }
    @PutMapping("/{id}")
    public Task updateTaskStatus(@PathVariable Long id, @RequestBody Task task){
        return service.updateStatus(id, task);
    }
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id){
        service.deleteTask(id);
    }
}
