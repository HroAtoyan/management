package implementation.exceptions.taskexceptions;

public class TaskBadRequestException extends RuntimeException {
    public TaskBadRequestException(String message) {
        super(message);
    }
}
