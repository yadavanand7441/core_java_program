package com.java.program.string.august_26;

public class ReverseWords {
    public static void main(String[] args) {
        String str="My Name Is Anand Yadav";
        String[] splitString= str.split(" ");
        for(int i=splitString.length-1;i>=0;i--){
            System.out.println(splitString[i]);
        }
    }
    
}
