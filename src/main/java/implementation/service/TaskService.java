package implementation.service;



import implementation.model.Task;

import java.util.List;
import java.util.UUID;

public interface TaskService {

    Task createTask(Task task);

    Task updateTask(UUID taskId, Task task);

    List<Task> getTask();

    List<Task> getAllTasks();

    void deleteTask(UUID id);

}
