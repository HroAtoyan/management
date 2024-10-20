package implementation.entity;


import java.util.UUID;


public class TaskEntity {

    UUID taskId;

    UUID creatorId;

    UUID performerId;

    String title;

    String description;

    Enum Status;

    int numberOfTask;


}
