package implementation.springjpa;

import implementation.entity.UserEntity;
import implementation.exceptions.userexceptions.UserAlreadyExistException;
import implementation.exceptions.userexceptions.UserApiException;
import implementation.exceptions.userexceptions.UserBadRequestException;
import implementation.exceptions.userexceptions.UserNotFoundException;
import implementation.model.User;
import implementation.repository.UserRepository;
import implementation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
public class    UserSpringJpa implements UserService {

    @Autowired

    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        UserEntity userEntity;
        if (user.getUserId() != null) {
            throw new UserBadRequestException("User ID must be null");
        }
        try {
            userEntity = userRepository.getByEmail(user.getEmail());
        } catch (Exception ex) {
            throw new UserApiException("Problems occurred during creating user...");
        }
        if (userEntity != null) {
            throw new UserAlreadyExistException("User already exists with given email");
        }

        return userEntity.toUser();
    }

    @Override
    public void updateUser(UUID userId, User user) {

        Optional<UserEntity> userEntity;
        UserEntity existingUser;

        if (user.getUserId() != null && !user.getUserId().equals(userId)) {
            throw new UserBadRequestException("ID of body doesn't match with URL parameter");
        }

        try {
            userEntity = userRepository.findById(userId);
            existingUser = userRepository.getByEmailAndUserIdNot(user.getEmail(), userId);
        } catch (Exception e) {
            throw new UserApiException("Problem during updating user");
        }

        if (userEntity.isEmpty()) {
            throw new UserNotFoundException("User not found with given ID");
        }

        if (existingUser != null) {
            throw new UserAlreadyExistException("User already exists with given email.");
        }

    }

    @Override
    public User getUserById(UUID userId) {

        Optional<UserEntity> userEntity;

            userEntity = userRepository.findById(userId);
            if (userEntity.isPresent()) {
                throw new UserNotFoundException("User not found with given ID");
            }
            return userEntity.get().toUser();
    }

    @Override
    public List<User> getAllUsers() {
        List<UserEntity> userEntity;

        try {
            userEntity = userRepository.findAll();
        }
        catch (Exception e) {
            throw new UserApiException("Problem wile getting users");
        }
        return userEntity.stream().map(UserEntity::toUser).toList();
    }

    @Override
    public void deleteUser(UUID userId) {

        userRepository.findById(userId).orElseThrow(() ->
                new UserNotFoundException("User not found with given ID"));
        try {
            userRepository.deleteById(userId);
        } catch (Exception e) {
            throw new UserApiException("Problem during deleting user");
        }
    }


    }

