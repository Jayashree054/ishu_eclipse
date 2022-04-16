package com.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Type {
public static void main(String[] args) {

		Set<Integer> s = new HashSet<Integer>();
		// random
		s.add(23);
		s.add(45);
		s.add(34);
		s.add(34);
		s.add(null);
		s.add(null);

		System.out.println("Hashset value : " + s);

		Set<Integer> l = new LinkedHashSet<Integer>();
		// insertion
		l.add(23);
		l.add(45);
		l.add(34);
		l.add(34);
		l.add(null);
		l.add(null);

		System.out.println("LinkedHashSet value : " + l);

		Set<Integer> r = new TreeSet<Integer>();

		r.add(23);
		r.add(45);
		r.add(34);
		r.add(34);
	
		System.out.println("Treeset value : " + r);

	}

}
