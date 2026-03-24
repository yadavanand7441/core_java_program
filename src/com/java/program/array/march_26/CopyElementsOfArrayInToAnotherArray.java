package com.java.program.array.march_26;

public class CopyElementsOfArrayInToAnotherArray {
    public static void main(String[] args) {


        int a[] = {1, 2, 3, 4, 5};
        int b[] = new int[a.length];
        System.out.println("array a: ");
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" ");
        }

        System.out.println("copy elements from array a into b: ");
        for (int i=0; i<b.length;i++)
        {
            b[i]=a[i];
            System.out.println(b[i]+" ");
        }
    }
}
