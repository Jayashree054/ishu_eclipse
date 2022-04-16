package com.static1;

public class String_Type {

	public static void main(String[] args) {

		String s = " core jaevae ";

		int length = s.length();
		System.out.println("length: " + length);

		boolean equals = s.equals(" corE java ");
		System.out.println("equals : " + equals);

		boolean equalsIgnoreCase = s.equalsIgnoreCase(" corE java");
		System.out.println("equalsIgnoreCase : " + equalsIgnoreCase);
		
		boolean startsWith = s.startsWith(" Co");
		System.out.println("startsWith : "+startsWith);
		
		boolean endsWith = s.endsWith("a ");
		System.out.println("endsWith : "+endsWith);
		
		int indexOf = s.indexOf("e");
		System.out.println(indexOf);
		
		int lastIndexOf = s.lastIndexOf("e");
		System.out.println(lastIndexOf);
		
	}
}
