package com.powerrviews.hs.hikariexample.controller;

import com.powerrviews.hs.hikariexample.entity.User;
import com.powerrviews.hs.hikariexample.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        log.info("Get all users");
        return userService.getAllUsers();
    }

    @PostMapping
    public User saveUser(@RequestBody User user) {
        log.info("Save user: {}", user);
        return userService.saveUser(user);
    }
}