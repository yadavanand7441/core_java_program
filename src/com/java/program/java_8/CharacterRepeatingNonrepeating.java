package com.java.program.java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterRepeatingNonrepeating {
    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>(Arrays.asList("Anand Kumar", "Rahul Kumar", "Anand Mohan"));

        Map<Character, Long> frqCharct = stringList.stream().flatMap(str -> str.toLowerCase().chars().mapToObj(c -> (char) c))
                .filter(ch -> ch != ' ').collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
        System.out.println(frqCharct);

        Character nonrepeatingCharacter = stringList.stream().flatMap(str -> str.toLowerCase().chars().mapToObj(c -> (char) c))
                .filter(ch -> ch != ' ').filter(ch -> stringList.stream().flatMap(str -> str.toLowerCase()
                                .chars().mapToObj(c -> (char) c)).filter(c -> c != ' ').filter(c -> c.equals(ch))
                        .count() == 1).skip(0).findFirst().orElse(null);
        System.out.println("first non repeating character: "+nonrepeatingCharacter);

        Character c1 = stringList.stream().flatMap(str -> str.toLowerCase().chars().mapToObj(c -> (char) c))
                .filter(ch -> ch != ' ').filter(ch -> stringList.stream().flatMap(str -> str.toLowerCase()
                                .chars().mapToObj(c -> (char) c)).filter(c -> c != ' ').filter(c -> c.equals(ch))
                        .count() == 1).skip(1).findFirst().orElse(null);
        System.out.println("second non repeating character: "+c1);

        Character c2 = stringList.stream().flatMap(str -> str.toLowerCase().chars().mapToObj(c -> (char) c))
                .filter(ch -> ch != ' ').filter(ch -> stringList.stream().flatMap(str -> str.toLowerCase()
                                .chars().mapToObj(c -> (char) c)).filter(c -> c != ' ').filter(c -> c.equals(ch))
                        .count() > 1).skip(0).findFirst().orElse(null);
        System.out.println("First repeating character: "+c2);

        Map<Character,Long>frq=stringList.stream().flatMap(str->str.toLowerCase().chars().mapToObj(c->(char)c))
                .filter(ch->ch!=' ').collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println(frq);
    }
}
