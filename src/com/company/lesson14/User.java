package com.company.lesson14;

public class User {
    private String name;
    private int age;

    public User(String name,int age){
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {

        return "Mya name is " + name + ". I'm " + age + " years old.";
    }
}

