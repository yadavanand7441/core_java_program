package com.java.program.array;

public class ElementsSwiftByPosition {
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		
		int l=0,r=a.length-1;
		while(l<r)
		{
			int temp=a[l];
			a[l]=a[r];
			a[r]=temp;
			l++;
			r--;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
