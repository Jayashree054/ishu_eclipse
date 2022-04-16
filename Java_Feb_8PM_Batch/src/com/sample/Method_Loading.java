package com.sample;

public class Method_Loading {

	private void company(String name) {
		System.out.println(name);
	}


	private void company(int age) {
	this.company("ishu");
		System.out.println(age);

	}

	private void company(float salary) {
		this.company(23);
		System.out.println(salary);

	}

	private void company(long phonenum) {
		this.company(23.4F);
		System.out.println(phonenum);

	}

	public static void main(String[] args) {

		Method_Loading m = new Method_Loading();
		m.company(98766544211L);
	
	}

}
