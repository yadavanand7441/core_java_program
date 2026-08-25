package com.java.program.string.august_26.practice1;

public class NonRepeatingCharacter {
    public static void main(String[] args) {

        String str="Anand Kumar";
         str= str.toLowerCase();
         char[] stringArray = str.toCharArray();
         int count =0;
         for (int i =0;i<stringArray.length;i++){
             if (stringArray[i] ==' '){
                 continue;
             }
             boolean isRepeated = false;
             for (int j=0;j<stringArray.length;j++){
                 if (i!=j && stringArray[i]==stringArray[j]){
                     isRepeated = true;
                     break;
                 }
             }
             if (!isRepeated){
                 count++;
                 if (count ==1){
                     System.out.println("First Non Repeating: "+stringArray[i]);
                 }
                 if (count ==2){
                     System.out.println("Second Non Repeating: "+stringArray[i]);
                 }
                 if (count ==3){
                     System.out.println("Third Non Repeating: "+stringArray[i]);
                 }
             }
         }
    }
}
