package com.java.program.array.practiceset1;

public class ThirdSmallestElements {
    public static void main(String[] args) {
        int a[]={45,23,56,78,24,67,89,48};//23,24,45,48,56,67,78,89
        int total=a.length;
        System.out.println("Third smallest elements: "+thirdSmallestElements(a,total));
    }

    public static int thirdSmallestElements(int[] a, int total) {
        int tmp;
        for (int i=0;i<a.length;i++)
        {
            for (int j=i+1;j<a.length;j++)
            {
                if (a[i]<a[j])
                {
                    tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
        }
        return a[total-3];
    }
}
