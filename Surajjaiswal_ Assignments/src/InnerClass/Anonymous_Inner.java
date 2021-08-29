package InnerClass;

class Demo
{
	void show()
	{
		System.out.println("i m in show method of super class");
	}
}


public class Anonymous_Inner {
	
	static Demo d = new Demo()
	{
		void show()
		{
			super.show();
			{
				System.out.println(" i m in FlavorDemo class ");
			}
		}
	};

	public static void main(String[] args) 
	{
		d.show();
		
		
	}

}
