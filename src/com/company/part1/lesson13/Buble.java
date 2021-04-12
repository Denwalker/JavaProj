package com.company.part1.lesson13;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Buble {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        int num4 = Integer.parseInt(reader.readLine());
        int num5 = Integer.parseInt(reader.readLine());

        int[] array ={num1, num2, num3, num4, num5};
        boolean flag = false;
        int cash;

        while(!flag){
            flag = true;
            for (int i = 0; i < array.length - 1; i++) {
                if(array[i]>array[i+1]){
                    cash = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = cash;
                    flag = false;
                }
            }
        }
/*        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+" ");
        }*/

        System.out.println("minimal=\t"+array[0]);
    }

}
