package com.java.program.collections.jan_26.collections.set;

import java.util.*;
import java.util.stream.Collectors;

public class SetToMapDemo {
    public static void main(String[] args) {

        Set<String>names = new HashSet<>();
        names.add("ABCS");
        names.add("SHAFS");
        names.add("hgtsjd");

        Iterator<String> itr = names.iterator();
        Map<Integer, String> maps = new HashMap<>();
        int index = 0;
        while (itr.hasNext()) {
            maps.put(index, itr.next());
            index++;
        }
        for(Map.Entry m:maps.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
