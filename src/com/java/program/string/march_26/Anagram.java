package com.java.program.string.march_26;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1="Brag";
        String str2="Grab";

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if (str1.length()!=str2.length())
        {
            System.out.println("string should be equal in length");
        }
        else
        {
            char[] string1= str1.toCharArray();
            char[] string2= str2.toCharArray();

            Arrays.sort(string1);
            Arrays.sort(string2);
            if(Arrays.equals(string1,string2)==true)
            {
                System.out.println("Both string are anagram ");
            }
            else
            {
                System.out.println("string are not anagram ");
            }

        }
    }
}
