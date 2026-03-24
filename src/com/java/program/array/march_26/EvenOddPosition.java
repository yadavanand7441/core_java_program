package com.java.program.array.march_26;

public class EvenOddPosition {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};


        System.out.print("even position: ");
        for(int i=1;i<a.length;i=i+2)
        {
            System.out.print(a[i]+" ");
        }
        System.out.print("Odd position: ");
        for(int i=0;i<a.length;i=i+2)
        {
            System.out.print(a[i]+" ");
        }
    }
}
