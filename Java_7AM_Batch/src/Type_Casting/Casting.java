package Type_Casting;

public class Casting {
	
	
	public static void main(String[] args) {
		
		//wide
		int a = 10;
		System.out.println("Before :"+a);
		float f  =(float) a;
		System.out.println("After :"+f);
		
		int i = 10;
		System.out.println("Before :"+i);
		long l  =(long) i; // downcasting
		System.out.println("After :"+l);
		//narrow
		
		double d=23.4;
		System.out.println("Before: "+d);
		int s = (int)d; 
		System.out.println("After :"+s);
	}

}
