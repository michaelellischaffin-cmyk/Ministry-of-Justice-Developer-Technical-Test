package com.codetest.codetestmanager.model;

import java.time.LocalDateTime;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.*;


@Entity
public class Task {
    @NotBlank(message = "Please enter a Title")
    private String title;
  
    @TaskId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId;

    @NotNull(message = "Please enter a date")
    private LocalDateTime dueDate;

    private String desc;

    @NotNull(message = "Please enter a Status")
    @Enumerated(EnumType.STRING)
    private TaskStatus status;

    
    public Long getId() {
      return taskId;
    }
  
    public void setId(Long id) {
      this.taskId = taskId;
    }
  
    public String getTitle() {
      return title;
    }
  
    public void setTitle(String title) {
      this.title = title;
    }
  
    public String getDescription() {
      return desc;
    }
  
    public void setDescription(String desc) {
      this.desc = desc;
    }
  
    public TaskStatus getStatus() {
      return status;
    }
  
    public void setStatus(TaskStatus status) {
      this.status = status;
    }
  
    public LocalDateTime getDueDate() {
      return dueDate;
    }
  
    public void setDueDate(LocalDateTime dueDate) {
      this.dueDate = dueDate;
    }
  
}
