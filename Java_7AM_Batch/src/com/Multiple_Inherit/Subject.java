package com.Multiple_Inherit;

public class Subject extends Social {

	private void subject() {
		// TODO Auto-generated method stub
		System.out.println("Overall subject");
	}

	public static void main(String[] args) {
		Subject s = new Subject();
		s.subject();
		s.name_OfStudent();
		s.grade();
		s.percentage();
		s.name_OfStudent1();
		s.grade1();
		s.percentage1();
		s.name_OfStudent2();
		s.grade2();
		s.percentage2();

	}
}
