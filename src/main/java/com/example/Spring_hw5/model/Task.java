package com.example.Spring_hw5.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "tasks")
public class Task {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 @Column(nullable = false)
 private String task;
 @Column(nullable = false)
 private TaskStatus status;
 @Column(nullable = false)
 private LocalDateTime create_date;

 @PrePersist
 public void prePersist() {
  this.create_date = LocalDateTime.now();
 }
}