package com.jump;

public class Jump_Type {

	private int online() {

		return 23;

	}

	public static void main(String[] args) {
		Jump_Type j = new Jump_Type();

		System.out.println(j.online());
		System.out.println("************************************");

		for (int i = 0; i < 10; i++) {

			if (i == 5)
				break;
			System.out.println(i);

		}
		System.out.println("************************************");
		for (int i = 0; i < 10; i++) {

			if (i == 5)
				continue;
			System.out.println(i);

		}

	}

}
