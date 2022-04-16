package com.colllection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Type {

	public static void main(String[] args) {

		Map<Integer, String> a = new HashMap<Integer, String>();

		a.put(1, "raju");
		a.put(2, "34");
		a.put(3, null);
		a.put(2, "ishu");
		a.put(4, null);
		a.put(null, "87");
		a.put(null, "34");

		System.out.println(a);

		int size = a.size();
		System.out.println("size :" + size);

		Set<Integer> keySet = a.keySet();
		System.out.println("keySet:" + keySet);

		Collection<String> values = a.values();
		System.out.println("values :" + values);

		boolean containsKey = a.containsKey(6);
		System.out.println("containsKey :" + containsKey);

		boolean containsValue = a.containsValue("ishu");
		System.out.println("containsValue: " + containsValue);

		Set<Entry<Integer, String>> entrySet = a.entrySet();
		System.out.println("entrySet: " + entrySet);

		// for(datatype eachitem: arrayref)
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}
	}

}
