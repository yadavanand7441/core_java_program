package com.java.program.collections.jan_26.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapToSetCovertExample {
    public static void main(String[] args) {
        Map<String, Integer> marks = new HashMap<>();

        marks.put("Rahul", 80);
        marks.put("Priya", 95);
        marks.put("Amit", 70);

        // 1. Keys ko Set me convert karna
        Set<String> keys = marks.keySet();
        System.out.println("Keys Set: " + keys);

        // 2. Entries ko Set me convert karna
        Set<Map.Entry<String, Integer>> entries = marks.entrySet();
        System.out.println("Entries Set: " + entries);

        // 3. Values ko Collection me lena
        System.out.println("Values Collection: " + marks.values());
    }

}
