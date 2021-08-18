package org.Cisco.javaclass;

public class N {
	
	protected long d =1233L  ;
	public int e = 34;
	double f = 23.4f;
	
	 public void npubl()
		{
			System.out.println("public method");
			npri();
		}
		protected void npro()
		{
			System.out.println("protected method");
		}
		
		void ndef()
		{
			System.out.println("Default method");
		}
		private void npri()
		{
			System.out.println("Private method");
		}

}
