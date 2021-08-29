package org.Cisco.Oops;

import javax.xml.ws.Holder;

abstract class Bike
{
	Bike()
	{
		System.out.println("Bike is creatred");
	}
	
	abstract void run1();
	
	void changeGeer()
	{
		System.out.println("gear changed");
	}

}
abstract class Honda extends Bike
{
	Honda()
	{
		System.out.println("honda is craeted");
	}
	
	abstract void run();
	
	abstract void run1();
}

class Hello extends Honda
{
	void run()
	{
		System.out.println("saftey");
	}
	
	@Override
	void run1()
	{
		System.out.println("Inside the run1 method");
	}
}
 
public class AbstractionExp
{
	public static void main(String[] args) 
	{
		Honda h = new Hello();
		h.run();
		h.run1();
		h.changeGeer();
		
	}
}