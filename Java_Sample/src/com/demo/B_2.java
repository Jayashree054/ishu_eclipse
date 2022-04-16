package com.demo;

public class B_2 extends A_1 {

	public String sing() {
		// TODO Auto-generated method stub
		return "fa";
	}

	public static void main(String[] args) {
		B_2 c = new B_2();

		A_1 a = new A_1();
		System.out.println(c.sing()+" value "+a.sing1());
			}
}
