package com.java.program.number;

import java.util.Scanner;

public class PerfectSquare {
	public static double srt(int s)
	{
		double l;
		double sqrt=s/2;
		do
		{
			l=sqrt;
			sqrt=(l+(s/l))/2;
		}
		while(l-sqrt!=0);
		return sqrt;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a=sc.nextInt();
		System.out.println("square-root of "+a+": "+srt(a));
		
		/*
		 * int n=6; System.out.println("square-root of "+n+": "+sqrt(n)); double num=36;
		 * double sqrt = Math.sqrt(num); System.out.println(sqrt);
		 */
		
					
	}
	/*
	 * public static double sqrt(int n) { double t; double sqrt=n/2; do { t=sqrt;
	 * sqrt=(t+(n/t))/2; } while((t-sqrt)!=0); return sqrt; }
	 */
}
