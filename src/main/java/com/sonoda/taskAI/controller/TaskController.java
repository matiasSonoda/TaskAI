package com.sonoda.taskAI.controller;

import com.sonoda.taskAI.model.Task;
import com.sonoda.taskAI.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @GetMapping
    public String getAllTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping
    public String createTask(@RequestBody Task task) {
        taskService.createTask(task);
        return "Tarea creada";
    }
}
