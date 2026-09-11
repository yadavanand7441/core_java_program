package com.java.program.string.august_26.practice2;

public class RepeatingCharacter {
    public static void main(String[] args) {
        String s="Anand Kumar";
        s=s.toLowerCase();
        int c=0;
        char[] str=s.toCharArray();

        for (int i=0;i<str.length;i++){
            for (int j=0;j<str.length;j++){
                if (str[i]==str[j]){
                    c++;
                    if (c==2){
                        System.out.println(str[i]);
                        return;
                    }
                    break;
                }

            }
        }
    }
}
