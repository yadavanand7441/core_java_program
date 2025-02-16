package com.java.program.string;

public class SubsetOfString {
	public static void main(String[] args) {
		
		String string="FUNS";
		int len=string.length();
		int temp=0,c=0;
		String arr[]=new String[len*(len+1)/2];
		
		for(int i=0;i<len;i++)
		{
			for(int j=i;j<len;j++)
			{
				arr[temp]=string.substring(i,j+1);
				temp++;
				c++;
			}
		}
		System.out.println(c+" subset of given string is: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}

}
