package com.company.part1.lesson01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String  name = b.readLine();
        String  salary = b.readLine();
        String  year = b.readLine();
        System.out.print(name);
        System.out.print(" будет получать ");
        System.out.print(salary);
        System.out.print(" через ");
        System.out.print(year);
        System.out.println(" лет");

    }
}
