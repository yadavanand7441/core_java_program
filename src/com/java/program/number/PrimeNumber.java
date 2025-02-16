package com.java.program.number;

public class PrimeNumber {
	public static void main(String[] args) {
		
		int num=37,flag=0;
		if(num==0 || num==1)
		{
			System.out.println("number should greater than 1 ");
		}
		else
		{
			for(int i=2;i<num/2;i++)
			{
				if(num%i==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println("Prime");
			}
			else
			{
				System.out.println("Not");
			}
		}
	}

}
