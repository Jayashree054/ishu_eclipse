package com.methodoverloading;

public class Method_OL {

	private void company(String name) {
		System.out.println(name);
	}

	private void company(int years, String value) {

		System.out.println(years+value);
	}

	private void company(float turnover) {
		
		System.out.println(turnover);
	}

	private void company(long phoneum) {
		
		System.out.println(phoneum);
	}
	public static void main(String[] args) {
		
		Method_OL m = new Method_OL();
		
		m.company("greens");
		m.company(2000, "java");
		m.company(12.3F);
		m.company(9876543311L);
		
	}

}
