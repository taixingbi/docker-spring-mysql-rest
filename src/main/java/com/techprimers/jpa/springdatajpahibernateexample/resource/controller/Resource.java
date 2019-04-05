package com.techprimers.jpa.springdatajpahibernateexample.resource.controller;

import com.techprimers.jpa.springdatajpahibernateexample.resource.model.Users;
import com.techprimers.jpa.springdatajpahibernateexample.resource.repository.UserRepository;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Resource {

    private UserRepository usersRepository;

    public Resource(UserRepository usersRepository) {

        this.usersRepository = usersRepository;
    }

    @GetMapping("/users")
    public List<Users> all() {

        return usersRepository.findAll();
    }

    @GetMapping("/users/{id}")
    public String hello() {

        return "hello world";
    }

    @GetMapping("/create")
    public List<Users> users() {
        Users users = new Users();
        users.setId(2);
        users.setEmail("SamDi@gmail.com");
        users.setFirstName("Sam");
        users.setLastName("Di");

        usersRepository.save(users);

        return usersRepository.findAll();
    }



}
