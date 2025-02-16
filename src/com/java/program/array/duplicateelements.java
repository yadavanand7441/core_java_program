package com.java.program.array;

public class duplicateelements {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,1,4,2,8};
		
		System.out.print("original elements: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("duplicate elements: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(a[j]+" ");
				}
			}
		}
		// array elements in reverse order
		System.out.println();
		System.out.print("reverse elements: ");
		for(int i=a.length-1;i>0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}

}
