package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class Controller {
    public Controller() {
    }

    @GetMapping("/hello")
    public ResponseEntity<String> work(){
        return new ResponseEntity<>("2002", HttpStatus.OK);
    }
}
