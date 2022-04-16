package com.demo;

public class Jumpning {

	private int return_tye() {

		return 10;
	}

	public static void main(String[] args) {
		
		Jumpning j = new Jumpning();
		System.out.println(j.return_tye());

		for (int i = 0; i <= 10; i++) {
			if (i == 5)
				break;
			System.out.println(i);
		}
		for (int i = 0; i <=10; i++) {
			if (i == 5)
				continue;
			System.out.println(i);
			
		}
	}

}
