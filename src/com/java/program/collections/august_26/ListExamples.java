package com.java.program.collections.august_26;

import java.util.*;

public class ListExamples {

    public static void main(String[] args) {

        List<String> l1=new ArrayList<>();
        l1.add("Anand");
        l1.add("Mohan");
        l1.add("Sohan");
        l1.add("Rahul");
        l1.add("Moni");

        Iterator it= l1.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("============");
        Iterable<String>iterable=l1;
        for (String name : iterable) {
            System.out.println(name);
        }
        System.out.println("==set conversion from list===");
        List<Integer> l2= new ArrayList<>();
        l2.add(23);
        l2.add(45);
        l2.add(12);
        l2.add(12);
        l2.add(65);
        l2.add(41);

        Set<Integer>s1=new HashSet<>();
        for (int i=0;i<l2.size();i++){
            s1.add(l2.get(i));
        }
        System.out.println(s1);

        System.out.println("==map conversion from list===");
        Map<Integer,String>m1=new HashMap<>();
        for (int i=0;i<l1.size();i++)
        {
            m1.put(i, l1.get(i));
        }
        /*System.out.println(m1);*/
        for (Map.Entry map: m1.entrySet()){
            System.out.println(map.getKey()+" "+map.getValue());
        }
    }
}
