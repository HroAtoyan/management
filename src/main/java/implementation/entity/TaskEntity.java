package implementation.entity;


import implementation.enums.Status;
import implementation.model.Task;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "task", schema = "task_management")
@Entity
public class TaskEntity {
    @Id
    @GenericGenerator(name = "generator", strategy = "uuid2")
    @GeneratedValue(generator = "generator")
    @Column(name = "task_id")
    private UUID taskId;
    @Column(name = "creator_id")
    private UUID creatorId;
    @Column(name = "performer_id")
    private UUID performerId;
    private String title;
    private String description;
    private Status status;
    @Column(name = "number_of_task")
    private int numberOfTask;

    public Task toTask() {
        Task task = new Task();
        task.setId(taskId);
        task.setCreatorId(creatorId);
        task.setPerformerId(performerId);
        task.setTitle(title);
        task.setStatus(status);
        task.setDescription(description);
        task.setNumberOfTask(numberOfTask);

        return task;
    }
    public TaskEntity(Task task){
        taskId = task.getId();
        creatorId = task.getCreatorId();
        performerId = task.getPerformerId();
        title = task.getTitle();
        status = task.getStatus();
        description = task.getDescription();
        numberOfTask = task.getNumberOfTask();

    }

}
