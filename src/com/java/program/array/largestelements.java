package com.java.program.array;

import java.util.Arrays;

public class largestelements {
	public static void main(String[] args) {

		int a[] = { 1, 34, 23, 12, 67, 45, 36,78 };
		int max;
		max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];

		}
		System.out.println("max elements: " + max);
		
		
	}

}
