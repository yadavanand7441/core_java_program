package com.java.program.java_8;

import java.util.*;

public class TestExamples {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(Arrays.asList("Anand Kumar", "Rahul Kumar", "Anand Mohan"));

        System.out.println("find first non-repeating character ");
        String firstNonRepeat = stringList.stream().flatMap(str -> Arrays.stream(str.split(" ")))
                .filter(ch -> stringList.stream().flatMap(str -> Arrays.stream(str.split(" ")))
                        .filter(c -> c.equals(ch)).count() == 1).skip(0).findFirst().orElse(null);
        System.out.println(firstNonRepeat);


        System.out.println("second non-repeating character ");
        String secondNonRepeat = stringList.stream().flatMap(str -> Arrays.stream(str.split(" ")))
                .filter(ch -> stringList.stream().flatMap(str -> Arrays.stream(str.split(" ")))
                        .filter(c -> c.equals(ch)).count() == 1).skip(1).findFirst().orElse(null);
        System.out.println(secondNonRepeat);

        System.out.println("max number using stream");
        List<Integer>integerList = new ArrayList<>(Arrays.asList(12,67,89,34,23,12,89));
        Integer highest2nd = integerList.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().orElse(0);
        System.out.println(highest2nd);


    }
}
