package com.java.program.string;

import java.util.Scanner;

public class SwapTwoString {

	public static void main(String[] args) {
		
		String str1="anand",str2="yadav";
		str1=str1+str2;
		str2=str1.substring(0,str1.length()-str2.length());
		str1=str1.substring(str2.length());
		System.out.println("after swapping: "+str1+" "+str2);
		
		//using user-input
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your string ");
		String string1=sc.nextLine();
		String string2=sc.nextLine();
		
		System.out.println("before swap: "+string1+" "+string2);
		string1=string1+string2;
		string2=string1.substring(0,string1.length()-string2.length());
		string1=string1.substring(string2.length());
		System.out.println("after swap "+string1+" "+string2);
		
		//using function
		SwapTwoString swapTwoString=new SwapTwoString();
		String str3="anand",str4="kumar";
		System.out.println("before swapping two sring: "+str3+" "+str4);
		System.out.println(""+swapTwoString.swapTwoStrings(str3,str4));
		
	}
	static String swapTwoStrings(String s1,String s2)
	{
		String s3,s4="";
		s3=s1+s2;
		s4=s1.substring(0,s1.length()-s2.length());
		s3=s1.substring(s2.length());
		return (s3);
	}
}
