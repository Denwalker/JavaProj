package com.company.part1.lesson12;

public class Robot {
    private String name;
    private int age;
    private int power;

    public boolean fight(int pow){
        if (this.power>pow){
            return true;
        }
        else{
            return false;
        }
    }

    public Robot(String name, int age, int power){
        this.name = name;
        this.age = age;
        this.power = power;
    }

    public int getPower(){
        return power;
    }


}
