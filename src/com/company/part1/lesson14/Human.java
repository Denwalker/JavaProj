package com.company.part1.lesson14;

public class Human {
    private String name;
    private String gender;
    private int age;
    private Human father;
    private Human mother;

    public Human(String name, String gender, int age, Human father, Human mother) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }

    public Human(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        if (this.father == null){
            return "Name: " + name + "; Age: " + age + "; Gender: " + gender;
        }
        else {
            return "Name: " + name + "; Age: " + age + "; Gender: " + gender + "; Father: " + father.name + "; Mother: " + mother.name;
        }
    }
}
