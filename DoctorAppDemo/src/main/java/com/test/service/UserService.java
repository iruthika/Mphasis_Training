package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.test.entity.User;
import com.test.repo.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Add a new user
    public User addUser(User user) {
        return userRepository.save(user);
    }

    // Get user by ID
    public User getUser(int id) {
        return userRepository.findById(id).orElse(null);
    }

    // Authenticate user by username and password
    public User authenticateUser(String username, String password) {
        return userRepository.findByUserNameAndPassword(username, password).orElse(null);
    }

    // Update user details
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    // Delete a user by ID
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}