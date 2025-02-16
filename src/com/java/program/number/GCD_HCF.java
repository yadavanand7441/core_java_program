package com.java.program.number;

public class GCD_HCF {
	public static void main(String[] args) {
		
		int a=16,b=34,GCD=0,LCM;
		for(int i=1;i<a || i<b;i++)
		{
			if(a%i==0 && b%i==0)
			{
				GCD=i;
			}
		}
		System.out.println(GCD);
		LCM=(a*b)/GCD;
		System.out.println(LCM);
	}

}
