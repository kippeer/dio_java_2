package com.aulas.demo.herança;

public class Main {

    public static void main(String[] args){

        Employee employee = new Employee();
        Manager manager = new Manager();

        manager.setName("Joao");
        manager.setLogin("joaoz");
        manager.setPassword("123456");

        System.out.println(manager.getName());
        System.out.println(manager.getLogin());
        System.out.println(manager.getPassword());

    }
}
