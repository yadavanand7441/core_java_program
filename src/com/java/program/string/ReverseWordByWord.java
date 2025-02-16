package com.java.program.string;

import java.util.Scanner;

public class ReverseWordByWord {
	/*
	 * public static String formatName ( String name ) throws Exception { String[]
	 * nameTokenized = name.split(" "); if (nameTokenized.length!=2){ throw new
	 * Exception("Incorrect Name"); } String firstName = nameTokenized[0]; String
	 * lastName = nameTokenized[1];
	 * 
	 * return lastName + ", " + firstName; }
	 */
	public static void main(String[] args) throws Exception {
		/*
		 * Scanner scan = new Scanner ( System.in);
		 * System.out.println(" Enter Name : "); String name = scan.nextLine();
		 * System.out.println("Input: " + name); System.out.println("Formated: " +
		 * formatName(name));
		 */
        
        
        System.out.println();

    	String str="Anand Kumar";
    	String[] string=str.split(" ");
    	for(int i=string.length-1;i>=0;i--)
    	{
    		System.out.print(string[i]+" ");
    	}
	}
	
		
	
	
}
