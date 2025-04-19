package com.java.program.array.practiceset1;

import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int arraySize=scanner.nextInt();

        int a[]=new int[arraySize];
        System.out.println("Enter the elements of array");
        for (int i=0;i<a.length;i++)
        {
            a[i]=scanner.nextInt();
        }
        System.out.println("original array");
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]+" ");
        }
        int min=a[a.length-1];
        for (int i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("Minimum is: "+min);
    }
}
