package com.java.program.array;

import java.util.Arrays;

public class skip_duplicate_largest {
	public static void main(String[] args) {
		
		int a[]=new int[] {23,12,56,23,56,34,22,34,56,56,87,45,58,87};
		//12 22 23 23 34 34 45 56 56 56 56 58 87 87
		Arrays.sort(a);
		int b[]=new int[a.length];
		boolean visit[]=new boolean[a.length];
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				visit[i]=true;
				visit[i+1]=true;
			}
		}
		//System.out.println("B elements: ");
		for (int i = 0; i < a.length; i++)
	    {
            if (!visit[i]) 
			{
				b[i]=a[i];
                //System.out.println(b[i]+" ");
            }

        }
		System.out.println();
		System.out.print("Max Elements after skip duplicates: ");
		int max=b[0];
		for(int i=0;i<b.length;i++)
		{
			if(b[i]>max)
			{
				max=b[i];
			}
		}
		System.out.print(max);
		
	}

}
