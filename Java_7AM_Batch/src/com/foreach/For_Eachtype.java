package com.foreach;

public class For_Eachtype {

	public static void main(String[] args) {

		String s[] = { "raju", "A", "45%", "abc123@gmail.com" };

		// for (datatype eachitem : s )

		for (String i : s) {

			System.out.println(i);

		}
	System.out.println("*******************************************");
	//while condition
	int a = 10;
	//entry level checking
	while (a>=5) {
		System.out.println("Before = "+a);
		
		a--; //decre
		System.out.println("After = "+a);
		
	}
	
	System.out.println("**************************************");

	//do while
	int i = 10;
	do {
		System.out.println("Before = "+i);
		i--;
		System.out.println("After = "+i);
		
	} while (i>5);
	
	
	}
	
	
	
}
