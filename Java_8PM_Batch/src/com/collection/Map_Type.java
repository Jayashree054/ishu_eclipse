package com.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Type {
	public static void main(String[] args) {
		Map<Integer, String> s = new HashMap<Integer, String>();

		s.put(1, "23");
		s.put(2, "76");
		s.put(2, "ishu");
		s.put(3, "null");
		s.put(4, "null");
		s.put(null, "raju");
		s.put(null, "Java");

		System.out.println("Hashmap : " + s);

		int size = s.size(); // length
		System.out.println("size : " + size);

		Set<Integer> keySet = s.keySet();
		System.out.println("keySet : " + keySet);

		Collection<String> values = s.values();
		System.out.println("values : " + values);

		boolean containsKey = s.containsKey(4);
		System.out.println("containsKey : " + containsKey);

		boolean containsValue = s.containsValue("Java");
		System.out.println("containsValue : " + containsValue);

		Set<Entry<Integer, String>> entrySet = s.entrySet();
		System.out.println("entrySet : " + entrySet);

		for (Entry<Integer, String> i : entrySet) {
			System.out.println(i);
		}

		
		Map<Integer, String> m = new Hashtable<Integer, String>();

		m.put(1, "23");
		m.put(2, "76");
		m.put(2, "ishu");
		m.put(4, null);
		
		System.out.println("HashTable :"+m);
		
		
	}
}
