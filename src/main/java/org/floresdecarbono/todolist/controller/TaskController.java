package org.floresdecarbono.todolist.controller;

import jakarta.validation.Valid;
import org.floresdecarbono.todolist.dtos.TaskRecordDtos;
import org.floresdecarbono.todolist.models.TaskModel;
import org.floresdecarbono.todolist.repositories.TaskRepository;
import org.floresdecarbono.todolist.services.TaskService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class TaskController {

    @Autowired
    private TaskService service;

    @GetMapping(value = "/tasks")
    ResponseEntity<List<TaskModel>> findAll() {
        List<TaskModel> list = service.findAll();

        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

    @GetMapping(value = "/tasks/{id}")
    ResponseEntity<TaskModel> findById(@PathVariable UUID id) {
        TaskModel obj = service.findById(id);

        return ResponseEntity.status(HttpStatus.OK).body(obj);
    }

    @PostMapping(value = "/tasks")
    ResponseEntity<TaskModel> postTaskModel(@RequestBody @Valid TaskRecordDtos taskRecordDtos) {
        TaskModel task = new TaskModel();
        BeanUtils.copyProperties(taskRecordDtos, task);

        return ResponseEntity.ok().body(service.save(task));
    }


}
