package org.Cisco.Oops;


//-----parent class
 abstract class MNC
{
	 abstract void American();
	 
	 abstract void India();
	 
	 MNC()
	 {
		 
		 System.out.println("Multi_National Company");
	 }
	 
	 void Product_based()
	 {
		 System.out.println("Developed Application");
	 }
	
}

 //---- child class
abstract class Infosys extends MNC
 {
	 
	 abstract void American();
	 
	 
	 
 }
 
//---- child of infosys
 class Hy extends Infosys 
 {

	@Override
	void American() 
	{
		System.out.println(" American Branch..");
		
	}

	@Override
	void India() 
	{
		System.out.println("Indian Branch..");
	
	}
	 
	void Service_based()
	{
		System.out.println(" Give Service");
	}
 }

public class Assignment_5 
{

	public static void main(String[] args) 
	{
		
		Infosys in = new Hy();
		in.American();
		in.India();
		in.Product_based();
		
	}

}
