package com.aulas.demo.herança;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Manager extends Employee{
    private String login;
    private String password;
    private double commission;
}
