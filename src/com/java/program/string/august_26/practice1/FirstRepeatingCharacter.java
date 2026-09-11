package com.java.program.string.august_26.practice1;

public class FirstRepeatingCharacter {
    public static void main(String[] args) {

        String string = "Anand Kumar";
        string = string.toLowerCase();
        char[] stringArray = string.toCharArray();
        int count = 0;
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = i+1; j < stringArray.length; j++) {
                if (stringArray[i] == stringArray[j]) {
                    count++;
                    if (count == 1){
                        System.out.println("First repeating character: "+stringArray[i]);
                        break;
                    }
                    if (count == 2){
                        System.out.println("Second repeating character: "+stringArray[i]);
                        return;
                    }
                    break;
                }
            }
        }
    }
}
