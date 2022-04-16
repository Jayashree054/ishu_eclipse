package com.constructor;

public class Single_Constructor {

	
	public Single_Constructor(String name, int age, float salary, char gender, long ph_no) {
		
	System.out.println(name);
	System.out.println(age);
	System.out.println(salary);
	System.out.println(gender);
	System.out.println(ph_no);

	
	}

	
	
	public static void main(String[] args) throws Throwable {
		
		Single_Constructor s = new Single_Constructor("ishu123@gmail.com", 23, 12.3F, 'F', 98776654321L);
		
		s.finalize();
		
	}
	
}
