package com.java.program.array;

public class ArrayElementsReverseOrder {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5};
        System.out.println("Original array: ");
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
        System.out.println("after reverse in order");
        for (int i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]+" ");
        }
    }
}
