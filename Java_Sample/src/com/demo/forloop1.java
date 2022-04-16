package com.demo;

public class forloop1 {

	
	public static void main(String[] args) {
		
		
		for (int i = 0; i <=5; i++) {
			System.out.println("before");
			System.out.println(i);
			for (int j = 0; j <=i; j++) {
				System.out.println("after");
				System.out.print(j);
		
			}
		System.out.println();
		}
		
	}
	
}
