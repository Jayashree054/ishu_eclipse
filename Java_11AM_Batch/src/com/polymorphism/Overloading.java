package com.polymorphism;

public class Overloading {

	private void company(String name) {
		System.out.println(name);
	}

	private void company(int age) {
		
		System.out.println(age);
	}

	private void company(float salary) {
		System.out.println(salary);
	}

	private void company(char gender) {
		System.out.println(gender);
	}

	private void company(long phonenum) {
		System.out.println(phonenum);
	}

	public static void main(String[] args) {

		Overloading v = new Overloading();
		v.company("ajay");
		v.company(14);
		v.company(12.3F);
		v.company('M');
		v.company(9876543210L);
		
	}
}
