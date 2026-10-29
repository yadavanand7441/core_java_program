package com.java.interview.practice1.string;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String str="Anand Kumar";
        str=str.toLowerCase();
        char[] arr=str.toCharArray();
        int[] frq = new int[str.length()];
        for (int i=0;i<str.length();i++){
            frq[i]=1;
            for (int j=i+1;j<str.length();j++){
                if (arr[i]==arr[j]){
                    frq[i]++;
                    arr[j]='0';
                }
            }
        }
        for (int i=0;i<frq.length;i++){
            if (arr[i]!='0' && frq[i]==1 && arr[i]!=' '){
                System.out.println(arr[i]);
            }
        }

    }
}
