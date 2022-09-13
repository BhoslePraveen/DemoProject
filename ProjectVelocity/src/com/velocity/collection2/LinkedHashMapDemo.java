package com.velocity.collection2;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("102", "Pune");
		map.put("104", "Banaglore");
		map.put("106", "Delhi");

		Set<String> set = map.keySet();
		for (String str : set) {

			System.out.println(str);
			System.out.println(map.get(str));
		}

	}

}
