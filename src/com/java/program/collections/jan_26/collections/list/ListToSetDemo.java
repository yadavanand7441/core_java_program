package com.java.program.collections.jan_26.collections.list;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSetDemo {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Rohan", "Monu", "Tony", "Anand");
        Set<String> stringSet = new HashSet<>();
        for (int i=0;i<stringList.size();i++)
        {
            stringSet.add(stringList.get(i));
        }
        System.out.println(stringSet);
    }
}
