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
		s.put(1, "raju");
		s.put(2, "age");
		s.put(2, "23");
		s.put(3, null);
		s.put(null, "45");
		s.put(5, null);

		System.out.println("HashMap : " + s);
		
		
		int size = s.size();
		System.out.println("size : "+size);
		
		Set<Integer> keySet = s.keySet();
		System.out.println("keySet : "+keySet);
		
		Collection<String> values = s.values();
		System.out.println("values : "+values);
		
		boolean containsKey = s.containsKey(3);
		System.out.println("containsKey : "+containsKey);
		
		boolean containsValue = s.containsValue("raJu");
		System.out.println("containsValue : "+containsValue);
		
		Set<Entry<Integer, String>> entrySet = s.entrySet();
		System.out.println(entrySet);
		
		for (Entry<Integer, String> i : entrySet) {
			System.out.println(i);
		}
		
		Map<Integer, String> m = new Hashtable<Integer, String>();
		
		m.put(1, "raju");
		m.put(2, "age");
	
		System.out.println("Hastable : "+m);

	}

}
