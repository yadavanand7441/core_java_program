package com.java.program.string.march_26;

public class ReverseStringWithoutReverseFunction {
    public static void main(String[] args) {

        String str="Anand Yadav";
        System.out.println("reverse string: ");
        for (int i=str.length()-1;i>=0;i--)
        {
            System.out.print(str.charAt(i));
        }

    }
}
