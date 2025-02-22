package implementation.model;

import implementation.enums.Status;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
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

    private static final String TITLE_EMPTY_MSG = "Title of the task cannot be null or empty";
    private static final String TITLE_REGEX = "^[A-Z][a-zA-Z0-9\\s.,:;!?'\"()-]{1,99}$";
    private static final String TITLE_REGEX_MSG = "title of the task should be ^[A-Z][a-zA-Z0-9\\s.,:;!?'\"()-]{1,99}$";


    @Schema(description = "unique identifier of the task", hidden = true)
    private UUID id;

    @Schema(description = "creator id of the task", hidden = true)
    private UUID creatorId;


    @Schema(description = "performer id of the task", hidden = true)
    private UUID performerId;

    @NotEmpty(message = TITLE_EMPTY_MSG)
    @Pattern(regexp = TITLE_REGEX, message = TITLE_REGEX_MSG)
    @Schema(description = "tittle of the task", defaultValue = "Title Example")
    private String title;

    private String description;


    private Status status;

    @Schema(description = "number of the task", hidden = true)
    private int numberOfTask;



}