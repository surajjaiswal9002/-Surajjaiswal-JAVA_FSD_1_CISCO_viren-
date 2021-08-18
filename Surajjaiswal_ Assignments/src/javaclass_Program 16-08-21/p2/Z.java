package org.Cisco.javaclass.p2;

import org.Cisco.javaclass.M;
import org.Cisco.javaclass.N;

public class Z {

	public static void main(String[] args)
	{
		//call all the method of m
		System.out.println("---M class---");
		M m = new M();
		m.mpubl();
		
		System.out.println();
		
		//call all the method of n
		System.out.println("---N class---");
		N n = new N();
		n.npubl();
		
		System.out.println();
		
		//print the variable of X
		System.out.println("---Variable of the class X---");
		X x = new X();
		x.xpubl();
//		x.xpro();
//		x.xdef();
		System.out.println("long large ="+x.large);
		System.out.println("float percent ="+x.per);
		System.out.println("Char gender ="+x.gender);
		
		
	}

}
