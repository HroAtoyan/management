CREATE TABLE Management.User
(

    account_id   UUID primary key not null,
    account_name varchar(64)      not null,
    account_type varchar(64)      not null
);


CREATE TABLE Management.User
(

    taskId   UUID primary key not null,
    creatorId UUID      not null,
    performerId UUID      not null,
    tittle varchar(64)     not null ,
    description varchar(64) not null ,
    Status varchar(64)     not null ,
    numberOfTask int     not null
);