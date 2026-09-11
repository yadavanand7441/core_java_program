package com.java.program.string.august_26.practice2;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        String s="Anand Kumar";
        s=s.toLowerCase();
        char[] str=s.toCharArray();
        int c=0;

        for(int i=0;i<str.length;i++){
            if (str[i]==' '){
                continue;
            }
            boolean isRepeated =false;
            for (int j=0;j<str.length;j++){
                if(i!=j && str[i]==str[j] ){
                    isRepeated=true;
                    break;
                }
            }
            if (!isRepeated){
                c++;
                if (c==3){
                    System.out.println(str[i]);
                    return;
                }
            }
        }
    }
}
