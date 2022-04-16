package com.methodoverload;

public class Method_Overloading {
	

	private void company(String name) {

		System.out.println(name);
	}

	private void company(int years, String name) {

		System.out.println(years+name);
		
	}

	private void company(long phoneno) {

		System.out.println(phoneno);
	}

	private void company(float turnover) {

		System.out.println(turnover);
	}

	public static void main(String[] args) {
		Method_Overloading v = new Method_Overloading();
		v.company("greens");
		v.company(2002, "raju");
		v.company(9876543221L);
		v.company(12.3F);
	}
}
