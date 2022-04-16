package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Type {
	public static void main(String[] args) {

		Set<Integer> s = new HashSet<Integer>();
		s.add(12);
		s.add(78);
		s.add(54);
		s.add(12);
		s.add(null);
		s.add(null);
		System.out.println("Hashset: " + s);

		Set<Integer> a = new LinkedHashSet<Integer>();
		a.add(12);
		a.add(78);
		a.add(54);
		a.add(12);
		a.add(null);
		a.add(null);
		System.out.println("LinkedHashset: " + a);

		Set<Integer> t = new TreeSet<Integer>();
		t.add(12);
		t.add(78);
		t.add(54);
		t.add(12);
		try {
			t.add(null);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Treeset: " + t);

	}

}
