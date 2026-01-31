package com.java.program.collections.jan_26.collections.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapTreeSetMapExample {

    public static void main(String[] args) {

        SortedMap<Integer, String> students = new TreeMap<>();

        students.put(103, "Rahul");
        students.put(101, "Priya");
        students.put(105, "Amit");
        students.put(102, "Sita");

        for (Integer id:students.keySet())
        {
            System.out.println(id+" "+students.get(id));
        }
        System.out.println("*****************");
        System.out.println(students.firstKey());
        System.out.println(students.lastKey());
        System.out.println(students.headMap(102));
        System.out.println(students.tailMap(102));
        System.out.println(students.subMap(103,105));

    }
}
