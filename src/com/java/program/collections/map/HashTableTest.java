package com.java.program.collections.map;

import java.util.*;

public class HashTableTest {
	public static void main(String[] args) {

		Hashtable<Integer, String> ht = new Hashtable();
		ht.put(104, "Sonu");
		ht.put(101, "Anand");
		ht.put(102, "Yadav");
		ht.put(103, "Kumar");
		
//		ArrayList list=new ArrayList<>();
//		list.add(ht);
//		list.forEach(e->{
//			if(e.equals(ht.get(103)))
//			{
//				System.out.println(e);
//			}
//		});
		
		for(Map.Entry m:ht.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		//System.out.println(ht);
	}

}
