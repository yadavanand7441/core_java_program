package com.java.program.number;

import java.util.Scanner;

public class AlternatePrimeNumber {
	public static void main(String[] args) {
		System.out.print("Alternate Prime Number: ");

		int alterNatePrime = 100;
		printAlterNatePrimeNumber(alterNatePrime);

		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many prime number you want alternative");
		int totalPrime = sc.nextInt();
		System.out.print("Alternate prime number: ");
		alterPrime(totalPrime);

	}

	static void printAlterNatePrimeNumber(int number) {
		int temp = 2;
		for (int i = 2; i <= number; i++) {
			if (checkPrime(i) == 1) {
				if (temp % 2 == 0) {
					System.out.print(i + " ");
				}
				temp++;
			}
		}

	}

	public static int checkPrime(int n) {
		int flag = 1;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				flag = 0;
				break;
			}
		}
		if (flag == 1)
			return 1;
		else
			return 0;
	}

	static void alterPrime(int total) {
		int temp = 2;
		for (int i = 2; i <= total; i++) {
			if (checkPrimeNumber(i) == 1) {
				if (temp % 2 == 0) {
					System.out.print(i + " ");
				}
				temp++;
			}
		}
	}

	static int checkPrimeNumber(int n) {
		int flag = 1;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				flag = 0;
				break;
			}
		}
		if (flag == 1)
			return 1;
		else
			return 0;
	}
}
