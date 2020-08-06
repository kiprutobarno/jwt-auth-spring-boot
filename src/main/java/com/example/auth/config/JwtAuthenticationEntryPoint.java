package com.example.auth.config;

import java.io.IOException;
import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

/**
 * This class extends Spring’s AuthenticationEntryPoint class and overrides its
 * commence() method. It rejects every unauthenticated request by replying with
 * a 401 Error Code
 */
@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint, Serializable {
    private static final long serialVersionUID = -7858869558953243875L;

    @Override
    public void commence(HttpServletRequest req, HttpServletResponse res,
            AuthenticationException authenticationException) throws IOException {
        res.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
    }
}