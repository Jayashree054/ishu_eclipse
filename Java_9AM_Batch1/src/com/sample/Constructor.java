package com.sample;

public class Constructor {
	
	public Constructor() {
		System.out.println("default");
	}
	
	
	public Constructor(String name) {
		this();
		System.out.println(name);
	}
	
	public Constructor(int age) {
		this("siva");
		System.out.println(age);
	}
	
	public Constructor(char gender) {
		this(43);
		System.out.println(gender);
	}
	
	public Constructor(float salary) {
		this('f');
		System.out.println(salary);
	}
	
	public Constructor(long pincode) {
		this(12.3f);
		System.out.println(pincode);
	}
	
	public static void main(String[] args) throws Throwable {
		
		Constructor os = new Constructor(654329L);
		os.finalize();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
