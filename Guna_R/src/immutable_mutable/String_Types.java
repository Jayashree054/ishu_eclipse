package immutable_mutable;

public class String_Types {

	public static void main(String[] args) {
		
		String s = "Happy Birthday";  //immutable syntax
		String s1 ="Happy Birthday";
		
		//immutable   literal
		
 System.out.println(s);
 System.out.println(System.identityHashCode(s)); //to find memory
 System.out.println(s1);
 System.out.println(System.identityHashCode(s1));
 s=s+s1;   //concordination
 System.out.println(s);
 System.out.println(System.identityHashCode(s));
 System.out.println();
 
  //mutable non literal
 
 StringBuffer s2 = new StringBuffer("Happy New Year");
 StringBuffer s3 = new StringBuffer("Happy New year");
 
 System.out.println(s2);
 System.out.println(System.identityHashCode(s2));
 System.out.println(s3);
 System.out.println(System.identityHashCode(s3));
 s3=s3.append(s2);
 System.out.println(s3);
 System.out.println(System.identityHashCode(s3));
 System.out.println();
	}                                                                                                                                                                           

}
