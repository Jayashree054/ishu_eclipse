package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Type {

	public static void main(String[] args) {

		Set<Integer> s = new HashSet<Integer>();
//random
		s.add(12);
		s.add(34);
		s.add(12);
		s.add(45);
		s.add(null);
		s.add(null);

		System.out.println("Hashset: " + s);
//insertion
		Set<Integer> a = new LinkedHashSet<Integer>();
		a.add(12);
		a.add(34);
		a.add(12);
		a.add(45);
		a.add(null);
		a.add(null);

		System.out.println("LinkedHashset: " + a);

		Set<Integer> h = new TreeSet<Integer>();
		h.add(12);
		h.add(34);
		h.add(12);
		h.add(45);
		try {
			h.add(null);
		} finally {

			System.out.println("invalid");
		}
		System.out.println("Treeset: " + h);

	}
}
