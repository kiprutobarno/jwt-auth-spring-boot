package com.example.auth.model;

import java.io.Serializable;

/**
 * This class is required for storing the username and password recieved from
 * the user
 */
public class JwtRequest implements Serializable {
    private static final long serialVersionUID = 5926468583005150707L;
    private String username;
    private String password;

    /** default constructor needed for JSON parsing */
    public JwtRequest() {
    }

    public JwtRequest(String username, String password) {

    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}