package com.java.program.string.august_26;

public class FirstRepeatingCharacter {
    public static void main(String[] args) {
        String str = "Anand Kumar";
        str = str.toLowerCase();
        char[] charArray = str.toCharArray();

        System.out.println("=================================");
        int count = 0;
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    count++;
                    if (count == 2) {
                        System.out.println("Second repeating: " + charArray[i]);
                        return;
                    }
                    break;
                }
            }
        }
        System.out.println("Second repeating character not found");

    }
}
