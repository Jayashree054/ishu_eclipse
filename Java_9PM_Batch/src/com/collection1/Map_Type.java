package com.collection1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Type {

	public static void main(String[] args) {

		Map<String, Integer> m = new HashMap<String, Integer>();

		m.put("A", 23);
		m.put("B", null);
		m.put("A", null);
		m.put(null, 23);
		m.put(null, 45);

		System.out.println("HashMap : " + m);

		int size = m.size(); // length
		System.out.println("size : " + size);

		Set<String> keySet = m.keySet();
		System.out.println("keySet : " + keySet);

		Collection<Integer> values = m.values();
		System.out.println("values : " + values);

		boolean containsKey = m.containsKey("b");
		System.out.println("containsKey : " + containsKey);

		boolean containsValue = m.containsValue(45);
		System.out.println("containsValue : " + containsValue);

		Set<Entry<String, Integer>> entrySet = m.entrySet();
		
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry);
		}

		Map<String, Integer> h = new Hashtable<String, Integer>();

		h.put("A", 23);
		h.put("B", 34);
		h.put("A", 56);
	
		System.out.println(h);

	
	
	}

}
