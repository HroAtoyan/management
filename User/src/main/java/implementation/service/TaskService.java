package implementation.service;

import implementation.model.Task;

import java.util.List;

public interface TaskService {

    Task createTask(Task task);

    void updateTask(Task task);

    Task getTask(int id);

    List<Task> getAllTasks();

    void deleteTask(int id);

}
