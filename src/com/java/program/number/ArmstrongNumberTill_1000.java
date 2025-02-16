package com.java.program.number;

import java.util.Scanner;

public class ArmstrongNumberTill_1000 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0, r, num;

		for (int i = 0; i <= 1000; i++) {
			num = i;
			while (num > 0) {
				r = num % 10;
				sum = sum + r * r * r;
				num = num / 10;

			}
			if (sum == i) {
				System.out.print(i + " ");
			}
			sum = 0;

		}
	}

}
