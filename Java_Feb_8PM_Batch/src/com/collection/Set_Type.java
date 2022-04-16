package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Type {
	public static void main(String[] args) {

		Set<Integer> s = new HashSet<Integer>();
		s.add(23);
		s.add(45);
		s.add(23);
		s.add(null);
		s.add(null);

		System.out.println("Hashset: " + s);

		Set<Integer> a = new LinkedHashSet<Integer>();
		a.add(23);
		a.add(45);
		a.add(23);
		a.add(null);
		a.add(null);

		System.out.println("LinkedHashset: " + a);

		Set<Integer> t = new TreeSet<Integer>();
		t.add(23);
		t.add(45);
		t.add(23);
		try {
			t.add(null);
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Treeset: " + t);

	}
}
