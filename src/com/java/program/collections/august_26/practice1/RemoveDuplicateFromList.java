package com.java.program.collections.august_26.practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class RemoveDuplicateFromList {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>(Arrays.asList(12,67,89,34,23,12,89));
        System.out.println("Remove Duplicate Elements in a List");

        for (int i=0;i<integerList.size();i++){
            ListIterator<Integer> listIterator = integerList.listIterator(i+1);
            while (listIterator.hasNext()){
                if (integerList.get(i).equals(listIterator.next())){
                    listIterator.remove();

                }
            }
        }
        System.out.println("List after duplicate removal: "+integerList);
    }
}
