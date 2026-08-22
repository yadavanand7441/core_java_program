package com.java.program.string.august_26;

public class PrintDuplicateCahracterOnly {
    public static void main(String[] args) {
        String s="Anand Kumard";
        s=s.toLowerCase();
        int[] frq= new int[s.length()];
        char[] ch= s.toCharArray();

        for(int i=0;i<ch.length;i++){
            frq[i]=1;
            for(int j=i+1; j<ch.length;j++){
                if (ch[i]==ch[j] && ch[i]!=' ') {
                    frq[i]++;
                    ch[j]='0';
                }
            }
        }
        for(int i=0;i<frq.length;i++){
            if (ch[i]!='0' && ch[i]!=' ' && frq[i]>1) {
                System.out.println(ch[i]+" : "+frq[i]);
            }
        }
    }
    
}
