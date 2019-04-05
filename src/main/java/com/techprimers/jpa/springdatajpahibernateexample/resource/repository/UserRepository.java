package com.techprimers.jpa.springdatajpahibernateexample.resource.repository;

import com.techprimers.jpa.springdatajpahibernateexample.resource.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <Users, Integer> {
}
