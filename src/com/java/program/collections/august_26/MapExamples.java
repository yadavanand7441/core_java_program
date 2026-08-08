package com.java.program.collections.august_26;

import java.util.*;

public class MapExamples {
    public static void main(String[] args) {
        Map<Integer, String>studentMarks = new HashMap<>();
        studentMarks.put(56,"Tony");
        studentMarks.put(87,"Rahul");
        studentMarks.put(34,"Mohan");
        studentMarks.put(39,"Rani");
        studentMarks.put(94,"Rockey");

        System.out.println("===map result=======");
        for (Map.Entry students: studentMarks.entrySet())
        {
            System.out.println(students.getKey()+" "+students.getValue());
        }

        System.out.println("====conversion map to List===");
        List<Map.Entry<Integer,String>>mapToList = new ArrayList<>(studentMarks.entrySet());
        Iterator<Map.Entry<Integer, String>> itr=mapToList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(mapToList);

        System.out.println("====conversion map to Set===");
        Set<Map.Entry<Integer,String>>mapToSet =new HashSet<>((studentMarks.entrySet()));
        System.out.println(mapToSet);
    }



}
