package com.example.demo.entity;

import com.example.demo.group.AddGroup;
import com.example.demo.group.UpdateGroup;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@Data
public class User {


    @NotNull(message = "修改必须指定id",groups = {UpdateGroup.class})
    @Null(message = "新增不能指定id",groups = {AddGroup.class})
    private Long id;

    private String email;

    private String ChineseName;

    private Integer age;

    private String mobile;

}