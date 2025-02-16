package com.java.program.number;

public class AsciiValue {
	public static void main(String[] args) {
		char ch='a';
		int asc=ch;
		System.out.println("Ascii value: "+asc);
		for(int i=0;i<=255;i++)
		{
			System.out.println("Ascii: "+(char)i+" = "+i);
		}
	}

}
