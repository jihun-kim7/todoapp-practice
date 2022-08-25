package com.example.todo.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TodoController {

    @GetMapping("/")
    public String getIndex() {
        return "To-do Apllication!";
    }

    @GetMapping("/1")
    public String getIndex1() {
        return "To-do Application 1!";
    }

    @GetMapping("/feat/1")
    public String feat1() {
        return "feat1";
    }

    @GetMapping("/main/1")
    public String main1() {
        return "meat1";
    }


}
