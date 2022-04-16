package com.overloading;

public class Overloading {

	private void company(String name) {

		System.out.println(name);

	}

	private void company(int age, String name) {
		System.out.println(age+" "+name);
	}

	private void company(char gender) {
		System.out.println(gender);
	}

	private void company(float salary) {
		System.out.println(salary);

	}

	public static void main(String[] args) {
		Overloading v = new Overloading();
		v.company("ishu");
		v.company(23, "java");
		v.company('F');
		v.company(12.4F);
	}

}
