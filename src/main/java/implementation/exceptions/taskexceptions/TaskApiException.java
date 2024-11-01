package implementation.exceptions.taskexceptions;

public class TaskApiException extends RuntimeException {
    public TaskApiException(String message) {
        super(message);
    }
}
