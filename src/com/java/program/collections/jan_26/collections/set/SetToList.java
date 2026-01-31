package com.java.program.collections.jan_26.collections.set;

import java.util.*;

public class SetToList {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("ABCS");
        names.add("SHAFS");
        names.add("hgtsjd");

        List<String>stringList = new ArrayList<>(names);
        System.out.println(stringList);

    }
}
