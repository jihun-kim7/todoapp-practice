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


    @GetMapping("/feat/2")
    public String feat2() {
        return "feat2";

    }

    @GetMapping("/feat/2-1")
    public String feat21() {
        return "feat2-1";
    }
    
    @GetMapping("/main/1")
    public String main1() {
        return "meat1";
    }


    @GetMapping("/main/11")
    public String main11() {
        return "meat11";
    }

    @GetMapping("/main/22")
    public String main22() {
        return "meat22";
    }

    @GetMapping("/main/33")
    public String main33() {
        return "meat33";
    }

    @GetMapping("/main/44")
    public String main44() {
        return "meat44";

    }

    @GetMapping("/main/55")
    public String main55() {
        return "meat55";
    }

}
