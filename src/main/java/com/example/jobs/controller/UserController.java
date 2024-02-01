package com.example.jobs.controller;

import com.example.jobs.entities.User;
import com.example.jobs.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAllUsers() {
        User user = new User();
        user.setName(UUID.randomUUID().toString());
        userRepository.save(user);
        return userRepository.findAll();
    }
}
