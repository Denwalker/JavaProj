package com.company.lesson02;

public class Main {
    public static void main(String[] args) {
        User user = new User(32,"Denis", "passport");
        System.out.println("His name:\t"+user.getName()+"\nHis age: \t"+user.getAge());
        user.setName("Roma");
        user.getAge();
        System.out.println("His name:\t"+user.getName()+"\nHis age: \t"+user.getAge());


        User user1 = new User(30, "Alex");
        System.out.println("His name:\t"+user1.getName()+"\nHis age: \t"+user1.getAge());

        User user2 = new User();
        System.out.println("His name:\t"+user2.getName()+"\nHis age: \t"+user2.getAge());


    }
}
