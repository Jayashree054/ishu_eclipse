package com.demo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Try_1 {
public static void main(String[] args) {
	Set<Integer> s = new HashSet<Integer>();
	
	s.add(23);
	s.add(34);
	s.add(34);
	s.add(null);
	s.add(null);
	System.out.println(s);

	Set<Integer> s1 = new LinkedHashSet<Integer>();
	s1.add(23);
	s1.add(34);
	s1.add(34);
	s1.add(null);
	s1.add(null);
	System.out.println(s1);
	
	
	Set<Integer> s2 = new TreeSet<Integer>();
	
	s2.add(23);
	s2.add(34);
	s2.add(34);
	s2.add(null);
	s2.add(null);
	System.out.println(s2);
	


}
}
