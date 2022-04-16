package com.multilevel;

public class Subject extends Social {

	private void overall() {

		System.out.println("overall subject");
	}

	public static void main(String[] args) {
		Subject s = new Subject();
		s.overall();
		System.out.println("******************************");
		s.name_OfStudent();
		s.grade();
		s.percentage();

		System.out.println("******************************");

		s.name_OfStudent2();
		s.grade2();
		s.percentage2();

		System.out.println("******************************");

		s.name_OfStudent3();
		s.grade3();
		s.percentage3();

	}

}
