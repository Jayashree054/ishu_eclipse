package com.demo;

public class Try {
	public static void main(String[] args) {
		int count = 1;
		while (count <= 15) {
			System.err.println(count % 2 == 1 ? "***" : "+++++");
			++count;

		}
	}
}
