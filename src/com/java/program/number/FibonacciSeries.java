package com.java.program.number;

public class FibonacciSeries {
	public static void main(String[] args) {

		int num1 = 0, num2 = 1, num3, fib;
		System.out.print(num1 + " " + num2);
		for (int i = 2; i <= 10; i++) {
			num3 = num1 + num2;
			System.out.print(" " + num3);
			num1 = num2;
			num2 = num3;
		}
		System.out.println();
		System.out.println("===================");

		int n1 = 0, n2 = 1, n3;
		System.out.print("Fibonacci series till 10: "  + n1 + " " + n2);
		for (int i = 2; i <= 10; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}

	}

}
