package com.java.program.array.march_26;

public class PrintDuplicateElements {
    public static void main(String[] args) {
        int a[]= {1,2,3,4,5,6,1,4,2,8};

        for(int i=0;i<a.length;i++)
        {
            for (int j=i+1;j<a.length;j++)
            {
                if (a[i]==a[j])
                {
                    System.out.println(a[j]+" ");
                }
            }
        }
    }
}
