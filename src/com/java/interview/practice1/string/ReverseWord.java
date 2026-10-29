package com.java.interview.practice1.string;

public class ReverseWord {
    public static void main(String[] args) {

        String str ="Anand Kumar Yadav";
        String[] splitString = str.split(" ");

        for (int i=splitString.length-1;i>=0;i--){
            System.out.print(splitString[i]+" ");
        }
    }
}
