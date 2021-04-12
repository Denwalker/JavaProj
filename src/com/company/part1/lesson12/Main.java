package com.company.part1.lesson12;

public class Main {
    public static void main(String[] args) {
/*        Robot robot1 = new Robot("Zews",3,22);
        Robot robot2 = new Robot("Aid",2,12);

        System.out.println(robot2.fight(robot1.getPower()));

        Woman woman = new Woman("Vika",40);
        Cat cat = new Cat("Simba",1,"No owner");
        Dog dog = new Dog("Stimpy",6,"No owner");
        Fish fish = new Fish("Lily",16,"No owner");
        cat.setOwner(woman.getName());
        dog.setOwner(woman.getName());
        fish.setOwner(woman.getName());

        System.out.println(cat.getOwner());
        System.out.println(dog.getOwner());
        System.out.println(fish.getOwner());*/


        Woman woman = new Woman("Vika", 40, "no husband");
        Man man = new Man("Denis", 32, "no wife");

        man.setWife(woman.getName());
        woman.setHusband(man.getName());

        System.out.println(woman.getName()+" maried "+ woman.getHusband());
        System.out.println(man.getName()+" maried "+ man.getWife());
    }
}
