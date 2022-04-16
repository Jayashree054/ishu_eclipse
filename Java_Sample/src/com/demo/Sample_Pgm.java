package com.demo;

public class Sample_Pgm {

	public Sample_Pgm(int age, String name, char gender) {
		// TODO Auto-generated constructor stub
		System.out.println(age);
		System.out.println(name);
		System.out.println(gender);

	}

	public static void main(String[] args) throws Throwable {
		Sample_Pgm s = new Sample_Pgm(65, "ishu", 'F');
		s.finalize();

		int r = 10;
		long b = (long) r;
		System.out.println(b);
		double d = 12.56;
		int i = (int) d;
		System.out.println(i);

	}
}
