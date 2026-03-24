package com.java.program.array.march_26;

public class ElementSwiftByPosition {
    public static void main(String[] args) {

        int a[]={1,2,3,4,5,2};

        int left=0,right=a.length-1;
        while(left<right)
        {
            int temp =a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;

        }
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+"");
        }

    }
}
