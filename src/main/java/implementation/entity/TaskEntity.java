package implementation.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Table(name = "Task", schema = "Management")
@Entity
public class TaskEntity {
    @Id
    @GenericGenerator(name = "generator", strategy = "uuid2")
    @GeneratedValue(generator = "generator")
    private UUID taskId;
    private UUID creatorId;
    private UUID performerId;
    private String title;
    private String description;
    private Enum Status;
    private int numberOfTask;

    private void generateTaskNumber() {
        this.numberOfTask = UUID.randomUUID().hashCode();
    }

}
