package com.java.program.string;

import java.util.Scanner;

public class LargestSmallestString {
	public static void main(String[] args) {
		
		String string1="Hardships often prepare ordinary people for an extraordinary destiny";
		String word="",small="",large="";
		String words[]=new String[string1.length()];
		int length=0;
		string1=string1+" ";
		
		for(int i=0;i<string1.length();i++)
		{
			if(string1.charAt(i)!=' ')
			{
				word=word+string1.charAt(i);
			}
			else
			{
				words[length]=word;
				length++;
				word="";
			}
		}
		System.out.print(length);
		System.out.println();
		small=large=words[0];
		for(int k=0;k<length;k++)
		{
			if(small.length()>words[k].length())
			{
				small=words[k];
			}
			if(large.length()<words[k].length())
			{
				large=words[k];
			}
		}
		System.out.println("Smallest word: " + small);    
	    System.out.println("Largest word: " + large);
	    
	    //taking user-input
	    
	    String string2="";
	    Scanner scanner=new Scanner(System.in);
	    System.out.println("enter your string ");
	    string2=scanner.nextLine();
	    String wrd="",smlst="",lrgst="";
	    String wrds[]=new String[100];
	    int lngth=0;
	    
	   string2=string2+" ";
	   for(int i=0;i<string2.length();i++)
	   {
		   if(string2.charAt(i)!=' ')
		   {
			   wrd=wrd+string2.charAt(i);
		   }
		   else
		   {
			   wrds[lngth]=wrd;
			   lngth++;
			   wrd="";
			   
		   }
	   }
	   System.out.print(lngth);
	   System.out.println();
	   smlst=lrgst=wrds[0];
	   for(int k=0;k<lngth;k++)
	   {
		   if(smlst.length()>wrds[k].length())
		   {
			   smlst=wrds[k];
		   }
		   if(lrgst.length()<wrds[k].length())
		   {
			   lrgst=wrds[k];
		   }
	   }
	   System.out.println("smlst string: "+smlst);
	   System.out.println("lrgst string: "+lrgst);
	}

}
