package com.example.auth.services;

import java.util.List;
import com.example.auth.models.User;
import javax.transaction.Transactional;

import com.example.auth.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> reads() {
        return userRepository.findAll();
    }

    public void create(User user) {
        userRepository.save(user);
    }

    public User read(String email) {
        return userRepository.findByEmail(email);
    }

    public void delete(User user) {
        userRepository.delete(user);
    }
}