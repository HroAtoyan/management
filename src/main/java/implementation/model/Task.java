package implementation.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Task {

    private UUID id;
    private UUID creatorId;
    private UUID performerId;
    private String title;
    private String description;
    private String status;
    private int numberOfTask;

}