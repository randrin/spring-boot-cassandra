package com.fullstack.spring.cassandra.api.controller;

import com.fullstack.spring.cassandra.api.model.User;
import com.fullstack.spring.cassandra.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/saveUser")
    public String saveUser(@RequestBody User user) {
        userRepository.save(user);
        return "User saved successfully.";
    }

    @GetMapping("/getUsers")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/getUserByYearOld/{yearOld}")
    public List<User> getUserByYearOld (@PathVariable int yearOld) {
        return userRepository.findByYearOldGreaterThan(yearOld);
    }

    /*@GetMapping("/deleteUserById/{id}")
    public User deleteUserById (@PathVariable int id) {
        return userRepository.deleteById(id);
    }*/
}
