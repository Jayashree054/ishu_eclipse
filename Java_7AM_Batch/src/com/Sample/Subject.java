package com.Sample;

public class Subject extends Social {

	private void Overall1() {
		System.out.println("Overall");
	}

	public static void main(String[] args) {
		Subject s = new Subject();
		s.Overall1();
		s.name();
		s.grade();
		s.percentage();
		s.name1();
		s.grade1();
		s.percentage1();
		s.name2();
		s.grade2();
		s.percentage2();

	}
}
