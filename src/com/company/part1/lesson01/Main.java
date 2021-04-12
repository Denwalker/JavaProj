package com.company.part1.lesson01;

public class Main {

    public static void main(String[] args) {
	    byte b = -127;
	    short s = 23000;
	    int i = 333333333;
	    long l = 1234567891234567891l;
	    boolean bool = false;
	    float f = 1.333234f;
	    double d = 1.333333333333333333;

	    int res = sum(5,55);
        System.out.println(res);

        System.out.println(sum(33,1111));

        System.out.println(convert("body"));

        printtwotimes("love");

        System.out.println(multi(13,13));

        int result = subt(99,1000);
        System.out.println(result);

        float div = div(33,11);
        System.out.println(div);

    }

    public static int sum(int number1, int number2){
        int res = number1 + number2;
        return res;
    }

    public static String convert(String str){
        String res = str +  "end";
        return res;
    }
    private static void printtwotimes (String str){
        System.out.println(str);
        System.out.println(str);
    }

    private static int multi(int number1, int number2){
        return number1 * number2;
    }

    private static int subt(int num1, int num2 ){
        int result = num2 - num1;
        return result;
    }

    public static float div(float num1, float num2){
        float res =  num1 / num2;
        return res;
    }

}
