package com.java.interview.practice1.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateElementPrint {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(12,67,89,34,23,12,89));
        System.out.println("Duplicate elements in the list:");
        for (int i=0;i<integerList.size();i++){
            for (int j=i+1;j<integerList.size();j++){
                if(integerList.get(i)==integerList.get(j)){
                    System.out.println(integerList.get(i));
                    break;
                }
            }
        }
    }
}
