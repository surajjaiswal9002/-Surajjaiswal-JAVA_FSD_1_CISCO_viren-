package FileHandling;

import java.io.FileWriter;
import java.util.Scanner;

public class FileTest
{
		
		public static void main(String[] args) 
		{
			
			try
			{ 
				Scanner sc =new Scanner(System.in);
			    System.out.println("Enter data in the file.");
				String s= sc.nextLine();
				FileWriter output = new FileWriter("C:\\Users\\SURAJ KUMAR JAISWAL\\Desktop\\write.txt");
			
			output.write(s);
			System.out.println("Data is enterd in the file");
			
			output.close();
		   }
		   catch(Exception e)
		   {e.getStackTrace();}
		}

	

}
