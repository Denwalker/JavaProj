package com.company.part1.lesson12;

public class Woman {
    private String name;
    private String husband;
    private int age;


    public Woman(String name,int age,String husband){
        this.name=name;
        this.husband=husband;
        this.age=age;
    }

    public String getName(){
        return name;
    }
    public String getHusband(){
        return husband;
    }

    public void setHusband(String husband) {
        this.husband = husband;
    }
}
