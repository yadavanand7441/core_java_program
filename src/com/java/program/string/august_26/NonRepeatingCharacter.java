package com.java.program.string.august_26;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "Anand Kumar";
        str = str.toLowerCase();
        char[] charArray = str.toCharArray();

        System.out.println("=============================");
        int count = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ') {
                continue;
            }
            boolean isRepeateds = false;
            for (int j = 0; j < charArray.length; j++) {
                if (i != j && charArray[i] == charArray[j]) {
                    isRepeateds = true;
                    break;
                }
            }
            if (!isRepeateds) {
                count++;
                if (count == 1) {
                    System.out.println("Second non-repeating: " + charArray[i]);
                    break;
                }
            }
        }

    }
}
