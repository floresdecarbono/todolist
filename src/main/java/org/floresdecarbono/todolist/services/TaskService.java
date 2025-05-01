package org.floresdecarbono.todolist.services;

import org.floresdecarbono.todolist.models.TaskModel;
import org.floresdecarbono.todolist.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;

    public List<TaskModel> findAll() {
        List<TaskModel> list = repository.findAll();
        return list;
    }

    public TaskModel findById(UUID id) {
        Optional<TaskModel> obj = repository.findById(id);

        return obj.get();
    }

    public TaskModel save(TaskModel taskModel) {
        repository.save(taskModel);
        return taskModel;
    }

}
