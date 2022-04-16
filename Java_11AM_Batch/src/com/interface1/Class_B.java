package com.interface1;

public class Class_B implements Type_Interface , Class_A{

	private void overall() {
		
		System.out.println("overall");
	}

	@Override
	public void password() {

		System.out.println("3421");
	}

	@Override
	public void location() {
	
		System.out.println("chennai");
	}

	@Override
	public void bank() {
		
		System.out.println("sbi");
	}

	@Override
	public void ifsc() {
		
		System.out.println("sbi2346");
		
	}
	
	public static void main(String[] args) {
		
		Class_B b = new Class_B();
		b.overall();
		b.bank();
		b.ifsc();
		b.location();
		b.password();
	}
}
