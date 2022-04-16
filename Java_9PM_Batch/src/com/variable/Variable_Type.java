package com.variable;

public class Variable_Type {

 	static int a; // static variable

	int b; //class variable
	
	
	public void offline() { //local variable
		int a=30;
		System.out.println("local variable : " + a);

	}

	public static void main(String[] args) {
		
		System.out.println("static variable : "+a);
		Variable_Type v = new Variable_Type();
		v.offline();
		System.out.println("class variable: "+v.b);

	}
}
