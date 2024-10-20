package implementation.exceptions.userexceptions;


import exception.ResourceNotFoundException;

public class UserNotFoundException extends ResourceNotFoundException {


    public UserNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
