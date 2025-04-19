package com.java.program.array.practiceset1;

public class LargestElements {
	public static void main(String[] args)
	{
		int arr[]={1,4,3,6,8,6,6,17,89,56};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<max)
			{
				max=arr[i];
			}
		}
		System.out.println("Max is: "+max);
	}
			
    
}
