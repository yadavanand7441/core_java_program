package com.java.program.number;

import java.util.Scanner;

public class NegativeBreakProgram 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int count = 0;
		int num,sum=0;

		System.out.println("Enter the  numbers");
		while (input.hasNextInt())
		{
			num = input.nextInt();
			if (num >= 0)
			{
				if (num > 90)
				{
					count++;
					sum=sum+num;
				}
			}
			else 
				break;
			/*
			 * { System.out.println("You entered " + num); break; }
			 */

		}
		System.out.println("sum of number that is grater than 90: "+sum+" "+count);

	}

}
