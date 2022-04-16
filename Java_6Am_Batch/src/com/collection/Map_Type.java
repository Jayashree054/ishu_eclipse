package com.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Type {
	public static void main(String[] args) {

		Map<Integer, String> s = new HashMap<Integer, String>();

		s.put(1, "Ishu");
		s.put(2, "ramu");
		s.put(1, null);
		s.put(3, "56");
		s.put(4, null);
		s.put(null, "78");
		s.put(null, "Ishu");
		System.out.println("Hashmap: " + s);

		int size = s.size();
		System.out.println("size: " + size);

		Set<Integer> keySet = s.keySet();
		System.out.println("keySet : " + keySet);

		Collection<String> values = s.values();
		System.out.println("values : " + values);

		boolean containsKey = s.containsKey(2);
		System.out.println("containsKey : " + containsKey);

		boolean containsValue = s.containsValue("ramu");
		System.out.println("containsValue : " + containsValue);

		Set<Entry<Integer, String>> entrySet = s.entrySet();
		System.out.println("entrySet: " + entrySet);

		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}

	}
}
