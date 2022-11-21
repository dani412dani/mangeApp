package com.example.manageAppback.controllers;

import com.example.manageAppback.models.User;
import com.example.manageAppback.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("")
    public List<User> getAll() {
        return this.userService.getAll();
    }
}
