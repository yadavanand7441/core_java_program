package com.java.program.array;

import java.util.Arrays;

public class even_odd_position {
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6};
		
		System.out.print("even position: ");
		for(int i=1;i<a.length;i=i+2)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("odd position: ");
		for(int i=0;i<a.length;i=i+2)
		{
			System.out.print(a[i]+" ");
		}
		
		int arr[]={1,2,3,4,5,3,2,1};
        Arrays.sort(arr);
        int  max=arr[0];
    
        for(int i=0;i<arr.length;i++)
        {
           
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);
	}

}
