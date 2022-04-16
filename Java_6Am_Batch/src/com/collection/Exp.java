package com.collection;

public class Exp {
	public static void main(String[] args) {

		int a = 10;
		try {
			System.out.println(a / 0);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
