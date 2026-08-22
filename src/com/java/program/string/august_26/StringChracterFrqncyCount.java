package com.java.program.string.august_26;

public class StringChracterFrqncyCount {
    public static void main(String[] args) {

        String str= "Anand Kumar";
        str=str.toLowerCase();
        char[] stringArray = str.toCharArray();
        int[] freq = new int[str.length()];

        for(int i=0;i<stringArray.length;i++){
            freq[i]=1;
            for(int j=i+1;j<stringArray.length;j++){
                if (stringArray[i]==stringArray[j] & stringArray[i]!=' ') {
                    freq[i]++;
                    stringArray[j]='0';
                    
                }
            }
        }
        for(int i=0;i<freq.length;i++){
            if (stringArray[i]!='0' && stringArray[i]!=' ') {
                System.out.println(stringArray[i]+" : "+freq[i]);
                
            }
        }
        
    }
    
}
