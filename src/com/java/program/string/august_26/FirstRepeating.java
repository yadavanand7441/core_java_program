package com.java.program.string.august_26;

public class FirstRepeating {

    public static void main(String[] args) {

        String s = "Anand Kumar";
        s = s.toLowerCase();

        char[] str = s.toCharArray();
        int c = 0;
        System.out.println("========repeating character======" + c);

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str.length; j++) {
                if (str[i] == str[j] && str[i] != ' ') {
                    c++;
                    if (c == 2) {
                        System.out.println(str[i]);
                        return;
                    }
                    break;
                }
            }
        }

    }

}
