package com.java.interview.practice1.string;

public class StringRotation {
    public static void main(String[] args) {

        String str= "Anand";
        str= str.toLowerCase();

        String extractedString = str.substring(3) + str.substring(0, 3);
        System.out.println(extractedString);
    }
}
