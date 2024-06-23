package com.assignment.user.Service;

import com.assignment.user.Dao.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User registerUser(User user);

    List<User> getAllUsers();

    Optional<User> getUserById(Long id);

    User updateUser(User user);

    void deleteUser(Long id);
}
