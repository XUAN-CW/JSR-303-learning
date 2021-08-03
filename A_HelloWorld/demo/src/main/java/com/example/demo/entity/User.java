package com.example.demo.entity;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

@Data
public class User {

    private Long id;

    @Email
    private String email;

    @Pattern(regexp = "^[\\u4e00-\\u9fa5]*$", message = "需要一个中文名")
    private String ChineseName;

    private Integer age;

    private String mobile;

}