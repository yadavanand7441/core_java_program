package com.java.program.array;

public class third_largest {
	static int third_largests(int total,int a[])
	{
		int temp=0;
		for(int i=0;i<total;i++)
		{
			for(int j=i+1;j<total;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[total-3];
	}
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7};
		int len=arr.length;
		System.out.println("third largest elements: "+third_largests(len,arr));
	}

}
