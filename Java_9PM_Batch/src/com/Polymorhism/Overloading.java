package com.Polymorhism;

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

	private void company(float income) {
		System.out.println(income);

	}

	public static void main(String[] args) {
		
		Overloading b = new Overloading();
		b.company("ishu");
		b.company("Greens");
		b.company(2020);
		b.company(12.54F);
		b.company('J');
	}
}
