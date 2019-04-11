package com.techprimers.jpa.springdatajpahibernateexample.resource.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Users {

    @Id
    private Integer id;
    private String email;
    private String first_name;
    private String last_name;
    private String name;

    public Users(String first_name, String last_name){
        super();
        this.name= first_name + " " + last_name;
    }


    public Users() {
    }

    //id
    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    //email
    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }


    //first name
    public String getFirst_name() {

        return first_name;
    }

    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }


    //last name
    public String getLast_name() {

        return last_name;
    }

    public void setLastName(String last_name) {

        this.last_name = last_name;
    }

}
