package com.java.program.collections.august_26.pratice2;

import java.util.*;
import java.util.stream.Collectors;

public class MaxElements {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 20, 40, 10, 50,40));

        Collections.sort(list);
        Integer max = list.get(list.size() - 2);
        System.out.println("Max: : "+max);

        list.stream().distinct().forEach(System.out::println);
        System.out.println("================");
        Integer firstMax = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        System.out.println(firstMax);

        System.out.println("=============");
        Set<Integer>setDup= new HashSet<>();
        list.stream().filter(e->setDup.add(e)).distinct().collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("==================================");
        List<String> stringList = new ArrayList<>(Arrays.asList("Anand Kumar", "Rahul Kumar", "Anand Mohan"));
        String firstNonRepeat = stringList.stream().flatMap(str -> Arrays.stream(str.split(" "))).filter(ch -> stringList.stream()
                        .flatMap(str -> Arrays.stream(str.split(" "))).filter(e -> e.equals(ch)).count()==1).skip(0).findFirst()
                .orElse(null);
        System.out.println(firstNonRepeat);

        String firstRepeat = stringList.stream().flatMap(str -> Arrays.stream(str.split(" "))).filter(ch -> stringList.stream()
                        .flatMap(str -> Arrays.stream(str.split(" "))).filter(e -> e.equals(ch)).count() > 1).skip(0).findFirst()
                .orElse(null);
        System.out.println(firstRepeat);

        System.out.println("=====================");
        Map<Character, Long> frequency = stringList.stream()
                .flatMap(str -> str.toLowerCase().chars().mapToObj(c -> (char) c))
                .filter(ch -> ch != ' ')
                .collect(Collectors.groupingBy(
                        ch -> ch,
                        Collectors.counting()
                ));

        System.out.println(frequency);

        System.out.println("==================");
        Character firstNonRepeats = stringList.stream()
                .flatMap(str -> str.toLowerCase().chars().mapToObj(c -> (char) c))
                .filter(ch -> ch != ' ')
                .filter(ch -> stringList.stream()
                        .flatMap(str -> str.toLowerCase().chars().mapToObj(c -> (char) c))
                        .filter(c -> c != ' ')
                        .filter(c -> c.equals(ch))
                        .count() == 1).skip(1)
                .findFirst()
                .orElse(null);

        System.out.println(firstNonRepeats);
    }
}
