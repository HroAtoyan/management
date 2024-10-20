package implementation.exceptions.userexceptions;


import exception.BadRequestException;

public class UserBadRequestException extends BadRequestException {

    public UserBadRequestException(String errorMessage) {
        super(errorMessage);
    }
}
