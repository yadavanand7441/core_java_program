package com.java.program.string.august_26;

public class StringRotation {
    public static void main(String[] args) {

        String str = "Anand";
        str=str.toLowerCase();

        String rotated = str.substring(3) + str.substring(0, 3);

        System.out.println(rotated);
    }
}
