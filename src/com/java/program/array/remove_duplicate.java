package com.java.program.array;

import java.util.Arrays;

public class remove_duplicate {
	
	public static void main(String[] args) {
		
		int a[]= {10,70,30,90,20,20,30,40,70,50};
		
		
		boolean[] visit = new boolean[a.length];
        Arrays.sort(a);
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                visit[i] = true;
                visit[i + 1] = true;

            }
        }
        for (int i = 0; i < a.length; i++) {
            if (!visit[i]) {
                System.out.print(a[i] + " ");
            }

        }
	}

}
