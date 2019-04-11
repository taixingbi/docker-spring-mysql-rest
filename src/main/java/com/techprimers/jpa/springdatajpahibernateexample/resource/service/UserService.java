package com.techprimers.jpa.springdatajpahibernateexample.resource.service;
import com.techprimers.jpa.springdatajpahibernateexample.resource.repository.UserRepository;
import com.techprimers.jpa.springdatajpahibernateexample.resource.model.Users;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

public class UserService {
    @Autowired
    private UserRepository userRepository;


    public String test(){

        return "hunter";
    }


    public List<Users> getAllUsers(){
        List<Users> users= new ArrayList<>();
        userRepository.findAll()
                .forEach(users:: add);
        return users;
    }

    public List<Users> AllUsers() {
        System.out.println( "hunter " + userRepository.findAll() );
        return userRepository.findAll();
    }


}
