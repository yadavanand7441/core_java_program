package com.java.program.collections.jan_26.collections.map;

import java.util.HashMap;
import java.util.Map;


public class HashMapExample1 {
    public static void main(String[] args) {

        /**
         * 1. HashMap doesn't maintain the insertion order. see the below example
         */
        HashMap<Integer,Integer>products= new HashMap<>();
        products.put(3,430);
        products.put(6,63453);
        products.put(3,364);
        products.put(11,4735);
        products.put(9,825);

        System.out.println(products);
        for (HashMap.Entry m:products.entrySet())
        {
            System.out.println(m.getKey()+" "+ m.getValue());
        }
        System.out.println("===================================");
        /**
         * 2. HashMap doesn't allow duplicate key. if we still add duplicate key the value will be updated
         */
        products.put(3,4635);
        for (Map.Entry m1:products.entrySet())
        {
            System.out.println(m1.getKey()+" "+ m1.getValue());
        }

        System.out.println("===================================");
        /**
         * 2. HashMap allow only once null key
         */
        products.put(null,25242);
        products.put(null,3423);
        for (Map.Entry m2: products.entrySet())
        {
            System.out.println(m2.getKey()+" "+ m2.getValue());
        }

        System.out.println("========multiple======null values=====================");
        /**
         * 2. HashMap allow multiple null values
         */
        products.put(34,null);
        products.put(723,null);
        products.put(98,null);
        for (Map.Entry m3: products.entrySet())
        {
            System.out.println(m3.getKey()+" "+m3.getValue());
        }
        System.out.println(products.containsKey(34));
    }
}
