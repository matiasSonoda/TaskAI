package com.sonoda.taskAI.service;

import com.sonoda.taskAI.model.Task;
import com.sonoda.taskAI.persistence.TaskRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;


    public String getAllTasks() {
        return taskRepository.findAll().toString();
    }

    public void createTask(Task task) {
        taskRepository.save(task);
    }
}
