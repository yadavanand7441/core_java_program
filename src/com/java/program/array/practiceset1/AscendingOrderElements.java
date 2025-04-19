package com.java.program.array.practiceset1;

import java.util.Scanner;

public class AscendingOrderElements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int arraySize=scanner.nextInt();

        int array[]=new int[arraySize];
        System.out.println("Enter the elements of array");
        for (int i=0;i<array.length;i++)
        {
            array[i]=scanner.nextInt();
        }
        System.out.println("original elements:");
        for (int i=0;i<array.length;i++)
        {
            System.out.println(array[i]+" ");
        }
        System.out.println("Elements after ascending order");
        int tmp;
        for (int i=0;i<array.length;i++)
        {
            for (int j=i+1;j<array.length;j++)
            {
                if (array[i]>array[j])
                {
                    tmp=array[i];
                    array[i]=array[j];
                    array[j]=tmp;
                }
            }
        }
        for (int i=0;i<array.length;i++)
        {
            System.out.println(array[i]+" ");
        }
    }
}
