package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    public Controller() {
    }

    @GetMapping("/api/hello")
    public ResponseEntity<String> work(){
        return new ResponseEntity<>("20011", HttpStatus.OK);
    }
}
