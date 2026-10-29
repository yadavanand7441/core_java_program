package com.java.interview.practice1.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumElementsFromList {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>(Arrays.asList(12,67,89,34,23,12,89));
        Integer max = Collections.max(integerList);
        System.out.println(max);
    }
}
