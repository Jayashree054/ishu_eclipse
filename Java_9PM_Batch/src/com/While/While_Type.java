package com.While;

public class While_Type {
	
	public static void main(String[] args) {

		int a = 15;

	
		while (a < 10) {

			System.out.println("before : " + a);
			
			a--;//dec
			
			System.out.println("after : " + a);
		}

		
		
		do {

			System.out.println("before : " + a);
			
			a--;//dec
			
			System.out.println("after : " + a);
		
		}while (a > 10);

		
	}
}
