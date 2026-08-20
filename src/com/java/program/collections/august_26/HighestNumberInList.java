package com.java.program.collections.august_26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HighestNumberInList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(40);
        list.add(35);
        list.add(67);
        list.add(23);
        list.add(89);
        list.add(21);
        System.out.println(Collections.max(list));

        System.out.println("==================");
        int max=list.get(0);
        for (int i=1;i<list.size();i++){
            if (list.get(i)>max){
                max= list.get(i);
            }
        }
        System.out.println(max);

        System.out.println("====2nd max=====");
        Collections.sort(list);
        int secondMax = list.get(list.size()-2);
        System.out.println(secondMax);
    }
}
