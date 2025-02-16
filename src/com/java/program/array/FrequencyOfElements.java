package com.java.program.array;

import java.util.Scanner;

public class FrequencyOfElements {
	public static void main(String[] args) {
		
		int a[]= {1,2,42,13,3,55,3,23,55,45,6,25,5,5,53,34,34,33,35};
		int count,visited=-1;
		int fre[]=new int[a.length];
		System.out.print("elements of array is: ");
		for(int i=0;i<a.length;i++)
		{
			
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					fre[j]=visited;
				}
			}
			if(fre[i]!=visited)
			{
				fre[i]=count;
			}
		}
		System.out.println("elements  | frequency ");
		System.out.println("----------------------");
		for(int i=0;i<fre.length;i++)
		{
			if(fre[i]!=visited)
			{
				System.out.println(a[i]+"  |  "+fre[i]);
			}
			
		}
		
		//taking user input
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int size=sc.nextInt();
		
		System.out.println("enter the elements of array: ");
		int ar[]=new int[size];
		int frq[]=new int[ar.length];
		int visit=-1;
		for(int i=0;i<size;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.print("given elements of array is: ");
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<ar.length;i++)
		{
			int c=1;
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					c++;
					frq[j]=visit;
					
				}
			}
			if(frq[i]!=visit)
			{
				frq[i]=c;
			}
		}
		System.out.println("elements  | frq");
		System.out.println("---------------");
		for(int i=0;i<frq.length;i++)
		{
			if(frq[i]!=visit)
			{
				System.out.println(ar[i]+" | "+ frq[i]);
			}
			
		}
		
	}

}
