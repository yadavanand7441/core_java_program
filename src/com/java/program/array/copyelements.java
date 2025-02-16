package com.java.program.array;

public class copyelements {
	public static void main(String[] args) {
		
	
	int a[]= {1,2,3,4,5,6};
	int b[]=new int[6];
	System.out.print("original array is:");
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	System.out.println();
	System.out.print("copy elements: ");
	for(int i=0;i<a.length;i++)
	{
		b[i]=a[i];
		System.out.print(b[i]+" ");
	}
	}	

}
