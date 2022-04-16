package Reema;

public class Test extends upcasting {
	public void mul() {
		System.out.println("multiplictaion");
		
	}
	public void add() {
		super.add();
		System.out.println("i am new add");
		
		}
public static void main(String[] args) {
	
	//Test t= new Test();
	upcasting t= new Test();
	
	
	t.add();
	t.sub();
	
	
	
	
	
}


}
