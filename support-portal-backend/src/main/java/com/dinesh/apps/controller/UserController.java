package com.dinesh.apps.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @GetMapping("welcome")
    public String welcome() {
        return "Welcome to Support Portal Application !!";
    }
}
