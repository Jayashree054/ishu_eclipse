package com.collection1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Type {

	public static void main(String[] args) {

		Set<Integer> s = new HashSet<Integer>();

		// random
		s.add(34);
		s.add(24);
		s.add(null);
		s.add(null);
		s.add(24);

		System.out.println("Hashset : " + s);

		Set<Integer> h = new LinkedHashSet<Integer>();

		// insertion

		h.add(34);
		h.add(24);
		h.add(null);
		h.add(null);
		h.add(24);

		System.out.println("Hashset : " + h);

		Set<Integer> t = new TreeSet<Integer>();

		// ascending

		t.add(34);
		t.add(24);

		try {
			t.add(null);
		} catch (Exception e) {

			System.out.println(e);
		}

		t.add(24);

		System.out.println("Hashset : " + t);

	}

}
