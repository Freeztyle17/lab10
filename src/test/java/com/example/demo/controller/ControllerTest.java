package com.example.demo.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {
    @Test
    void work() {
        String ch = "700";
        assertThrows(Exception.class, () -> Controller.work(ch));
    }
}