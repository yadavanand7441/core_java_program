package com.java.program.array.practiceset1;

import java.util.Arrays;

public class RemoveOneDuplicateElements {
    public static void main(String[] args) {

        int a[]={12,3,5,6,3,25,12,56,78,6};
        boolean[] visit=new boolean[a.length];

        Arrays.sort(a);
        for (int i=0;i<a.length-1;i++)
        {
            if (a[i]==a[i+1])
            {
                visit[i]=true;

            }
        }
        System.out.println("after removing duplicate elements: ");
        for (int i=0;i<a.length;i++)
        {
            if (!visit[i])
            {
                System.out.println(a[i]+" ");
            }
        }
    }
}
