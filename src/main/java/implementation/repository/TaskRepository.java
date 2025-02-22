package implementation.repository;


import implementation.entity.TaskEntity;
import implementation.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TaskRepository extends JpaRepository<TaskEntity, UUID> {


    @Query(nativeQuery = true, value = "select number_of_task from task_management.task order by number_of_task desc LIMIT 1")
    int getLastCode();

}
