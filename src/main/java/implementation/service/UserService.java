package implementation.service;

import implementation.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {

    User createUser(User user);

    User updateUser(UUID userId, User user);

    List<User> getUsers();

    User getUserById(UUID userId);

    List<User> getAllUsers();

    void deleteUser(UUID userId);

}


