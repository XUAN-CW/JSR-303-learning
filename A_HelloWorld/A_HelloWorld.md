---
title: A_HelloWorld
date: 2021-07-27 09:27:25
tags: 
categories: 
id: 1627349245352547200
---

# 依赖

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-validation</artifactId>
</dependency>
```

如果已经引用了 spring-boot-starter-web ，就不要需要引用 spring-boot-starter-validation 了,但 Springboot2.3 以后的版本则需要单独引用

# [深入了解](assets\references\springboot项目以注解方式实现后端数据验证.html) 

##  [JSR规范提案](https://jcp.org/en/jsr/summary?id=bean%20validation) 

JSR：Java Specification Requests的缩写，意思是Java 规范提案。是指向JCP(Java Community Process)提出新增一个标准化技术规范的正式请求。任何人都可以提交JSR，以向Java平台增添新的API和服务，JSR已成为Java界的一个重要标准。
本文介绍的Bean Validation 就是出自 JSR303 规范提案。

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

Hibernate-Validator框架是另外一个针对Bean Validation 规范的实现，它提供了 JSR 380 规范中所有内置 constraint 的实现，除此之外还有一些附加的 constraint。（注意：此处的Hibernate 不是 Hibernate ORM没有任何关系，hibernate-validator是Hibernate 基金会下的项目之一)

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

