package com.Sample;

public class c {
	public void sum(int x)
    {
     System.out.println(x);

    }
  
    // Overloaded sum(). This sum takes three int parameters
    public void sum(float y)
    {
        System.out.println(y);
    }
  
     public static void main(String args[])
    {
        c s = new c();
        
        s.sum(45);
        s.sum(0);
        }

}
