package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Type {
	public static void main(String[] args) {

		Set<Integer> s = new HashSet<Integer>();
		// random order
		s.add(23);
		s.add(766);
		s.add(23);
		s.add(null);
		s.add(null);
		System.out.println("hashset :" + s);

		Set<Integer> h = new LinkedHashSet<Integer>();
		// insertion order
		h.add(23);
		h.add(766);
		h.add(23);
		h.add(null);
		h.add(null);
		System.out.println("linkedhashset :" + h);

		Set<Integer> t = new TreeSet<Integer>();
		// Asc order
		t.add(23);
		t.add(766);
		t.add(23);
		try {
			t.add(null);
		} catch (Exception e) {
		System.out.println(e);
		}
		
		System.out.println("Treeset :" + t);

	}
}
