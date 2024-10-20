package implementation.service;

import implementation.model.User;

import java.util.List;

public interface UserService {

    User createUser(User user);

    void updateUser(User user);

    User getUser(int id);

    List<User> getAllUsers();

    void deleteUser(int id);

}
