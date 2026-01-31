package com.java.program.collections.jan_26.collections.map;

import java.util.LinkedHashMap;

public class LinkedHashMapExample1
{
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> marks = new LinkedHashMap<>();
        marks.put("Rahul", 80);
        marks.put("Priya", 95);
        marks.put("Amit", 70);

        for (String name:marks.keySet())
        {
            System.out.println(name+ " "+ marks.get(name));
        }

        /**
         * LinkedHashMap main the insertion order. below examples
         */
        System.out.println("main ===insertion===order");
        marks.put("Sonu",37);
        for (String name:marks.keySet())
        {
            System.out.println(name+ " "+ marks.get(name));
        }

    }
}
