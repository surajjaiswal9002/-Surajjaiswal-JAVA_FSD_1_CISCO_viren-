package FileHandling;

import java.io.FileReader;

public class F_ReaderDemo {

	public static void main(String[] args) 
	{
		
		char[] array = new char[45];
		
		try
		{
			FileReader input = new FileReader("C:\\Users\\SURAJ KUMAR JAISWAL\\Desktop\\newfile.txt");
			
			input.read(array);
			
			System.out.println("Data in the file:");
			System.out.println(array);
			
			input.close();
			
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}

}
