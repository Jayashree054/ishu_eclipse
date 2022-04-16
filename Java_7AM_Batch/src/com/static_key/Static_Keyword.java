package com.static_key;

public class Static_Keyword {


	static int s =10;
	
	private static void online() {
	
		System.out.println("am static method");
	}
	
	static {
		
		System.out.println("am static block");
		
	}
	
	public static void main(String[] args) {
		
		online();
		
		System.out.println("static variable : "+s);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*// static method
	private static void online() {
		System.out.println("method block");
	}

	// static variable
	static int a = 10;

	private void offline() {
		System.out.println(a);
	}

	// block
	static {

		System.out.println("am static");

	}

	public static void main(String[] args) {
		online();

		Static_Keyword s = new Static_Keyword();
		s.offline();

	}*/

}
