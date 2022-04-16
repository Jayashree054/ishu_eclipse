package com.colllection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Type {
	public static void main(String[] args) {

		
		
		Set<Integer> s = new HashSet<Integer>();

		s.add(34);
		s.add(87);
		s.add(67);
		s.add(34);
		s.add(null);
		s.add(null);

		System.out.println("Hashset: " + s);
		Set<Integer> h = new LinkedHashSet<Integer>();

		h.add(34);
		h.add(87);
		h.add(67);
		h.add(34);
		h.add(null);
		h.add(null);

		System.out.println("LinkedHashset: " + h);
		Set<Integer> t = new TreeSet<Integer>();

		t.add(34);
		t.add(87);
		t.add(67);
		t.add(34);
		try {
			t.add(null);
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Treeset: " + t);

	}
}
