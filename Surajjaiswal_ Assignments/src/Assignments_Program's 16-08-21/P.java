package org.Cisco.javaclass;

public class P {

	public static void main(String[] args) 
	{
		System.out.println("-----M class Variable :-----");
		M m = new M(); 
		//call & print the variable of class M
		m.mpubl();  
		m.def();
		m.pro();
		System.out.println("Long value b = "+m.b);
		System.out.println("protected value c = "+m.c);
		
		System.out.println();
		
		System.out.println("-----N class Variable :-----");
		N n = new N();
		//call & print the variable of class N
		n.ndef();
		n.npubl();
		n.npro();
		System.out.println("protected value d = "+n.d);
		System.out.println("public value e = "+n.e);
		System.out.println("Default value f = "+n.f);
	
		
	}
}
