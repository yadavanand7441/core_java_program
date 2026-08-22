package com.java.program.string.august_26;

public class NoDuplicateCharacterString {
    public static void main(String[] args) {
        String s="Anand Kumar";
        s=s.toLowerCase();
        char[] ch= s.toCharArray();

        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if (ch[i]==ch[j] && ch[i]!=' ') {
                    ch[j]='0';
                }
            }
        }
        for(int i=0;i<ch.length;i++){
            if(ch[i]!='0'){
                System.out.println(ch[i]);
            }
        }
    }
    
}
