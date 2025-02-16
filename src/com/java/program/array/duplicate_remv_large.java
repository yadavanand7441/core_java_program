package com.java.program.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class duplicate_remv_large {
	public static void main(String[] args) {
		
		Integer a[]= {10,70,30,90,20,20,30,40,70,50};
/*		//Arrays.sort(a);
		TreeSet<Integer>set=new TreeSet<>(Arrays.asList(a));
		for(Integer unique: set)
		{
			System.out.print(unique+" ");
		}
		System.out.println();
		String str="hello world";
		LinkedHashSet<Character>s=new LinkedHashSet<>();
		for(int i=0;i<str.length();i++)
		{
			s.add(str.charAt(i));
		}
		//TreeSet<String>s=new TreeSet<>();
		for(Character s1:s)
		{
			System.out.print(s1);
		}
		System.out.println();
		Integer ar[]= {10,70,30,90,20,20,30,40,70,50};
		
		Arrays.sort(ar);
		
		List<Integer>list=new ArrayList<>(Arrays.asList(ar));
		for(int i=0;i<list.size()-1;i++)
		{
			if(list.get(i)!=list.get(i+1))
			{
				System.out.print(list.get(i)+" ");
			}
		}
		System.out.println();
*/		
		
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

        System.out.println();
        int largest = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }

        }
        System.out.println("Largest elements: " + largest);
		
	}

}
