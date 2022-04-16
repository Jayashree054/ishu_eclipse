package com.forloop;

public class Forloop_Type {
public static void main(String[] args) {
	
	//i++,++i,i--,--i
	for (int i = 0; i < 5; i++) {
		
		System.out.println(i);
		
	}
	System.out.println("****************************");
	for (int i = 0; i < 5; i++) {
		
		for (int j = 0; j < i; j++) {
			System.out.print(j);
		}
		System.out.println();
	}
	System.out.println("*************************");
	
	int s[] = {23,45,67,87,97};
	
	//datatype eachitem : arrayref
	
	for (int i : s) {
		System.out.println(i);
	}
	
	
	
}
}
