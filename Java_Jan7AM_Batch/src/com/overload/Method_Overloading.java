package com.overload;

public class Method_Overloading {

	// string -->null

	private void company(String name, int type) {
		System.out.println(name);
		System.out.println(type);
	}

	private void company(int age) {
		System.out.println(age);
	}

	private void company(char gender) {
		System.out.println(gender);
	}

	private void company(float salary) {
		System.out.println(salary);
	}

	public static void main(String[] args) {
		Method_Overloading c = new Method_Overloading();
		c.company("ishu", 23);
		c.company(23);
		c.company('F');
		c.company(12.3F);

	}

}
