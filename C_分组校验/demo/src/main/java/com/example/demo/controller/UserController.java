package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.group.AddGroup;
import com.example.demo.group.UpdateGroup;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Size;

@RestController
public class UserController {


    @PostMapping("/save")
    public User save(@Validated({AddGroup.class}) @RequestBody User user) {
        return user;
    }

    @PostMapping("/update")
    public User update(@Validated({UpdateGroup.class})@RequestBody User user) {
        return user;
    }

}