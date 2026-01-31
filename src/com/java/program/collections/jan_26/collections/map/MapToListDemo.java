package com.java.program.collections.jan_26.collections.map;

import java.util.*;

public class MapToListDemo {
    public static void main(String[] args) {

        Map<String, Integer> marks = new HashMap<>();

        marks.put("Rahul", 80);
        marks.put("Priya", 95);
        marks.put("Amit", 70);

        List<String>keyList = new ArrayList<>(marks.keySet());
        Iterator<String> iterator = keyList.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        List<Integer> valueList = new ArrayList<>(marks.values());
        System.out.println("Values List: " + valueList);

        // 3. Entries ko List me convert karna
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(marks.entrySet());
        System.out.println("Entries List: " + entryList);



    }
}
