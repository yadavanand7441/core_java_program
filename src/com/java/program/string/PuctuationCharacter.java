package com.java.program.string;

public class PuctuationCharacter {
	public static void main(String[] args) {
		
		String str="He said, 'The mailman loves you.' I heard it with my own ears.";
		int c=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  str.charAt(i) == '?' || str.charAt(i) == '-' ||    
					str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':')
			{
				c++;
			}
		}
		System.out.println(c);
	}

}
