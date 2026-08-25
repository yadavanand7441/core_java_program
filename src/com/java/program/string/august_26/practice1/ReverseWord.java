package com.java.program.string.august_26.practice1;

public class ReverseWord {
    public static void main(String[] args) {

        String str ="Anand Kumar Yadav";
        String[] splitString = str.split(" ");

        for (int i=splitString.length-1;i>=0;i--){
            System.out.print(splitString[i]+" ");
        }
    }
}
