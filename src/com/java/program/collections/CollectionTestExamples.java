package com.java.program.collections;

import java.util.*;

public class CollectionTestExamples {
    public static void main(String[] args) {

        List<Integer>integerList = new ArrayList<>(Arrays.asList(12,67,89,34,23,12,89));
        System.out.println("Find Duplicate Elements in a List");

        for (int i=0;i<integerList.size();i++){
            ListIterator<Integer> iterator = integerList.listIterator(i+1);
            while (iterator.hasNext()){
                if (integerList.get(i).equals(iterator.next())){
                    System.out.println(integerList.get(i));
                    break;
                }
            }
        }

        System.out.println("Remove Duplicates from a List");
        for (int i=0; i<integerList.size();i++){
            ListIterator<Integer> listIterator = integerList.listIterator(i+1);
            while (listIterator.hasNext()){
                if (integerList.get(i).equals(listIterator.next())){
                    listIterator.remove();
                }
            }
        }
        System.out.println(integerList);

        System.out.println("Find the Highest Number in a List");
        Integer max = Collections.max(integerList);
        System.out.println(max);

        System.out.println("Find the 2nd Highest Number in a List");
        Collections.sort(integerList);
        Integer secondHighest = integerList.get(integerList.size() - 2);
        System.out.println(secondHighest);
    }
}
