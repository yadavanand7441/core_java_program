package com.java.program.string;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateCharacter {
	public static void main(String[] args) {
		
		String str="Anand Kumar";
		str=str.toLowerCase();
		char arr[]=str.toCharArray();
		int count;
		for(int i=0;i<str.length();i++)
		{
			count=1;
			for(int j=i+1;j<str.length();j++)
			{
				if(arr[i]==arr[j] && arr[i]!=' ')
				{
					count++;
					arr[j]='0';
				}
			}
			if(count>1 && arr[i]!='0')
			{
				System.out.print(arr[i]+" ");
			}
		}
		
	}
}
