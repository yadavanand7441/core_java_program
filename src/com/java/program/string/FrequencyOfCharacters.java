package com.java.program.string;

public class FrequencyOfCharacters {
	public static void main(String[] args) {
		
		String str="Anand ";
		str= str.toLowerCase();
		
		int fre[]=new int[str.length()];
		char[] string=str.toCharArray();
		
		for(int i=0;i<string.length;i++)
		{
			fre[i]=1;
			for(int j=i+1;j<string.length;j++)
			{
				if(string[i]==string[j])
				{
					fre[i]++;
					string[j]='0';
				}
			}
		}
		System.out.println("character   | frequency  ");
		for(int i=0;i<fre.length;i++)
		{
			if(string[i]!=' ' && string[i]!='0')
			{
				System.out.println(string[i]+"  |  "+fre[i]);
			}
		}
	}

}
