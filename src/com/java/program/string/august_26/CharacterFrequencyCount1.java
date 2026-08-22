package com.java.program.string.august_26;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequencyCount1 {
    public static void main(String[] args) {

        String str= "The grass is greener than other side";
        str= str.toLowerCase();

        System.out.println("Using map concept");
        Map<Character, Integer>frqCount = new HashMap<>();
        for (char ch: str.toCharArray()){
            if (ch!=' '){
                frqCount.put(ch, frqCount.getOrDefault(ch,0)+1);
            }
        }
        for (Map.Entry m: frqCount.entrySet()){
            System.out.println(m.getKey()+ ": "+m.getValue());
        }

        System.out.println("using normal approach");
        char[] charArray = str.toCharArray();

        int frq[] = new int[str.length()];
        for (int i=0;i<str.length();i++){
            frq[i]=1;
            for (int j=i+1;j<str.length();j++){
                if (charArray[i]==charArray[j] && charArray[i]!=' '){
                    frq[i]++;
                    charArray[j]='0';
                }
            }
        }
        for (int i=0;i<frq.length;i++){
            if (charArray[i]!='0' && charArray[i]!=' '){
                //if (frq[i]>1){
                    System.out.println(charArray[i] +" : "+frq[i]);

            }
        }

    }
}
