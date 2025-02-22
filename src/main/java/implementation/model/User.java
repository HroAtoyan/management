package implementation.model;

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
public class User {

    

    public int sum(int a, int b) {
        return a + b;
    }

    public void f() {

    }



    private static final String NAME_EMPTY_MSG = "Name of the user cannot be null or empty";
    private static final String NAME_REGEX = "[A-Z][a-z]+";
    private static final String NAME_REGEX_MSG = "Name of user can contain letters and hyphen";

    private static final String SURNAME_EMPTY_MSG = "Surname of the user cannot be null or empty";
    private static final String SURNAME_REGEX = "[A-Z][a-z]+";
    private static final String SURNAME_REGEX_MSG = "Surname of user can contain letters and hyphen";


    private static final String EMAIL_EMPTY_MSG = "Email of the user cannot be null or empty";
    private static final String EMAIL_REGEX = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

    private static final String PASSWORD_EMPTY_MSG = "Password of the user cannot be null or empty";
    private static final String PASSWORD_REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$";

    @Schema(description = "unique identifier of the user", hidden = true)
    private UUID userId;


    @NotEmpty(message = NAME_EMPTY_MSG)
    @Pattern(regexp = NAME_REGEX, message = NAME_REGEX_MSG)
    @Schema(description = "Name of the user", defaultValue = "Jon")
    private String name;

    @NotEmpty(message = SURNAME_EMPTY_MSG)
    @Pattern(regexp = SURNAME_REGEX, message = SURNAME_REGEX_MSG)
    @Schema(description = "Surname of the user", defaultValue = "Liman")
    private String surname;

    @NotEmpty(message = EMAIL_EMPTY_MSG)
    @Pattern(regexp = EMAIL_REGEX)
    @Schema(description = "Email address of user", defaultValue = "jon@gmail.com")
    private String email;
    @NotEmpty(message = PASSWORD_EMPTY_MSG)
    @Pattern(regexp = PASSWORD_REGEX)
    @Schema(description = "Password of user", defaultValue = "123456789Pq")
    private String password;



}
