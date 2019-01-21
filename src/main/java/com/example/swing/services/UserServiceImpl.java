package com.example.swing.services;

import com.example.swing.User.User;
import com.example.swing.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> getById(Long id) {
        Optional<User> userOpt = userRepository.findById(id);
        return userOpt;
    }

    @Override
    public Set<User> getAll() {
        Set<User> usersOpt =  (Set<User>) userRepository.findAll();
        return usersOpt;
    }

    @Override
    public User save(User userToSave) {
        userRepository.save(userToSave);
        return userToSave;
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }

    //A revoir
    @Override
    public User update(User user) {

        Optional<User> userToModify = userRepository.findById(user.getId());
        if(userToModify.isPresent()){
            userRepository.save(user);
            return user;
        } else {
            return null;
        }
    }
}
