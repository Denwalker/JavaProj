package com.company.part3.lesson01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];

        List<String> list = new ArrayList<>();
        list.add("Hello!");
        list.add("Hello!");
        list.add("Hello!");
        list.add("Hello!");
        list.add("World!");
        list.add("World!");
        list.add("World!");
        list.add("World!");
        System.out.println("List: " + list);


        Set<Integer> set = new  HashSet<>();
        set.add(1);
        set.add(2);
        set.add(2);
        System.out.println("Set: " + set);


        Map<Integer, String> map = new HashMap<>();
        map.put(1, "str1");
        map.put(2, "str2");
        map.put(3, "str3");
        map.put(4, "str4");
        map.put(5, "str5");
        System.out.println("Map:  " + map);
    }
}
