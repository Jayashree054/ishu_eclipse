package com.polymorphism;

public class Method_Overloading {

	private void company(String name) {
		System.out.println(name);
	}

	private void company(int age) {
		System.out.println(age);
	}

	private void company(String gender, char ch) {
		System.out.println(gender+" "+ch);
		System.out.println(ch);
	}

	private void company(float salary) {
		System.out.println(salary);
	}

	private void company(long phonenum) {
		System.out.println(phonenum);
	}
public static void main(String[] args) {
	Method_Overloading m = new Method_Overloading();
	m.company("raju");
	m.company(32);
	m.company("name", 'A');
	m.company(12.8F);
	m.company(9876543210L);
}
}
