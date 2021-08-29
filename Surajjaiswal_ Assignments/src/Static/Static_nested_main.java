package Static;

class MotherBoard
{
	static class USB
	{
		int usb2 = 2;
		int usb3 = 3;
		int getTotalPorts()
		{
			return usb2 + usb3;
		}
	}
}


public class Static_nested_main 
{
	public static void main(String[] args)
	{
		MotherBoard.USB usb = new MotherBoard.USB();
		System.out.println("Total ports = "+usb.getTotalPorts());
	}

}
