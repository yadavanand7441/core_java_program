package com.java.program.array.march_26;

public class SumOfAllElements {
    public static void main(String[] args) {

        int a[]={1,2,3,4,5};
        int sum=0;
        for (int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("sum of elements: "+ sum);
    }
}
