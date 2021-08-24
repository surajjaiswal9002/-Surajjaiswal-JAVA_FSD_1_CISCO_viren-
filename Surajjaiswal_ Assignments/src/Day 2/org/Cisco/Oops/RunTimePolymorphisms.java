package org.Cisco.Oops;

class Bank
{
	float getRetOfIntrest()
	{
		return 0;
	}
}

class HDFC extends Bank
{
	float getRetOfIntrest()
	{
		return 9.0f;
	}
}
class UK extends Bank
{
	float getRetOfIntrest()
	{
		return 9.4f;
	}
}
class SBI extends Bank
{
	float getRetOfIntrest()
	{
		return 8.4f;
	}
}




public class RunTimePolymorphisms {

	public static void main(String[] args) 
	{
		Bank b;
		b = new SBI();
		System.out.println("RAte of intrest"+b.getRetOfIntrest());
		
		b = new HDFC();
		System.out.println("HDFC rate of intrest"+b.getRetOfIntrest());
		
		b = new UK();
		System.out.println("UK rate of intrest"+b.getRetOfIntrest());
	}

}
