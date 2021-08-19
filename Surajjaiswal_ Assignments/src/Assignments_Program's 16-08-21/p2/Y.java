package org.Cisco.javaclass.p2;
import org.Cisco.javaclass.P;
import org.Cisco.javaclass.M;
import org.Cisco.javaclass.N;
 public class Y
 {
	 public static  void main(String[] args) 
	 {
		System.out.println("---M class---");
		//call all the method of m
		M m = new M();
		m.mpubl();
		
		System.out.println();
		
		System.out.println("---N class---");
		//call all the method of n
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
