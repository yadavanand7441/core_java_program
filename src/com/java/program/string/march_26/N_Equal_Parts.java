package com.java.program.string.march_26;

public class N_Equal_Parts {
    public static void main(String[] args) {

        String str = "aaaabbbbcccc";
        int len = str.length();
        int n = 3;
        int temp = 0, chars = len / n;
        String eqlString[] = new String[n];
        if (len % n != 0) {
            System.out.println("string can't be divide into equals parts");
        } else {
            for (int i = 0; i < len; i = i + chars) {
                String part = str.substring(i,i+chars);
                eqlString[temp]=part;
                temp++;
            }
            System.out.println("equals part of string: ");
            for (int i=0;i<eqlString.length;i++)
            {
                System.out.println(eqlString[i]+" ");
            }
        }
    }
}
