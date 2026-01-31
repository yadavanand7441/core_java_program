package com.java.program.collections.jan_26.collections.list;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListToMapDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Rahul", "Priya", "Amit");
        Map<Integer,String>maps = new HashMap<>();
        for (int i=0;i< names.size();i++)
        {
            maps.put(i,names.get(i));
        }

        for(Map.Entry m:maps.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
