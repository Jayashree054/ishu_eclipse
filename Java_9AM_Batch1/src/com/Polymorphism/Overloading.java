package com.Polymorphism;

public class Overloading {

	private void company(String com_name) {
		
		System.out.println(com_name);
	}

	private void company(String name, char gender) {
		// TODO Auto-generated method stub
		System.out.println(name);
		System.out.println(gender);
	}

	private void company(int age) {
		// TODO Auto-generated method stub
		System.out.println(age);
	}

	private void company(float salary) {
		// TODO Auto-generated method stub
		System.out.println(salary);
	}

	private void company(double percentage) {
		// TODO Auto-generated method stub
		System.out.println(percentage);
	}

	private void company(long acc_no) {
		// TODO Auto-generated method stub
		System.out.println(acc_no);
	}

	public static void main(String[] args) {
		Overloading l = new Overloading();
		l.company("dinesh@dinu");
		l.company("raju", 'M');
		l.company(34);
		l.company(78.5F);
		l.company(34.5D);
		l.company(98765453321L);
		
		
	}

}
