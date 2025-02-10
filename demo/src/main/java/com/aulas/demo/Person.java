package com.aulas.demo;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {

    public String name;
    public int age;

    public  Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
