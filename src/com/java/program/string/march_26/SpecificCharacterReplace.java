package com.java.program.string.march_26;

public class SpecificCharacterReplace {
    public static void main(String[] args) {

        String str = "Anand Kumar Yadav";
        String part[]= str.split(" ");
        String result=String.join("_",part);
        System.out.println(result);

        //using replace functions
        char ch='_';
        String replace = str.replace(' ', ch);
        System.out.println(replace);

    }
}
