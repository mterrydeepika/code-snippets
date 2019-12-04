package com.terry.proj1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Sample {
    public static void main(String[] args) {

        Map<String, String> myMap = new HashMap<>();
        myMap.put("Hi", "Terry");
        myMap.put("Hello", "Terry");
        //myMap.put("Hola", null);
        myMap.put("Bye", "Terry");
        for (String mv : myMap.keySet()) {
            System.out.println(mv + ":" +myMap.get(mv));
        }
        System.out.println("");
        myMap.putIfAbsent("Hola", "Sarah");
        for (String mv : myMap.keySet()) {
            System.out.println(mv + ":" +myMap.get(mv));
        }
        System.out.println("");
        myMap.put("Hola", null);
        for (String mv : myMap.keySet()) {
            System.out.println(mv + ":" +myMap.get(mv));
        }
        System.out.println("");
        myMap.putIfAbsent("Hola", "Dia");
        for (String mv : myMap.keySet()) {
            System.out.println(mv + ":" +myMap.get(mv));
        }
        System.out.println("");



    }
}
