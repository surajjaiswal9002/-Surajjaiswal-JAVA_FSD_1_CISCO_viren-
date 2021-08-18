package org.Cisco.javaclass.p2;

class X 
{
	private int no =1;
	long large =22312345l;
	protected float per =3.22f;
	public char gender ='M';
	
	public void xpubl()
	{
		System.out.println("public method");
		xpri();
	}
	protected void xpro()
	{
		System.out.println("protected method");
	}
	
	void xdef()
	{
		System.out.println("Default method");
	}
	private void xpri()
	{
		System.out.println("Private method : no = "+no);
	}
	

}
