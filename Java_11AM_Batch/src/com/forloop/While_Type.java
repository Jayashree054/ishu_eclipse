package com.forloop;

public class While_Type {
	public static void main(String[] args) {

		
		 int a = 15;
		 
		 
		 while (a > 7) {
			  
		 System.out.println("true");
		 
		 a--;
		
		 System.out.println(a);
		 
		}
		 
		
		 do {
		 
		 System.out.println("before : " + a);
		 
		 a--;
		 
		 System.out.println("after : " + a);
		 
		 } while (a > 7);
		 

		int s[] = { 12, 23, 45, 67, 67 };

		// for datatype eachitem : array
		for (int i : s) {
			System.out.println(i);
		}

		
		
		
	}

}
