package com.java.program.string.march_26;

public class SwapTwoString {
    public static void main(String[] args) {

        String str1="anand",str2="yadav";
        str1=str1+str2;
        str2=str1.substring(0,str1.length()-str2.length());
        str1=str1.substring(str2.length());
        System.out.println("after swapping: "+str1+" "+str2);
    }
}
