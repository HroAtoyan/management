package implementation.repository;


import implementation.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, UUID> {


    UserEntity getByEmail(String email);

    UserEntity getByEmailAndUserIdNot(String email, UUID userId);

    UserEntity findByEmail(String email);
}
