package com.example.auth.service;

import java.util.ArrayList;

import com.example.auth.model.UserDAO;
import com.example.auth.model.UserDTO;
import com.example.auth.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * This service class implements the Spring Security UserDetailsService
 * interface
 * 
 * It overrides the loadByUsername() method that fetches user details from
 * database using the username
 * 
 * User details are also saved in the database via this service
 * 
 * It is also here that a user password is encrypted before storage
 */
@Service
public class JwtUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository repository;

    @Autowired
    private PasswordEncoder encoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDAO user = repository.findByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        return new User(user.getUsername(), user.getPassword(), new ArrayList<>());
    }

    public UserDAO create(UserDTO user) {
        UserDAO newUser = new UserDAO();
        newUser.setUsername(user.getUsername());
        newUser.setPassword(encoder.encode(user.getPassword()));
        return repository.save(newUser);
    }
}