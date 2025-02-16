package com.java.program.string;

import java.util.Scanner;

public class PermutationOfString {
	public static void printPermutation(String string, String permutation)
	{
		if(string.length()==0)
		{
			System.out.println(permutation);
		}

		for(int i=0;i<string.length();i++)
		{
			char ch = string.charAt(i);
			String remainingString= string.substring(0,i)+string.substring(i+1);
			printPermutation(remainingString,permutation+ch);
		}
	}

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter the string: ");
		String string =sc.nextLine();

		printPermutation(string,"");
	}

}
