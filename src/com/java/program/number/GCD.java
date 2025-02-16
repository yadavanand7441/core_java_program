package com.java.program.number;

public class GCD {
	public static void main(String[] args) {
		int num1 = 16, num2 = 34, hcf = 0, lcm = 0;

		for (int i = 1; i <= num1 || i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0)
				hcf = i;
		}
		System.out.println("The HCF: "+ hcf);
		// lcm=(num1*num2)/hcf;
		lcm = (num1 > num2) ? num1 : num2;
		while (true) {
			
				if (lcm%num1==0 && lcm%num2==0) {
					System.out.println("LCM: " + lcm); 
					break;

				}
				lcm++;
			}
		

	}
}
