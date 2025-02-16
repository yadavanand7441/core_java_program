package com.java.program.string;

public class N_Equal_Parts {
	public static void main(String[] args) {
		
		String string="aaaaabbbbccccsa";
		int len=string.length();
		int n=3,temp=0,chars=len/n;
		String[] eqlStr=new String[n];
		
		if(len%n!=0)
		{
			System.out.println("string can't be divide into "+n+" equal part");
		}
		else
		{
			for(int i=0;i<len;i=i+chars)
			{
				String parts=string.substring(i,i+chars);
				eqlStr[temp]=parts;
				temp++;
			}
		}
		System.out.println("equal parts string");
		for(int i=0;i<eqlStr.length;i++)
		{
			System.out.println(eqlStr[i]);
		}
	}

}
