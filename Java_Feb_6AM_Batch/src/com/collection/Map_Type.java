package com.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Type {

	public static void main(String[] args) {

		Map<Integer, String> n = new HashMap<Integer, String>();

		n.put(1, "34");
		n.put(2, "raju");
		n.put(1, "Ishu");
		n.put(3, null);
		n.put(null, "34");
		n.put(null, "12.3");
		n.put(4, null);

		System.out.println("Hashmap: " + n);

		int size = n.size();
		System.out.println("size: " + size);

		Set<Integer> keySet = n.keySet();
		System.out.println("keySet :" + keySet);

		Collection<String> values = n.values();
		System.out.println("values :" + values);

		boolean containsKey = n.containsKey(5);
		System.out.println("containsKey: " + containsKey);

		boolean containsValue = n.containsValue("Ishu");
		System.out.println("containsValue :" + containsValue);

		Set<Entry<Integer, String>> entrySet = n.entrySet();
		System.out.println("entrySet :" + entrySet);
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}

		Map<Integer, String> a = new Hashtable<Integer, String>();

		a.put(1, "34");
		a.put(2, "raju");
		a.put(1, "Ishu");

		System.out.println("Hashtable: " + a);

	}
}
