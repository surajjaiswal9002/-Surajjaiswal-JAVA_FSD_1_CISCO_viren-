package org.Cisco.Oops;

class operation
{
	int square(int n)
	{
		return n*n;
	}
}


public class AgressionExp 
{

	operation op;
	
	double pi=3.14;
	
	double area(int radius)
	{
		op = new operation();
		int rsquare = op.square(radius);
		return pi*rsquare;
	}
	

	public static void main(String[] args) {
		AgressionExp ag = new AgressionExp();
		
		double result = ag.area(5);
		System.out.println(result);
		
		
	}
}
