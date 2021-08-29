package org.Cisco.method;

public class Example {
	
	public void area(int a, int b)
	{
		System.out.println("Area of traingle :"+(0.5*b*a));
	}
	
	public void area(long r)
	{
		System.out.println("Area of Circle :"+(3.14*r*r));
	}
	
	public void area(float g , int c)
	{
		System.out.println("value :"+g+" --"+c);
	}
	public void area(int h , float g, char m)
	{
		System.out.println("value :"+h+" --"+g+" "+m);
	}
	

	public static void main(String[] args) 
	{
		
		Example e = new Example();
		e.area(5);
		e.area(2 , 5);
	}

}
