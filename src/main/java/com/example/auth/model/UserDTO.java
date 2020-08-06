package com.example.auth.model;

/**
 * DTO is Data Transfer Object responsible for fetching data from the user and
 * passing it to the DAO layer to be inserted to the database
 */
public class UserDTO {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}