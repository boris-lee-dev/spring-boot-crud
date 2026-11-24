package org.example.springbootcrudweb.springbootcrud.service;

import org.example.springbootcrudweb.springbootcrud.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    void save(User user);
    void update(Long id, User updatedUser);
    void delete(Long id);
}