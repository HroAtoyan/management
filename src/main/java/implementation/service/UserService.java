package implementation.service;

import implementation.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {

    User createUser(User user);

    void updateUser(UUID userId, User user);

    User getUserById(UUID userId);

    List<User> getAllUsers();

    void deleteUser(UUID userId);

}


