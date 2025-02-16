package com.java.program.string;

import java.util.Scanner;

public class DuplicateWords {
	public static void main(String[] args) {
		
		String string1="Big black bug bit a big black dog on his big black nose";
		int count;
		string1=string1.toLowerCase();
		String words[]=string1.split(" ");
		System.out.println("dupalicate words in given string ");
		for(int i=0;i<words.length;i++)
		{
			count=1;
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i].equals(words[j]))
				{
					count++;
					words[j]="0";
				}
			}
			if(count>1 && words[i]!="0")
			{
				System.out.println(words[i]);
			}
		}
		//taking user-input
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your string");
		String string2=scanner.nextLine();
		
		string2=string2.toLowerCase();
		
		String wrds[]=string2.split(" ");
		int c;
		for(int p=0;p<wrds.length;p++)
		{
			c=1;
			for(int q=p+1;q<wrds.length;q++)
			{
				if(wrds[p].equals(wrds[q]))
				{
					c++;
					wrds[q]="0";
				}
			}
			if(c>1 && wrds[p]!="0")
			{
				System.out.println(wrds[p]);
			}
		}
	}

}
