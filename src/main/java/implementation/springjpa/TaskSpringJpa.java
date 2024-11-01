package implementation.springjpa;

import implementation.entity.TaskEntity;


import implementation.exceptions.taskexceptions.TaskApiException;
import implementation.exceptions.taskexceptions.TaskBadRequestException;
import implementation.exceptions.taskexceptions.TaskNotFoundException;
import implementation.model.Task;
import implementation.repository.TaskRepository;
import implementation.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class TaskSpringJpa implements TaskService {

    @Autowired
    private TaskRepository taskRepository;


    @Override
    public Task createTask(Task task) {

        TaskEntity taskEntity = new TaskEntity();

        if (task.getTitle() != null) {
            throw new TaskApiException("The title must be empty");
        }
        if (task.getId() != null) {
            throw new TaskApiException("The id must be null");
        }
        if (task.getDescription() != null) {
            throw new TaskApiException("The description must be empty");
        }
        if (task.getStatus() != null) {
            throw new TaskApiException("The status must be empty");
        }

        return taskEntity.toTask();
    }

    @Override
    public Task updateTask(UUID taskID, Task task) {
        Optional<TaskEntity> taskEntity;

        if (task.getId() != null && !task.getId().equals(taskID)) {
            throw new TaskBadRequestException("ID of body doesn't match with URL parameter");
        }
        try {
            taskEntity = taskRepository.findById(taskID);
        } catch (Exception e) {
            throw new TaskApiException("Problem during updating task");
        }
        if (taskEntity.isEmpty()) {
            throw new TaskNotFoundException("Task not found with given ID");
        }
        Task updateTask;
        TaskEntity entity = new TaskEntity(task);
        entity.setTaskId(taskID);

        try {
            updateTask = taskRepository.save(entity).toTask();
        } catch (Exception e) {
            throw new TaskApiException("Problems during updating task");
        }
        return updateTask;

    }

    @Override
    public List<Task> getTask() {

        List<TaskEntity> taskEntities;
        try {
            taskEntities = taskRepository.findAll();
        } catch (Exception ex) {
            throw new TaskApiException("Problems occurred during getting tasks...");

        }
        return taskEntities
                .stream()
                .map(TaskEntity::toTask)
                .toList();

    }

    @Override
    public List<Task> getAllTasks() {

        List<TaskEntity> taskEntities = taskRepository.findAll();

        return taskEntities.stream()
                .map(TaskEntity::toTask)
                .toList();
    }



    @Override
    public void deleteTask(UUID id) {

        taskRepository.findById(id).orElseThrow(() ->
                new TaskNotFoundException("Task not found with given ID"));
        try {
            taskRepository.deleteById(id);
        } catch (Exception e) {
            throw new TaskApiException("Problem during deleting task");
        }
    }

    }
