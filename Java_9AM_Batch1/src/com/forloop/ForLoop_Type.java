package com.forloop;

public class ForLoop_Type {

	public static void main(String[] args) {

		for (int i = 10; i <=15; i++) {

			System.out.println(i);

		}
		
		System.out.println("**********************************************8");
		
		
		for (int i = 10; i < 15; i++) {// outerloop
			for (int j = 10; j < i; j++) {// innerloop
				System.out.println(j);
				
			}
		}

	}

}
