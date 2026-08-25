package com.java.program.string.august_26.practice1;

public class CharacterFrequencyCount {
    public static void main(String[] args) {

        String str="Anand Kumar";
        str= str.toLowerCase();
        int[] frequency = new int[str.length()];
        char[] stringArray = str.toCharArray();

        for (int i=0;i<stringArray.length; i++){
            frequency[i] =1;
            for (int j=i+1; j<stringArray.length; j++){
                if (stringArray[i]== stringArray[j]){
                    frequency[i]++;
                    stringArray[j]='0';
                }
            }
        }
        for (int i=0; i<frequency.length; i++) {
            if (stringArray[i] != '0' && stringArray[i] != ' ' /*&& frequency[i]>1 */) {
                System.out.println(stringArray[i] + " : " + frequency[i]);

            }
        }
    }
}
