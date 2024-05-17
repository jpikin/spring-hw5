package com.example.Spring_hw5.repository;

import com.example.Spring_hw5.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
