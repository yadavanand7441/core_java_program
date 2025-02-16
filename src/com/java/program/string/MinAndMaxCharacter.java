package com.java.program.string;

public class MinAndMaxCharacter {
	public static void main(String[] args) {
		
		String str="grass is greener on the other side";
		int i,j,min,max;
		int fre[]=new int[str.length()];
		char minChar=str.charAt(0), maxChar=str.charAt(0);
		char string[]=str.toCharArray();
		
		for(i=0;i<str.length();i++)
		{
			for(j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j) && str.charAt(i)!=' ' && str.charAt(i)!='0')
				{
					fre[i]++;
					string[j]='0';
				}
			}
		}
		min=max=fre[0];
		for(i=0;i<fre.length;i++)
		{
			if(min>fre[i] && fre[i]!='0')
			{
				min=fre[i];
				minChar=string[i];
			}
			if(max<fre[i])
			{
				max=fre[i];
				maxChar=string[i];
			}
		}
		System.out.println("max character: "+maxChar);
		System.out.println("min character: " +minChar);
		
	}

}
