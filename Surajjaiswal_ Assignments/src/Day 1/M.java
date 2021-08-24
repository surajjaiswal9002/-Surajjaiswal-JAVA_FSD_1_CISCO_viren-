package org.Cisco.javaclass;


 public class M 
{
	 
	 private int a =12;
	 long b = 13L;
	 protected float c = 14f;
	 
	
		public void mpubl()
		{
			//System.out.println("public method");
			pri();
		}
		protected void pro()
		{
			System.out.println("protected method");
			
		}
		
		void def()
		{
			System.out.println("Default method");
			
		}
		private void pri()
		{
			//System.out.println("Private method ");
			System.out.println("private value a = "+a);
		}		
}
