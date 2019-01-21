package com.example.swing.services;

import com.example.swing.User.User;

import java.util.Optional;
import java.util.Set;

public interface UserService {

    Optional<User> getById(Long id);
    Set<User> getAll();
    User save(User user);
    void delete(User user);
    User update(User user);

}
