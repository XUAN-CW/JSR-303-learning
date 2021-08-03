package com.example.demo.entity;

import com.example.demo.validation.IsMobile;
import lombok.Data;



@Data
public class User {

    private Long id;

    private String ChineseName;

    private Integer age;

    private String email;

    @IsMobile
    private String mobile;

}