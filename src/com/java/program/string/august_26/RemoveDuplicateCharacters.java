package com.java.program.string.august_26;

import java.util.Arrays;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        
        String str= "Anand Kumar";
        str=str.toLowerCase();
        char[] ch= str.toCharArray();

        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(ch[i]==ch[j] && ch[i]!=' '){
                    ch[j]='0';
                }
            }
        }
        for(int i=0;i<ch.length;i++){
            if(ch[i]!='0'){
                System.out.println(ch[i]);
            }
        }

        System.out.println("===========with new approach============");
        boolean[] visit = new boolean[ch.length];
        for(int i=0;i<ch.length-1;i++){
            if(ch[i]==ch[i+1]){
                visit[i]=true;
                visit[i+1]=true;
            }
            
        }
        for(int i=0;i<ch.length;i++){
            if(!visit[i] && ch[i]!='0'){
                System.out.print(ch[i]+" ");
            }
        }

    }
    
}
