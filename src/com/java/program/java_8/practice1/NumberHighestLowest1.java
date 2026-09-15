package com.java.program.java_8.practice1;

import java.util.*;
import java.util.stream.Collectors;

public class NumberHighestLowest1 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(23,11,57,34,78,89,4,78,89));
        int firstMax = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        System.out.println(firstMax);

        int secondMax = numbers.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().orElse(null);
        System.out.println(secondMax);

        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicateElements = numbers.stream().filter(e -> !seen.add(e)).distinct().collect(Collectors.toList());
        System.out.println(duplicateElements);

        //Integer lowestNumber = numbers.stream().min(Integer::compareTo).orElse(null);
        int lowesNumber = numbers.stream().sorted().skip(1).findFirst().orElse(null);
        System.out.println(lowesNumber);

    }
}
