package com.company.lesson14;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
/*        Human granD1 = new Human("Stas","male", 70 );
        Human granD2 = new Human("Edgar","male", 72 );
        Human granM1 = new Human("Julia","female", 67 );
        Human granM2 = new Human("Marina","female", 76 );
        Human mom = new Human("Kristina","female", 36,granD2, granM2);
        Human dad = new Human("Valentin","male", 41,granD1, granM1);
        Human son = new Human("Makar","male", 16,dad, mom);
        Human doughter = new Human("Vika","female", 6,dad, mom);


        System.out.println(son.toString());
        System.out.println(doughter.toString());
        System.out.println(mom.toString());
        System.out.println(dad.toString());
        System.out.println(granM1.toString());
        System.out.println(granM2.toString());
        System.out.println(granD1.toString());
        System.out.println(granD2.toString());*/


/*        String[] arS1 = initString();
        int[] arIn = new int[5];

        for (int i = 0; i < arS1.length; i++) {
            arIn[i] = arS1[i].length();
            System.out.println(arIn[i]);
        }*/


        int[] arB = initializeArray();
        int[] arS1 = new int[5];
        int[] arS2 = new int[5];

        System.out.print("First small massive: ");
        for (int i = 0; i < arS1.length; i++) {
            arS1[i] = arB[i];
            System.out.print(arS1[i] + "\t");
        }

        System.out.print("\nSecond small massive: ");
        for (int i = 0; i < arS2.length; i++){
            arS2[i] = arB[i+5];
            System.out.print(arS2[i] + "\t");
        }

    }

    private static int[] initializeArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a1 =Integer.parseInt(reader.readLine());
        int a2 =Integer.parseInt(reader.readLine());
        int a3 =Integer.parseInt(reader.readLine());
        int a4 =Integer.parseInt(reader.readLine());
        int a5 =Integer.parseInt(reader.readLine());
        int a6 =Integer.parseInt(reader.readLine());
        int a7 =Integer.parseInt(reader.readLine());
        int a8 =Integer.parseInt(reader.readLine());
        int a9 =Integer.parseInt(reader.readLine());
        int a10 = Integer.parseInt(reader.readLine());

        int[] stArray = new int[10];
        stArray[0] = a1;
        stArray[1] = a2;
        stArray[2] = a3;
        stArray[3] = a4;
        stArray[4] = a5;
        stArray[5] = a6;
        stArray[6] = a7;
        stArray[7] = a8;
        stArray[8] = a9;
        stArray[9] = a10;

        return stArray;
    }

    private static void printArray(String[] array){
        for (int i = array.length; i > 0; i--) {
            System.out.println(array[i-1]);
        }

    }

    private static String[] initString() throws IOException {
        BufferedReader stReader = new BufferedReader(new InputStreamReader(System.in));
        String st1 = stReader.readLine();
        String st2 = stReader.readLine();
        String st3 = stReader.readLine();
        String st4 = stReader.readLine();
        String st5 = stReader.readLine();

        String[] ar = new String[5];

        ar[0] = st1;
        ar[1] = st2;
        ar[2] = st3;
        ar[3] = st4;
        ar[4] = st5;

        return ar;
    }

    private static int[] initInt() throws IOException {
        BufferedReader stReader = new BufferedReader(new InputStreamReader(System.in));
        int st1 = Integer.parseInt(stReader.readLine());
        int st2 = Integer.parseInt(stReader.readLine());
        int st3 = Integer.parseInt(stReader.readLine());
        int st4 = Integer.parseInt(stReader.readLine());
        int st5 = Integer.parseInt(stReader.readLine());

        int[] ar = new int[5];

        ar[0] = st1;
        ar[1] = st2;
        ar[2] = st3;
        ar[3] = st4;
        ar[4] = st5;

        return ar;
    }

}
