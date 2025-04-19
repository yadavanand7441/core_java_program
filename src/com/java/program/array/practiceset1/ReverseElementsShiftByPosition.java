package com.java.program.array.practiceset1;

public class ReverseElementsShiftByPosition {
    public static void main(String[] args) {

        int a[]={1,2,3,4,5};
        int last=0,first=a.length-1;
        while (last<first)
        {
            int tmp=a[last];
            a[last]=a[first];
            a[first]=tmp;
            last++;
            first--;
        }
        System.out.println("Elements shifted by position: ");
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
