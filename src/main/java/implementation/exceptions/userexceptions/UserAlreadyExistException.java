package implementation.exceptions.userexceptions;


import exception.ResourceAlreadyExistsException;

public class UserAlreadyExistException extends ResourceAlreadyExistsException {

    public UserAlreadyExistException(String errormessage) {
        super(errormessage);
    }
}
