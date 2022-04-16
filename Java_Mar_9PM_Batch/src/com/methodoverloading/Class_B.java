package com.methodoverloading;

public class Class_B extends Class_A{

@Override
public void name() {
	System.out.println("ishu");
	super.name();
}
public static void main(String[] args) {
	Class_B c = new Class_B();
	c.name();
}
}