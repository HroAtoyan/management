package implementation.service;



import org.springframework.scheduling.config.Task;

import java.util.List;
import java.util.UUID;

public interface TaskService {

    Task createTask(Task task);

    void updateTask(Task task);

    Task getTask(UUID id);

    List<Task> getAllTasks();

    void deleteTask(UUID id);

}
