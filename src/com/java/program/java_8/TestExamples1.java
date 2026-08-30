package com.java.program.java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TestExamples1 {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(Arrays.asList("Anand Kumar", "Rahul Kumar", "Anand Mohan"));

        String firstRepeating = stringList.stream().flatMap(str -> Arrays.stream(str.split(" "))).filter(ch -> stringList.stream()
                        .flatMap(str -> Arrays.stream(str.split(" "))).filter(c -> c.equals(ch)).count() == 1).skip(0)
                .findFirst().orElse(null);
        System.out.println("First non repeating " + firstRepeating);

        String secondRepeat = stringList.stream().flatMap(str -> Arrays.stream(str.split(" "))).filter(ch -> stringList.stream()
                        .flatMap(str -> Arrays.stream(str.split(" "))).filter(c -> c.equals(ch)).count() == 1).skip(1)
                .findFirst().orElse(null);
        System.out.println("Second non repeat: " + secondRepeat);

        System.out.println("===========max number using stream============");
        List<Integer> integerList = new ArrayList<>(Arrays.asList(12, 67, 89, 34, 23, 12, 89, 67));
        Integer firstMax = integerList.stream().sorted(Comparator.reverseOrder()).skip(0).findFirst().orElse(null);
        System.out.println("First max: " + firstMax);

        Integer secondMax = integerList.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        System.out.println("Second Max: " + secondMax);

        System.out.println("===========duplicate number using stream============");
        Set<Integer> seen = new HashSet<>();
        integerList.stream().filter(e->seen.add(e)).distinct().collect(Collectors.toList()).forEach(System.out::println);
        //System.out.println("Duplicate numbers: " + duplicateNumbers);
    }
}
