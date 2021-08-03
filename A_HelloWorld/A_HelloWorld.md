---
title: A_HelloWorld
date: 2021-07-27 09:27:25
tags: 
categories: 
id: 1627349245352547200
---

# 概述

服务端开发在实现接口的时候，对于请求参数必须要有服务端校验以保障数据安全与稳定的系统运行。此处使用实现了 JSR-303 的 validation 框架进行参数校验

# [demo](demo) 

新建 spring boot 项目 

##  [pom.xml](demo\pom.xml) 

导入校验依赖：

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-validation</artifactId>
</dependency>
```

##  [DemoApplication.java](demo\src\main\java\com\example\demo\DemoApplication.java) 

##  [User.java](demo\src\main\java\com\example\demo\entity\User.java) 

在此校验一个字段，此字段长度最小为 2 ，最大为 5：

```java
    @Size(min = 2, max = 5)
    private String name;
```

##  [UserController.java](demo\src\main\java\com\example\demo\controller\UserController.java) 

在需要校验的地方加上 `@Valid` 注解以开启校验，如果不加，那么在 Java Bean 上添加了校验规则，也没有校验效果：

```java
    @PostMapping("/userValid")
    public User userValid(@Valid @RequestBody User user) {
        return user;
    }
```

## swagger 测试

http://localhost:8080/swagger-ui.html 

### 测试用例

```json
{
  "age": 0,
  "email": "string",
  "id": 0,
  "name": "123456"
}
```

### 测试结果

`name` 字段有六个字符，不符合要求，因此报错

```json
{
  "timestamp": "2021-08-02T12:12:34.597+00:00",
  "status": 400,
  "error": "Bad Request",
  "path": "/userValid"
}
```

# 常用api

本例中使用了[@Size](https://docs.jboss.org/hibernate/stable/beanvalidation/api/javax/validation/constraints/Size.html) 注解，其他常用注解可见于： [javax.validation.constraints](https://docs.jboss.org/hibernate/stable/beanvalidation/api/javax/validation/constraints/package-summary.html) 

# [发展过程](assets\references\springboot项目以注解方式实现后端数据验证.html) 

##   [JSR规范提案](https://jcp.org/en/jsr/summary?id=bean%20validation) 

JSR：Java Specification Requests的缩写，意思是Java 规范提案。是指向JCP(Java Community Process)提出新增一个标准化技术规范的正式请求。任何人都可以提交JSR，以向Java平台增添新的API和服务，JSR已成为Java界的一个重要标准。
本文介绍的Bean Validation 就是出自 JSR-303 规范提案。

## [jakarta.validation-api](https://docs.jboss.org/hibernate/stable/beanvalidation/api/overview-summary.html) 

Java 在2009年的 JAVAEE 6 中发布了 JSR303 以及 javax 下的 validation 包内容，这项工作的主要目标是为 java 应用程序开发人员提供基于 java 对象的约束（constraints）声明和对约束的验证工具（validator），约束元数据存储库和查询API，以及默认实现。
Java8开始，Java EE 改名为 Jakarta EE， javax.validation 相关的包移动到了jakarta.validation 的包下。所以大家看不同的版本的时候，会发现以前的版本包在 javax.validation 包下，java 8之后在 jakarta.validation 包下

```xml
        <dependency>
            <groupId>jakarta.validation</groupId>
            <artifactId>jakarta.validation-api</artifactId>
            <version>2.0.2</version>
        </dependency>
```

## [hibernate-validator](http://hibernate.org/validator/releases/6.1/) 

Hibernate-Validator框架是另外一个针对Bean Validation 规范的实现，它提供了 JSR-303 规范中所有内置 constraint 的实现，除此之外还有一些附加的 constraint。（注意：此处的Hibernate 不是 Hibernate ORM没有任何关系，hibernate-validator是Hibernate 基金会下的项目之一)

```xml
<dependency>
   <groupId>org.hibernate.validator</groupId>
    <artifactId>hibernate-validator</artifactId>
    <version>6.1.5.Final</version>
</dependency>
```

## spring-boot-starter-validation

定义 Validator 以及 SmartValidator 接口, 添加了 hibernate 的包, 提供 @Validated 支持 spring 环境,支持验证组的规范, 支持在 spring mvc 的环境中使用,提供了一系列的工厂类, 以及适配器

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-validation</artifactId>
</dependency>
```

如果已经引用了 spring-boot-starter-web ，就不要需要引用 spring-boot-starter-validation 了,但 Springboot2.3 以后的版本则需要单独引用