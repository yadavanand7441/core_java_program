package com.java.program.number;
public class AlternateArmstrongNumber
{
	public static void alternateArmstrong(int num)
	{
		int temp=0;
        for(int i=1;i<=num;i++)
        {
            if(checkArmstrong(i)==1)
            {
                temp++;
                if (temp % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        }
	}
	static int checkArmstrong(int n)
	{
		int number=n,r,sum=0;
		while(n>0)
		{
			r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}
		if(sum==number)
			return 1;
		else
			return 0;
	}
	public static void main(String []args)
	{
		System.out.print("alternate armstrong number : ");
		int totalNumberRange=1000;
		alternateArmstrong(totalNumberRange);
	}
}