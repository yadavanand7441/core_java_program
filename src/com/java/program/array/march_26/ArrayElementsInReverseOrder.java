package com.java.program.array.march_26;

public class ArrayElementsInReverseOrder {

    public static void main(String[] args) {

        int a[]={12,14,16,36,59};
        //sorting the elements of array
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
    }
}
