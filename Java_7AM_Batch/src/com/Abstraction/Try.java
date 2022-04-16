package com.Abstraction;

public class Try {

	 int a;
	 String name;

    void display() {

		System.out.println(a + " " + name);
	}

	public static void main(String[] args) {

		
		Try t1 = new  Try();
		Try t2 = new  Try();
		t1.display();
		t2.display();
		
		
	}
}
