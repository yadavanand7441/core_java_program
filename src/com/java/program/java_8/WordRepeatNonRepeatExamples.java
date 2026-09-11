package com.java.program.java_8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordRepeatNonRepeatExamples {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(Arrays.asList("Anand Kumar", "Rahul Kumar", "Anand Mohan"));

        String firstNonRepeatingWord = stringList.stream().flatMap(str -> Arrays.stream(str.split(" "))).filter(ch -> stringList.stream().flatMap(str ->
                Arrays.stream(str.split(" "))).filter(e -> e.equals(ch)).count() == 1).skip(0).findFirst().orElse(null);
        System.out.println("First non repeating word: "+firstNonRepeatingWord);

        String secondNonRepeatingWord = stringList.stream().flatMap(str -> Arrays.stream(str.split(" "))).filter(ch -> stringList.stream()
                        .flatMap(str -> Arrays.stream(str.split(" "))).filter(e -> e.equals(ch)).count() == 1).skip(1)
                .findFirst().orElse(null);
        System.out.println("second non repeating: "+secondNonRepeatingWord);

        String firstRepeatingWord = stringList.stream().flatMap(str -> Arrays.stream(str.split(" "))).filter(ch -> stringList.stream()
                        .flatMap(str -> Arrays.stream(str.split(" "))).filter(e -> e.equals(ch)).count() > 1)
                .skip(0).findFirst().orElse(null);
        System.out.println("First repeating word: "+firstRepeatingWord);

        String secondRepeatingWord = stringList.stream().flatMap(str -> Arrays.stream(str.split(" "))).filter(ch -> stringList.stream()
                        .flatMap(str -> Arrays.stream(str.split(" "))).filter(e -> e.equals(ch)).count() > 1)
                .skip(1).findFirst().orElse(null);
        System.out.println("Second repeating word: "+secondRepeatingWord);
    }
}
