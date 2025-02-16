package com.java.program.string;

public class RemoveWhiteSpace {
	public static void main(String[] args) {
		
		String str="grass is greener than other side";
		
		//str=str.replaceAll("\\s+","");
		
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				System.out.print(str.charAt(i));
			}
		}
		System.out.println();
		
		char ch='_';
		str=str.replace(' ', ch);
		System.out.println(str);
	}

}
