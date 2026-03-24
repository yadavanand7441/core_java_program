package com.java.program.array.march_26;

import java.util.Scanner;

public class UserInputAscendingOrderElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of elements:");
        int arraySize=scanner.nextInt();

        int array[] = new int[arraySize];
        System.out.println("enter the elements of array");
        for(int i=0;i<arraySize;i++)
        {
            array[i]=scanner.nextInt();
        }
        System.out.println("print original array");
        for (int i=0;i<arraySize;i++)
        {
            System.out.println(array[i]+" ");
        }

        //ascending order elements
        System.out.println("ascending order elements");
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
