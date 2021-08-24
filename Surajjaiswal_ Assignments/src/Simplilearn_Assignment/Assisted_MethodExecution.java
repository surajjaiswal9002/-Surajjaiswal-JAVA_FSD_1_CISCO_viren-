package Simplilearn_Assignment;

public class Assisted_MethodExecution
{
	
	public int multipynumber(int a, int b)
	{
		int z = a*b;
		return z;
	}
	public static void main(String[] args) 
	{
		Assisted_MethodExecution am = new Assisted_MethodExecution();
		int ans = am.multipynumber(11, 67);
		
		System.out.println("Multiplication = "+ans);

	}

}
