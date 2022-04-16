package com.polymorphism;

public class Overloading {
	
	private void company(String name) {

		System.out.println(name);
	}

	private void company(int year) {
		System.out.println(year);
	}

	private void company(char logo) {
		System.out.println(logo);
	}

	private void company(float salary) {
		System.out.println(salary);
	}

	public static void main(String[] args) {

		Overloading l = new Overloading();
		
		l.company("ishu");
		l.company(2014);
		l.company(12.54F);
		l.company('A');
		
		
	}

}
