package com.java.program.string.august_26;

import java.util.HashMap;
import java.util.Map;

public class Character_Frequency_Count {
    public static void main(String[] args) {
      System.out.println("Frequency of characters: ");  

      String str="I am from Muzaffarpur Bihar";
      str=str.toLowerCase();
      Map<Character, Integer>freqMap = new HashMap<>();
      for(char ch: str.toCharArray()){
        if(ch!=' '){
            freqMap.put(ch, freqMap.getOrDefault(ch, 0)+1);
        }
      }
      System.out.println(freqMap);

      System.out.println("==================without map==================");
      char[] char1= str.toCharArray();
      for(int i=0;i<char1.length;i++){
        if(char1[i]==' '){
            continue;
        }
        boolean alreadyCounted =false;
        for(int j=0;j<i;j++){
            if(char1[i]==char1[j]){
                alreadyCounted=true;
                break;
            }
        }
        if(alreadyCounted){
            continue;
        }
        int count =0;
        for(int j=0;j<char1.length;j++){
            if(char1[i]==char1[j]){
                count++;
            }

        }
        System.out.println(char1[i]+": " +count);
      }
    }
    
}
