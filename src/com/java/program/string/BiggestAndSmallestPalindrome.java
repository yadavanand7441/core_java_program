package com.java.program.string;

public class BiggestAndSmallestPalindrome {
	public static void main(String[] args) {
		
		String str="Wow you own kayak";
		String word="",smallPalin="",bigPalin="";
		str=str.toLowerCase();
		String words[]=new String[str.length()];
		int temp=0,count=0;
		
		str = str.toLowerCase();
		str=str+" ";
		for(int i=0;i<str.length();i++)
		{
			words=str.split(" ");
			if(str.charAt(i)!=' ')
			{
				word=word+str.charAt(i);
			}
			else
			{
				words[temp]=word;
				temp=temp+1;
				word=" ";
			}
		}
		for(int i=0;i<temp;i++)
		{
			if(isPalindrome(words[i]))
			{
				count++;
			}
			if(count==1)
			{
				smallPalin=bigPalin=words[i];
			}
			if(smallPalin.length()>words[i].length())
			{
				smallPalin=words[i];
			}
			if(bigPalin.length()<words[i].length())
			{
				bigPalin=words[i];
			}
			if(count==0)
			{
				System.out.println("No Palindrome is present in given string ");
			}
			
		}
		System.out.println("small: "+smallPalin);
		System.out.println("Big: "+bigPalin);
		
		
		
	}
	public static boolean isPalindrome(String a)
	{
		boolean flag=true;
		for(int i=0;i<a.length()/2;i++)
		{
			if(a.charAt(i)!=a.charAt(a.length()-i-1))
			{
				flag=false;
				break;
			}
		}
		return flag;
	}

}
