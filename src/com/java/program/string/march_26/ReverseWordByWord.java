package com.java.program.string.march_26;

public class ReverseWordByWord {
    public static void main(String[] args) {

        String str="Anand Yadav";
        String[] splitString = str.split(" ");
        for (int i=splitString.length-1;i>=0;i--)
        {
            System.out.print(splitString[i]+" ");
        }
    }

}
