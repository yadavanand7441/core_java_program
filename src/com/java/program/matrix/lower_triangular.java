package com.java.program.matrix;

public class lower_triangular {
	public static void main(String[] args) {
		
		int a[][]= {{9,2,3},{4,5,6,},{7,5,9}};
		int row=a.length;
		int col=a[0].length;
		
		if(row!=col)
		{
			System.out.println("matrix should be square ");
			
		}
		else
		{
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					if(i>j)
					{
						System.out.print("0 ");
					}
					else
					{
						System.out.print(a[i][j]+" ");
					}
					
				}
				System.out.println();
			}
		}
	}

}
