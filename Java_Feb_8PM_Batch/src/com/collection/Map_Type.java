package com.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Type {

	public static void main(String[] args) {

		Map<Integer, String> m = new HashMap<Integer, String>();

		m.put(1, "23");
		m.put(2, null);
		m.put(1, "Ishu");
		m.put(3, null);
		m.put(null, "raju");
		m.put(null, "23");

		System.out.println("Hashmap:" + m);

		int size = m.size();
		System.out.println("size :" + size);

		Set<Integer> keySet = m.keySet();
		System.out.println("keySet :" + keySet);

		Collection<String> values = m.values();
		System.out.println("values :" + values);

		boolean containsKey = m.containsKey(3);
		System.out.println("containsKey :" + containsKey);

		boolean containsValue = m.containsValue("ishu");
		System.out.println("containsValue :" + containsValue);

		Set<Entry<Integer, String>> entrySet = m.entrySet();
		System.out.println("entrySet" + entrySet);

		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}

	}
}
