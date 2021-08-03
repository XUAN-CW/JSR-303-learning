package com.example.demo.entity;

import lombok.Data;

import javax.validation.constraints.Size;

@Data
public class User {

    private Long id;

    @Size(min = 2, max = 5)
    private String name;

    private Integer age;

    private String email;

}