package implementation.exceptions.userexceptions;


import exception.ApiException;

public class UserApiException extends ApiException {

    public UserApiException(String errorMessage) {
        super(errorMessage);
    }
}
