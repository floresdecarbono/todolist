package repositories;

import entities.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TaskRepository {

    private List<Task> tasks = new ArrayList<>();

    public TaskRepository() {}

    public void save(Task task) {
        tasks.add(task);
    }

    public Optional<Task> findById(long id) {
        return tasks.stream().filter(t -> t.getId() == id).findFirst();
    }

    public List<Task> findAll() {
        return tasks;
    }

    public void remove(Task task) {
        tasks.remove(task);
    }

    public void remove(long id) {
        tasks.removeIf(t -> t.getId() == id);
    }
}
