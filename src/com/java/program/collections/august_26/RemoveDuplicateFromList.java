package com.java.program.collections.august_26;

import java.util.*;

public class RemoveDuplicateFromList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 20, 40, 10, 50));
        System.out.println("Original list: " + list);

        System.out.println("==========normal concept==========");
        List<Integer> normalList = new ArrayList<>(list);
        for (int i = 0; i < normalList.size(); i++) {

            for (int j = i + 1; j < normalList.size(); j++) {

                if (normalList.get(i).equals(normalList.get(j))) {
                    normalList.remove(j);
                    j--;
                }
            }
        }
        System.out.println("remove duplicate as normal: " + normalList);

        System.out.println("=========with the help of iterator!========");
        List<Integer> iteratorList = new ArrayList<>(list);
        Iterator<Integer> iterator = iteratorList.iterator();
        int index = 0;

        while (iterator.hasNext()) {
            Integer number = iterator.next();

            if (iteratorList.indexOf(number) != index) {
                iterator.remove();
            } else {
                index++;
            }
        }

        System.out.println("remove duplicate with iterator: " + iteratorList);

        System.out.println("====using ListIterator=======");
        List<Integer>listIterator=new ArrayList<>(list);
        ListIterator<Integer>integerListIterator =listIterator.listIterator();
        while (integerListIterator.hasNext()) {

            Integer current = integerListIterator.next();

            if (Collections.frequency(list, current) >1) {
                integerListIterator.remove();
            }
        }
        System.out.println("remove duplicate with ListIterator: " + listIterator);


        System.out.println("=========with the help of set!========");
        Set<Integer> set = new HashSet<>(list);
        System.out.println("List after removing duplicates: " + set);


    }

}
