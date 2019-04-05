package com.techprimers.jpa.springdatajpahibernateexample.resource;


import javax.persistence.*;

@Entity
@Table(name = "users")
public class Users {

    @Id
    private Integer id;
    private String email;
    private String first_name;
    private String last_name;

    public Users() {
    }

    public Integer getId() {
        return id;
    }


    public String getEmail() {
        return email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//
//    public Integer getSalary() {
//        return salary;
//    }
//
//    public void setSalary(Integer salary) {
//        this.salary = salary;
//    }
//
//
//    public String getTeamName() {
//        return teamName;
//    }
//
//    public void setTeamName(String teamName) {
//        this.teamName = teamName;
//    }
}
