package com.techprimers.jpa.springdatajpahibernateexample.resource.controller;

import com.techprimers.jpa.springdatajpahibernateexample.resource.model.Users;
import com.techprimers.jpa.springdatajpahibernateexample.resource.repository.UserRepository;
import com.techprimers.jpa.springdatajpahibernateexample.resource.service.UserService;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsersController {

    private UserRepository usersRepository;

    private final UserService userService = new UserService();


    public UsersController(UserRepository usersRepository) {

        this.usersRepository = usersRepository;
    }

    @GetMapping("/users/test") //works well
    public String test() {
        return new UserService().test();
    }

    @GetMapping("/users/")
    public List<Users> all_() {
        return userService.AllUsers();
    }

    @GetMapping("/users")
    public List<Users> all() {

        return usersRepository.findAll();
    }

    @GetMapping("/users/id/{id}")
    public Users findById(@PathVariable final int id ) {

        return usersRepository.findById(id);
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


    @PostMapping("/post")
    public Users addUser( Users post) {

        usersRepository.save(post);
        return post;
    }

}
