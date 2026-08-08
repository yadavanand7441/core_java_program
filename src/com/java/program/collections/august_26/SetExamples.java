package com.java.program.collections.august_26;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {

        Set<Integer> marks = new HashSet<>();
        marks.add(23);
        marks.add(63);
        marks.add(93);
        marks.add(82);
        marks.add(21);

        System.out.println("====conversion set to List===");
        List<Integer> setToList = new ArrayList<>(marks);
        ListIterator<Integer> iterator =setToList.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("====conversion set to Map===");
        int index=0;
        Map<Integer,Integer>setToMap = new HashMap<>();
        Iterator<Integer>itr= marks.iterator();
        while (itr.hasNext()){
            setToMap.put(index,itr.next());
            index++;
        }
        for (Map.Entry mapResult: setToMap.entrySet()){
            System.out.println(mapResult.getKey()+" "+mapResult.getValue());
        }

    }
}
