package com.java.program.string.august_26;

public class StringTest1 {
    public static void main(String[] args) {

        String a="Java";
        String b="Java";

        String a1 = new String("Java");
        String b1 = new String("Java");

        String s1 = "Java";
        String s2 = new String("Java");

        System.out.println(a==b);
        System.out.println(a.equals(b));

        System.out.println("================");
        System.out.println(a1==b1);
        System.out.println(a1.equals(b1));

        System.out.println("================");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode()+" "+s2.hashCode());

        String a2 = "Apple";
        String b2 = "Banana";

        System.out.println(a2.compareTo(b2));
    }
}
