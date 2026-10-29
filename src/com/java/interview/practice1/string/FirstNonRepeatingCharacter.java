package com.java.interview.practice1.string;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str="Anand Kumar";
        str=str.toLowerCase();
        char[] arr=str.toCharArray();

        int count=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==' '){
                continue;
            }
            boolean isRepeating=false;
            for (int j=0;j<arr.length;j++){
                if( i!=j && arr[i]==arr[j]){
                    isRepeating=true;
                    break;
                }
            }
            if (!isRepeating){
                count++;
                if (count ==1){
                    System.out.println("First non repeating:"+arr[i]);
                }
            }
        }
    }
}
