package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class Controller {
    public Controller() {
    }

    @GetMapping("/hello")
    public static ResponseEntity<String> work(@RequestParam String s) throws Exception{
        if(!s.equals("200")) throw new Exception("hihi");
        return new ResponseEntity<>(s, HttpStatus.OK);
    }
}
