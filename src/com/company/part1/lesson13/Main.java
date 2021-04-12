package com.company.part1.lesson13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
/*        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a1 = Integer.parseInt(reader.readLine());
        int a2 = Integer.parseInt(reader.readLine());
        int a3 = Integer.parseInt(reader.readLine());
        int a4 = Integer.parseInt(reader.readLine());
        int a5 = Integer.parseInt(reader.readLine());

        int[] arrInt = new int[]{a1,a2,a3,a4,a5};

        for (int i = 0; i < arrInt.length; i++) {
            System.out.println(arrInt[i]);
        }

        int s = 0;
        for (int i = 0; i < arrInt.length; i++) {
            s+=arrInt[i];
        }
        System.out.println(s);*/


/*        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 29- i ;
        }

        for (int i = 0; i < arr.length; i++) {
            int p = i + 1;
            System.out.println(p + " = " + arr[i]);
        }*/

/*
        int[][] array = new int[2][3];

 for (int i = 0; i < array.length; i++) {
     for (int j = 0; j < array[i].length; j++) {
         System.out.print(array[i][j]);
     }
     System.out.println();
 }

 Arrays.sort(arr);

 for (int i = 0; i < arr.length; i++) {
     int p = i + 1;
     System.out.println(p + " = " + arr[i]);
 }
*/
        //int[] arr = initializeArray();
/*        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/
        // System.out.println(maxInt(arr));
        //maxInt(arr);
        String s = "8";
        for (int i = 0; i < 10; i++) {
            System.out.println(s);
            s+="\t"+8;
        }



    }

    public static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a1 = Integer.parseInt(reader.readLine());
        int a2 = Integer.parseInt(reader.readLine());
        int a3 = Integer.parseInt(reader.readLine());
        int a4 = Integer.parseInt(reader.readLine());
        int a5 = Integer.parseInt(reader.readLine());
        int a6 = Integer.parseInt(reader.readLine());
        int a7 = Integer.parseInt(reader.readLine());
        int a8 = Integer.parseInt(reader.readLine());
        int a9 = Integer.parseInt(reader.readLine());
        int a10 = Integer.parseInt(reader.readLine());

        int[] array = new int[]{a1,a2,a3,a4,a5,a6,a7,a8,a9,a10};
        return array;
    }

    public static int maxInt(int[] array){
        for (int i = 0; i < array.length; i++) {
            //System.out.println(array[i]);
        }
        int time;
        boolean flag = false;
        while (!flag){
            flag = true;
            for (int i = 0; i < array.length - 1; i++) {
                if(array[i] < array[i + 1]){
                    time = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = time;
                    flag = false;
                }
            }
        }
/*        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }*/
        return array[0];
    }
}
