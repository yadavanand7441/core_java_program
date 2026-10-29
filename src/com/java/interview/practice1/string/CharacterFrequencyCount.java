package com.java.interview.practice1.string;

public class CharacterFrequencyCount {
    public static void main(String[] args) {

        String str="Anand Kumar";
        str=str.toLowerCase();
        char[] arr = str.toCharArray();
        int frq[] = new int[arr.length];

        for (int i=0;i<arr.length;i++){
            frq[i] =1;
            for (int j=i+1;j<arr.length;j++){
                if (arr[i] ==arr[j]){
                    frq[i]++;
                    arr[j] ='0';
                }
            }
        }
        for (int i=0;i<frq.length;i++){
            if (arr[i]!='0' && arr[i]!=' '){
                System.out.println(arr[i]+": "+frq[i]);
            }
        }

    }
}
