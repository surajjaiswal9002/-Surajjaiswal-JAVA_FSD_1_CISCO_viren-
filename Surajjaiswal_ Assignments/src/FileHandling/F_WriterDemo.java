package FileHandling;

import java.io.FileWriter;
import java.util.Scanner;

public class F_WriterDemo {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the TXT");
		String s = sc.next();
		
		try
		{
			FileWriter output = new FileWriter("C:\\Users\\SURAJ KUMAR JAISWAL\\Desktop\\newfile.txt");
			
			
			output.write(s);
			System.out.println("Data is written to the file");
			
			output.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
