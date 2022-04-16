package org.Sample;

public class Sample_Pgm {

	private void name_Ofthecompany() { // signature part

		System.out.println("Greens"); // implementation part

	}

	public void emp() { // signature part

		System.out.println("ishu"); // implementation part

	}

	protected void age() { // signature part

		System.out.println(23); // implementation part

	}

	public void salary() { // signature part

		System.out.println(12.F); // implementation part

	}

	public static void main(String[] args) { // main method signature part

		Sample_Pgm s = new Sample_Pgm(); // object syntax

		s.name_Ofthecompany(); // method calling
		s.emp();
		s.age();
		s.salary();
		
	}

}
