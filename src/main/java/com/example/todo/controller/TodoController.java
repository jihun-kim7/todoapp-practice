package com.example.todo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @GetMapping("/")
    public String getIndex() {
        return "To-do Apllication!";
    }

    @GetMapping("/1")
    public String getIndex1() {
        return "To-do Application 1!";
    }
}
