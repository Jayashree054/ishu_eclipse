package com.forloop;

public  final class Jump {

	private final int online() {

		return 14;
	}

	public static void main(String[] args) {

		Jump j = new Jump();
		System.out.println(j.online());

		System.out.println("*******************************");

		for (int i = 0; i < 10; i++) {

			if (i == 5)
				break;
			System.out.println(i);

		}
		System.out.println("*******************************");

		for (int i = 0; i < 10; i++) {

			if (i == 5)
				continue;
			System.out.println(i);

		}

	}

}
