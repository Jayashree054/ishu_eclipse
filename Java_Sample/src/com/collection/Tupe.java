package com.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Tupe {
public static void main(String[] args) {
	List<Object> l = new LinkedList<Object>();
	
	l.add("Name");
	l.add(23);
	l.add(3.8F);
	System.out.println(l);
	
	int size = l.size();
	System.out.println(size);
	
	Object object = l.get(2);
	System.out.println(object);
	

}
}
