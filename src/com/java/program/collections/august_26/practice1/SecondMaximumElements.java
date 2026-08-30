package com.java.program.collections.august_26.practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondMaximumElements {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>(Arrays.asList(12,67,89,34,23,12,89));
        Collections.sort(integerList);
        Integer secondMax = integerList.get(integerList.size() - 2);
        System.out.println(secondMax);

        
    }
}
