package com.java.interview.practice1.string;

public class FirstRepeatingCharacter {
    public static void main(String[] args) {


        String str="Anand Kumar";
        str=str.toLowerCase();
        char[] arr=str.toCharArray();

        int count=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    count++;
                    if(count==1){
                        System.out.println("First repeating character: "+arr[i]);
                        return;
                    }
                    break;
                }
            }
        }
    }
}
