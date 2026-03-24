package com.java.program.array.march_26;

public class ArrayElementsInAscendingOrder {
    public static void main(String[] args) {

        int a[] = {1, 12, 3, 11, 4, 25, 6, 7};
        System.out.println("original array");
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" ");
        }
        System.out.println("array elements in ascending order: ");
        int temp;
        for (int i=0;i<a.length;i++)
        {
            for (int j=i+1;j<a.length;j++)
            {
                if (a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" ");
        }
        }
    }
