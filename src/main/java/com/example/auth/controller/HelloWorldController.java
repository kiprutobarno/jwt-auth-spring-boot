package com.example.auth.controller;

import java.util.HashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping({ "/hello" })
    public ResponseEntity<?> helloWorld() {
        HashMap<String, String> map = new HashMap<>();
        map.put("message", "Hello World");
        return ResponseEntity.ok(map);
    }
}