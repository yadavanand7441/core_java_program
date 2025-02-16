package com.java.program.number;

public class PrimeBetweenTwoNumber {
	public static void main(String[] args) {

		int n1 = 1, n2 = 100, x, l, i;
		System.out.print("Prime number: ");
		for (x = n1; x <= n2; x++) {
			for (i = 2; i < x; i = i + 1)
				if (x % i == 0) {

					break;
				}
			if (i == x) {
				System.out.print(x + " ");

			}

		}
		System.out.println();
		System.out.print("Prime number: ");
		int num1 = 1, num2 = 100, z, j;
		for (z = num1; z <= num2; z++) {
			for (j = 2; j < z; j = j + 1)
				if (z % j == 0) {
					break;
				}
			if (j == z) {
				System.out.print(z + " ");
			}

		}

	}

}
