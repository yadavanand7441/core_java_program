package com.java.program.string;

import java.util.Scanner;

public class TotalCharacter {
	public static void main(String[] args) {
		
		String str="Grass is greener than other side";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println(count);
		
		String str1="";
		int c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string !");
		str1=sc.nextLine();
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)!=' ')
			{
				c++;
			}
		}
		System.out.println(c);
	}

}
