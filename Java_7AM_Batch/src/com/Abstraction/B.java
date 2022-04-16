package com.Abstraction;

public class B implements Parent_B,Pure_Abstract{

	@Override
	public void acc_Number() {
		// TODO Auto-generated method stub
	System.out.println("987654321");	
	}

	@Override
	public void pin_Number() {
		// TODO Auto-generated method stub
		System.out.println("602001");
	}

	@Override
	public void phone_Number() {
		// TODO Auto-generated method stub
		System.out.println("876543219");
	}

	@Override
	public void mail_Id() {
		// TODO Auto-generated method stub
		System.out.println("abc123@gmail.com");
	}

	@Override
	public void person_Name() {
		// TODO Auto-generated method stub
		System.out.println("raju");
	}

	@Override
	public void location() {
		// TODO Auto-generated method stub
		System.out.println("chennai");
	}

	@Override
	public void access_code() {
		// TODO Auto-generated method stub
		System.out.println("2345");
	}

	@Override
	public void password() {
		// TODO Auto-generated method stub
		System.out.println("ishu1234");
	}
public static void main(String[] args) {
	B s = new B();
	s.person_Name();
	s.phone_Number();
	s.mail_Id();
	s.location();
	s.acc_Number();
	s.access_code();
	s.password();
	s.pin_Number();
}
}
