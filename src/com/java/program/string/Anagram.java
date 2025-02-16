package com.java.program.string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		
		String str1="Brag";
		String str2="Grab";
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.length()!=str2.length())
		{
			System.out.println("string length should be equal");
		}
		else
		{
			char[] s1 = str1.toCharArray();
			char[] s2 = str2.toCharArray();
			
			Arrays.sort(s1);
			Arrays.sort(s2);
			
			if(Arrays.equals(s1,s2)==true)
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not Anagram");
			}
		}
		
		//taking user input
		Scanner sc=new Scanner(System.in); 
	}

}
