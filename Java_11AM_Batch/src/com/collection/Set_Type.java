package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Type {
	public static void main(String[] args) {

		Set<Integer> s = new HashSet<Integer>();
//random
		s.add(23);
		s.add(23);
		s.add(12);
		s.add(34);
		s.add(null);
		s.add(null);

		System.out.println("Hashset : " + s);

		Set<Integer> h = new LinkedHashSet<Integer>();
		// insertion
		h.add(23);
		h.add(23);
		h.add(12);
		h.add(34);
		h.add(null);
		h.add(null);

		System.out.println("LinkedHashset : " + h);

		Set<Integer> t = new TreeSet<Integer>();
		t.add(23);
		t.add(23);
		t.add(12);
		t.add(34);

		try {
			t.add(null);
		} catch (Exception e) {

			System.out.println(e);
		}

		System.out.println("LinkedHashset : " + t);

	}
}
