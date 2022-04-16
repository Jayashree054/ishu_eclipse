package com.string;

public class String_Keyword {

	public static void main(String[] args) {

		String s = " WelCome To JaVae ";

		int length = s.length();
		System.out.println("length : " + length);

		boolean equals = s.equals(" WelCome To JaVa ");// exca
		System.out.println("ContentEquals : " + equals);

		boolean equalsIgnoreCase = s.equalsIgnoreCase(" Welcome To Java ");
		System.out.println("EqualsIgnoreCase : " + equalsIgnoreCase);

		boolean startsWith = s.startsWith(" We");
		System.out.println("startsWith : " + startsWith);

		boolean endsWith = s.endsWith("Va ");
		System.out.println("endsWith : " + endsWith);

		int indexOf = s.indexOf("e");
		System.out.println("indexOf : " + indexOf);

		int lastIndexOf = s.lastIndexOf("e");
		System.out.println("lastIndexOf : " + lastIndexOf);

		String upperCase = s.toUpperCase();
		System.out.println("Upper case : " + upperCase);

		String lowerCase = s.toLowerCase();
		System.out.println("lowerCase : " + lowerCase);
		
		char charAt = s.charAt(16);
		System.out.println("charAt : "+charAt);
		
		String substring = s.substring(4);
		System.out.println("substring : "+substring);
		
		String substring2 = s.substring(4, 17);
		//(start(index) and end (length))
		System.out.println("substring2 : "+substring2);
	
		String replace = s.replace("WelCome", "*****");
		System.out.println("replace : "+replace);
		
		boolean empty = s.isEmpty();
		System.out.println( "empty : "+empty);
		
	}

}
