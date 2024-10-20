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

    UUID creatorId;

    UUID performerId;

    String title;

    String description;

    Enum Status;

    int numberOfTask;

}
