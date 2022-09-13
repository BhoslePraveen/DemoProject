package com.velocity.collection2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(10, "Name-1");
		map.put(20, "Name-2");
		map.put(30, "Name-3");
		map.put(40, "Name-4");

		Set<Integer> keySet = map.keySet();
		Iterator<Integer> itr = keySet.iterator();
		while(itr.hasNext()) {
			int i = itr.next();
			System.out.println("keys: "+i);
			System.out.println("values:"+map.get(i));
		}

	}

}
