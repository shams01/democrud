package com.employee.democrud.db.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="lastname")
    private String lastname;

    @Column(name="number")
    private Integer number;

    @Column(name="email")
    private String email;

    @Column(name="user_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime user_date;

    public Employee(){
    }

    public Employee(String name, String lastname, Integer number, String email, LocalDateTime user_date){
        this.name = name;
        this.lastname = lastname;
        this.number = number;
        this.email = email;
        this.user_date = user_date;
    }

    public Integer getId(){ return id; }

    public void setId(Integer id){
        this.id = id;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getUser_date() {
        return user_date;
    }

    public void setUser_date(LocalDateTime user_date) {
        this.user_date = user_date;
    }
}
