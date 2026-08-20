package com.java.program.collections.august_26;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElementPrint {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(10, 20, 30, 20, 40, 10, 50);
        System.out.println("Duplicate elements in the list:");
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    System.out.println(list.get(i));
                    break;
                }
            }
        }

        

    }
    
}
