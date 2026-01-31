package com.java.program.collections.jan_26.collections.map;

import java.util.Hashtable;

public class HashTableExample1 {
    public static void main(String[] args) {

        Hashtable<String, Integer> marks = new Hashtable<>();

        // Insert karna
        marks.put("Rahul", 80);
        marks.put("Priya", 95);
        marks.put("Amit", 70);

        for (String name: marks.keySet())
        {
            System.out.println(name+" "+marks.get(name));
        }
        System.out.println("===================");
        //not allowed duplicates, null values, null key
        marks.put("Priya",64);
        marks.put("Rohan",null);
        marks.put(null,5242);
        System.out.println(marks);
    }
}
