package com.java.program.array.march_26;

public class LargestElements {
    public static void main(String[] args) {

        int a[]={23,1,2,45,26,67,34};
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if (a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
