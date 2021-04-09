package com.company.lesson12;

public class Dog {
    private String name;
    private int age;
    private String owner;
    public Dog(String name,int age,String owner){
        this.name=name;
        this.owner=owner;
        this.age=age;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner(){
        return owner;
    }
}
