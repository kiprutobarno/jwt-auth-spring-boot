package com.example.auth.model;

import java.io.Serializable;

/**
 * This is class creates a response that contains the JWT to be returned to the
 * user
 */
public class JwtResponse implements Serializable {
    private static final long serialVersionUID = -8091879091924046844L;
    private final String jwttoken;

    public JwtResponse(String jwttoken) {
        this.jwttoken = jwttoken;
    }

    public String getToken() {
        return this.jwttoken;
    }
}