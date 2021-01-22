package com.example.demo.domain;

import com.example.demo.controller.AbstractEntity;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "t_student")
public class Student extends AbstractEntity {

    private String name;
    private String  surname;
    private int age;
    private Date dob;
    private String classRoom;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }
}

