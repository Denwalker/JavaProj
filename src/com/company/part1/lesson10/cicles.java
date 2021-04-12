package com.company.part1.lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class cicles {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        System.out.println("Enter first number:");
        while (true){


            int num = Integer.parseInt(reader.readLine());
            if (num == -1) {
                break;
            }
            sum+=num;
            System.out.println("The result is:\t"+sum+"\nEnter one more number:\t");
        }

    }


}
