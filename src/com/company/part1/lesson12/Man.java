package com.company.part1.lesson12;

public class Man {
    private String name;
    private String wife;
    private int age;


    public Man(String name,int age,String husband){
        this.name=name;
        this.wife=husband;
        this.age=age;
    }

    public String getName() {
        return name;
    }
    public String getWife(){
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }
}
