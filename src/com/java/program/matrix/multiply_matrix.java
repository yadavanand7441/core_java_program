package com.java.program.matrix;

import java.util.Scanner;

public class multiply_matrix {
	public static void main(String[] args) {
		
/*		int a[][]= {{1,2,3},{1,2,3},{1,2,3}};
		int b[][]={{1,2,3},{1,2,3},{1,2,3}};
		int c[][]=new int[3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=0;
				for(int k=0;k<3;k++)
				{
					c[i][j]+=a[i][k]*b[k][j];
					
				}
				System.out.print(c[i][j]+" ");
				
			}
			System.out.println();
		}
	*/	
		//taking user input
		Scanner sc=new Scanner(System.in);
		int row,col;
		System.out.println("eneter the number of row of first matrix: ");
		row=sc.nextInt();
		System.out.println("eneter the number of col of first matrix: ");
		col=sc.nextInt();
		
		int arr[][]=new int[row][col];
		int brr[][]=new int[row][col];
		int crr[][]=new int[row][col];
		
		System.out.println("enter the elements of First matrix: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println();
		System.out.println("enter the elements of Second matrix: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				brr[i][j]=sc.nextInt();
			}
		}
		//multiply two matrix logic below
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				crr[i][j]=0;
				for(int k=0;k<3;k++)
				{
					crr[i][j]+=arr[i][k]*brr[k][j];
				}
				System.out.print(crr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
