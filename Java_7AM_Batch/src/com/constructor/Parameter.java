package com.constructor;

public class Parameter {

	public Parameter(String name) {
		this(23);
		
		System.out.println(name);
	}

	public Parameter(int age) {
		System.out.println(age);
	}

	public Parameter(char gender) {
		this("raju");
		
		System.out.println(gender);
	}

	public Parameter(float salary) {
		this('M');
		System.out.println(salary);
	}

	public static void main(String[] args) throws Throwable  {
	
		Parameter c = new Parameter(12.3F);

		c.finalize();

	}

}
