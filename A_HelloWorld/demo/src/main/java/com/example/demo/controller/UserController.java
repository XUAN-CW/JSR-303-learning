package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Size;

@RestController
public class UserController {

    /**
     * Java Bean Validation，此处以 User 为例
     * @param user
     * @return java.lang.String
     */
    @PostMapping("/userValid")
    public User userValid(@Valid @RequestBody User user) {
        return user;
    }

}