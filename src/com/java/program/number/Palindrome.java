package com.java.program.number;

public class Palindrome {
	public static void main(String[] args) {
		
		int num=123213;
		int sum=0,r,palin=num;
		while(num>0)
		{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(palin==sum)
		{
			System.out.println("Palindrome");
			
		}
		else
			System.out.println("not");
	}

}
