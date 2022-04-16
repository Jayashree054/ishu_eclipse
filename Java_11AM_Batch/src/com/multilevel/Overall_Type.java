package com.multilevel;

public class Overall_Type extends Class_A {

	private void overall() {

		System.out.println("overall");
	}

	public static void main(String[] args) {
		Overall_Type a = new Overall_Type();
		a.overall();

		System.out.println("***************multi inherit************");
		a.name();
		a.subject();
	
		System.out.println("***************Class_B************");
		System.out.println("***************Class_A************");

		a.name2();
		a.grade2();
		a.subject2();

	}
}
