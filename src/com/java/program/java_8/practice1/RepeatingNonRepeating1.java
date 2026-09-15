package com.java.program.java_8.practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatingNonRepeating1 {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(Arrays.asList("Anand Kumar", "Rahul Kumar", "Anand Mohan"));

        Map<Character, Long> frqCount = stringList.stream().flatMap(str -> str.toLowerCase().chars().mapToObj(c -> (char) c))
                .filter(ch -> ch != ' ').collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
        System.out.println(frqCount);

        Character firstNonRepeatCharacter = stringList.stream().flatMap(str -> str.toLowerCase().chars().mapToObj(c -> (char) c))
                .filter(ch -> ch != ' ').filter(ch -> stringList.stream().flatMap(str -> str.toLowerCase()
                                .chars().mapToObj(c -> (char) c)).filter(c -> c != ' ').filter(c -> c.equals(ch))
                        .count() == 1).skip(1).findFirst().orElse(null);
        System.out.println("second non-repeat: " + firstNonRepeatCharacter);

        Character secondRepeat = stringList.stream().flatMap(str -> str.toLowerCase().chars().mapToObj(c -> (char) c))
                .filter(ch -> ch != ' ').filter(ch -> stringList.stream().flatMap(str -> str.toLowerCase()
                                .chars().mapToObj(c -> (char) c)).filter(c -> c != ' ').filter(c -> c.equals(ch))
                        .count() > 1).skip(1).findFirst().orElse(null);
        System.out.println("second repeat: " + secondRepeat);

        System.out.println("====================================================");
        String secondNonRepeatingWord = stringList.stream().flatMap(str -> Arrays.stream(str.split(" ")))
                .filter(ch -> stringList.stream().flatMap(str -> Arrays.stream(str.split(" ")))
                        .filter(c -> c.equals(ch)).count() == 1).skip(1).findFirst().orElse(null);
        System.out.println("second non-repeating word: " + secondNonRepeatingWord);

        String secondRepeatingWord = stringList.stream().flatMap(str -> Arrays.stream(str.split(" ")))
                .filter(ch -> stringList.stream().flatMap(str -> Arrays.stream(str.split(" ")))
                        .filter(c -> c.equals(ch)).count() >1).skip(1).findFirst().orElse(null);
        System.out.println("second repeating-word: " + secondRepeatingWord);


    }
}
