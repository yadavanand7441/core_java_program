package com.java.program.string;

public class VowelAndConsonat {
	public static void main(String[] args) {
		
		String str="This is a really simple sentence";
		int vC=0,cC=0;
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||
					str.charAt(i)=='u' )
			{
				vC++;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				cC++;
			}
		}
		System.out.println(vC);
		System.out.println(cC);
	}

}
