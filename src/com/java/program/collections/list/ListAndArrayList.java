package com.java.program.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListAndArrayList {
	public static void main(String[] args) {

		List<Object> list = new ArrayList<>();
		list.add("collection framework");
		list.add(123);
		list.add("Tokyo");
		list.add(123.45f);
		list.add(3 > 4);

		System.out.println(list);

		Iterator<Object> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}

}
