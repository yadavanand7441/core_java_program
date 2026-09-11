package com.java.program.collections.august_26.pratice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class RemoveDuplicateFromList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 20, 40, 10, 50,40));
        for (int i=0;i<list.size();i++){
            ListIterator<Integer>listIterator = list.listIterator(i+1);
            while (listIterator.hasNext()){
                if (list.get(i).equals(listIterator.next())){
                    System.out.println(list.get(i));
                    listIterator.remove();
                }
            }
        }
        System.out.println(list);
    }
}
