package com.java.program.string.march_26;

public class PalindromeString {
    public static void main(String[] args) {

        String str="abcba";
        boolean flag =true;
        for (int i=0;i<str.length()/2;i++)
        {
            if (str.charAt(i)!=str.charAt(str.length()-i-1))
            {
                flag=false;
                break;
            }
        }
        if (flag)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }

    }
}
