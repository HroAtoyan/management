package implementation.controller;


import exception.ExceptionResponse;
import implementation.model.Task;
import implementation.service.TaskService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @Operation(summary = "Get list of tasks.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Tasks found", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = Task.class))
            }),
            @ApiResponse(responseCode = "500", description = "Error occurred while creating task", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionResponse.class))
            }),
    })

    @GetMapping()
    public @ResponseBody List<Task> getTask() {
        log.info("Received request to get list of tasks");
        List<Task> tasks = taskService.getTask();
        log.info("Tasks found");
        return tasks;

    }

    @Operation(summary = "Create task with specified parameters.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Task created", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = Task.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid request to sent endpoint", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionResponse.class))
            }),
            @ApiResponse(responseCode = "409", description = "Task already exists", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionResponse.class))
            }),
            @ApiResponse(responseCode = "500", description = "Error occured while creating task", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionResponse.class))
            }),
    })



    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody Task create(@RequestBody @Valid Task task) {
        log.info("Received request to create task");
        Task newTask = taskService.createTask(task);
        log.info("Task created successfully");
        return newTask;

    }

    @PutMapping("/{id}")
    public @ResponseBody Task update(@PathVariable UUID id, @RequestBody @Valid Task task) {
        log.info("Received request to update task with ID: {}", id);
        Task updatedTask = taskService. updateTask(id, task);
        log.info("User updated successfully");
        return updatedTask;
    }

    @Operation(summary = "Delete task with specified ID.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "204", description = "Task deleted successfully"),
            @ApiResponse(responseCode = "404", description = "Task not found", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionResponse.class))
            }),
            @ApiResponse(responseCode = "500", description = "Error occurred while deleting task", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionResponse.class))
            }),
    })
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable UUID id) {
        log.info("Received request to delete task with ID: {}", id);
        taskService.deleteTask(id);
        log.info("User deleted successfully");
    }
}
