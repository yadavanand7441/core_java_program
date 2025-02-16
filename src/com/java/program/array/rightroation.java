package com.java.program.array;

import java.util.Scanner;

public class rightroation {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array: ");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("enter the element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("original elements: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		// logic for right-rotaion below
		
		int len=3,last,j;
		
		for(int i=0;i<len;i++)
		{
			last=a[a.length-1];
			for(j=a.length-1;j>0;j--)
			{
				a[j]=a[j-1];
			}
			a[0]=last;
		}
		System.out.print("after right rotation: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
