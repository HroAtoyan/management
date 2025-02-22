package implementation.springjpa;

import implementation.entity.TaskEntity;
import implementation.enums.Status;
import implementation.exceptions.taskexceptions.TaskApiException;
import implementation.exceptions.taskexceptions.TaskBadRequestException;
import implementation.exceptions.taskexceptions.TaskNotFoundException;
import implementation.model.Task;
import implementation.repository.TaskRepository;
import implementation.repository.UserRepository;
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
    @Autowired
    private UserRepository userRepository;

    @Override
    public Task createTask(Task task, String email) {
        if (task.getId() != null) {
            throw new TaskBadRequestException("The id must be null");
        }
       try {
           task.setCreatorId(userRepository.findByEmail(email).getUserId());
           int count = taskRepository.getLastCode();
           task.setNumberOfTask(count + 1);
           task.setStatus(Status.INITIATED);
           if (task.getPerformerId() != null) {
               UUID id = task.getPerformerId();
               userRepository.findById(id).orElseThrow(() ->
                       new TaskNotFoundException("The performer id is not found"));
           }
           return taskRepository.save(new TaskEntity(task)).toTask();
       } catch (Exception e) {
           if (e instanceof TaskNotFoundException) {
               throw (TaskNotFoundException) e;
           }
           throw new TaskApiException("Problem during creating task");
       }
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

    @Override
    public Task updatePerformer(UUID performerId, Task task) {
        Optional<TaskEntity> taskEntity;
        try {
            taskEntity = taskRepository.findById(performerId);
        } catch (Exception e) {
            throw new TaskApiException("Problem during updating performer user");
        }
        Task updatePerformer;
        TaskEntity entity = new TaskEntity(task);
        entity.setTaskId(performerId);
        try {
            updatePerformer = taskRepository.save(entity).toTask();
        } catch (Exception e) {
            throw new TaskApiException("Problems during updating performer user");
        }
        return updatePerformer;

    }
}
