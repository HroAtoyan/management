package exception;

public abstract class BadRequestException extends RuntimeException{

    public BadRequestException(String errorMessage) {
        super(errorMessage);
    }
}
