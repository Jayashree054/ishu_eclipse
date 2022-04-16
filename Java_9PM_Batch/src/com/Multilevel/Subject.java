package com.Multilevel;

public class Subject extends Class_3{

	private void overall() {
		System.out.println("overall subject");
	
	}

	public static void main(String[] args) {

		Subject s = new Subject();

		System.out.println("*******************************");
		s.overall();
		s.english();
		s.student_Name();
		s.grade();
		
		System.out.println("*******************************");
		s.maths();
		s.student_Name1();
		s.grade1();
		
		System.out.println("*******************************");
		s.social();
		s.student_Name2();
		s.grade2();
		
	}

}
