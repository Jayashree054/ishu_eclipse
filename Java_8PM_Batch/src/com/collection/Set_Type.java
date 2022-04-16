package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Type {
	public static void main(String[] args) {

		Set<Integer> a = new HashSet<Integer>();
		// random
		a.add(12);
		a.add(24);
		a.add(12);
		a.add(null);
		a.add(null);

		System.out.println("HashSet: " + a);

		Set<Integer> h = new LinkedHashSet<Integer>();
		// insertion
		h.add(12);
		h.add(24);
		h.add(12);
		h.add(null);
		h.add(null);
		System.out.println("LinkedHashset : " + h);

		Set<Integer> s = new TreeSet<Integer>();
		// ascending
		s.add(12);
		s.add(24);
		s.add(12);

//try/catch		
		try {
			s.add(null);
		} catch (Exception e) {

			System.out.println(e);
		}

		System.out.println("Treeset : " + s);

	}
}
