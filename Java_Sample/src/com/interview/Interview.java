package com.interview;

public class Interview {

	int id; // default
	String name; // null

	void display() {
		System.out.println(id + " " + name);
	}
	
	
	public static void main(String[] args) {
		Interview i = new Interview();
		Interview s = new Interview();
		i.display();
		s.display();

		System.out.println("***********************************************");
		// 2)
		System.out.println(100 + 100 + "Test");
		System.out.println("Good" + 100 + 100);
		// 3)

		
	//	 for (int j = 0; 0; j++) { //compile time error
		 
		//System.out.println("Javascript");
		 
		 //}
		

		// 4

		String r = " Welcome", Reverse = " ";
		char ch;
		for (int j = 0; j < r.length(); j++) {

			ch = r.charAt(j);
			Reverse = ch + Reverse;

		}
		System.out.println(Reverse);
	}

}
