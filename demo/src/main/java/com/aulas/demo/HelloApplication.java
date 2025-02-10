package com.aulas.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication {


    public static void main(String[] args){


        var male = new Person("Joao", 2);


         var female = new Person("Maria", 12);


         System.out.println("Male name:" + male.getName() + " age: " +male.getAge());
        System.out.println("Female name:" + female.getName() + " age: " +female.getAge());

    }
}