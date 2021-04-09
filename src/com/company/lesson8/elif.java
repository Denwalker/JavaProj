package com.company.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class elif {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter some number:");
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        closeToFive(num1,num2);

    }

    public static void compare(int num){
        if (num>5){
            System.out.println("higher");
        }
        else if(num<5){
            System.out.println("lower");
        }
        else{
            System.out.println("equal");
        }
    }

    public static void checkinterval(int a){
        if(a>=20 && a<=50){
            System.out.println("Your number in the inteval from 20 to 50");
        }
        else{
            System.out.println("Your number NOT in the inteval from 20 to 50");
        }
    }


    public static void closeToFive(int a, int b){
        int l1 = 0;  // расстояние от a
        int l2 = 0;  // расстоание от b

        if(a<5){
            l1 = 5 - a;
        }
        else if (a>5){
            l1 = a-5;
        }
        if(b<5){
            l2 = 5 - b;
        }
        else if (b>5){
            l2 = b-5;
        }
        if(l1<=l2){
            System.out.print(a);
            System.out.println(" is closer to 5");
        }
        else{
            System.out.print(b);
            System.out.println(" is closer to 5");
        }
    }
}
