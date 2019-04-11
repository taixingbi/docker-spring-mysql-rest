package com.techprimers.jpa.springdatajpahibernateexample.resource.repository;

import com.techprimers.jpa.springdatajpahibernateexample.resource.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends JpaRepository <Users, Integer> {
    //List<Person> findDistinctPeopleByLastnameOrFirstname(String lastname, String firstname);

    Users findById(Integer id );
}


//public interface UserRepository extends CrudRepository <Users, Integer> {
//    //List<Person> findDistinctPeopleByLastnameOrFirstname(String lastname, String firstname);
//
//
//
//}