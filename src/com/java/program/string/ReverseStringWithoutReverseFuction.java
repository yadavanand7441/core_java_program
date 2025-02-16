package com.java.program.string;

import java.util.Scanner;

public class ReverseStringWithoutReverseFuction {
	static String rvrs(String string)
	{
		String rv="";
		for(int i=string.length();i>0;i--)
		{
			rv=rv+(string.charAt(i-1));
		}
		return rv;
	}
	public static void main(String[] args) {
	/*	String str = "Anand Yadav";
		for (int i = str.length(); i > 0; --i) {
			System.out.print(str.charAt(i - 1));
		}

		System.out.println();
		String str1 = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your string");
		str1 = sc.nextLine();
		for (int i = str.length(); i > 0; i--) {
			System.out.print(str1.charAt(i - 1));
		}
		System.out.println();
		// using while loop
		String str2 = "anand yadav";
		int i = str2.length();
		while (i > 0) {
			System.out.print(str2.charAt(i - 1));
			i--;
		}*/
		System.out.println();
		ReverseStringWithoutReverseFuction rev=new ReverseStringWithoutReverseFuction();
		String s = "anand";
		System.out.println("string after reverse: " + rev.reverse(s));
		
		// using user-input
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String string=sc.nextLine();
		System.out.println("reverse-string: "+rev.rvrs(string));
	}

	static String reverse(String s1) {
		String rev = "";
		for (int i = s1.length(); i > 0; i--) {
			rev=rev+(s1.charAt(i-1));
		}
		return rev;
	}

}
