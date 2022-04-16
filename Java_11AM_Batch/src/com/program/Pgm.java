package com.program;

public class Pgm {

	int a; //-0
	String s; //-null

	private void display() {

			System.out.println(a + " " + s);

		}

	
	public static void main(String[] args) {
		Pgm p = new Pgm();
		Pgm d = new Pgm();
		
		p.display();
		d.display();
	}

  
	}
