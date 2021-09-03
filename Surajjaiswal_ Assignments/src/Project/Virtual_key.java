//Phase 1 Virtual Key Repository project : Suraj Kumar Jaiswal :  Code 1 : Main

package Project;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Virtual_key 
{
	public static void main(String[] args) throws IOException, InvalidFileException
	{	
		
		boolean running = true;
		
		Scanner sc = new Scanner(System.in);
	
		//object of the class FileHandle
		FileHandle fh = new FileHandle();
		
		char ch=0;

		fh.Welcomemsg("Lockers Pvt.Ltd","Suraj Kumar jaiswal");
		

	
		do
		{
			//Menu Bar 
			
			System.out.println(String.format("************\n"
											+"MENU BAR : \n"
											+"************"));
			System.out.println("- 1. ViewFile");
			System.out.println("- 2. addFile");
			System.out.println("- 3. deleteFile");
			System.out.println("- 4. searchFile");
			System.out.println("- 5. Exit");
			System.out.println();
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				//open file
				System.out.println("======= Inside The Folder ======");
				fh.openFile(null);
				
				break;
				
				
			case 2:
				//Add the file
				System.out.println("Enter the File Name to Add from the \"Virtual Key\" folder ");
				try
				{
					String fileToAdd = sc.next(); //user input
					
					fh.addFile(fileToAdd, sc);   //method addfile
				}
				catch (Exception e)
				{
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				//Delete the file
				System.out.println("Enter the file name to Delete from the \"Virtual Key\"folder: ");
				try
				{
					String fileToDelete = sc.next();   //user input
					
					fh.deleteFile(fileToDelete, sc); //method delete file
				}
				catch (InvalidFileException e) 
				{
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				//Search the file
				System.out.println("Enter the file name to search from the \"virtual key\" folder: ");
				try
				{
					String fileName = sc.next();   //user input
				
					//FileHandle.openFile("C:\\Users\\SURAJ KUMAR JAISWAL\\Desktop\\Virtual Key\\");  
					FileHandle.display(fileName, "C:\\Users\\SURAJ KUMAR JAISWAL\\Desktop\\Virtual Key\\");
				}
				catch (Exception e) 
				{
					// TODO: handle exception
				}
					break;
				
			case 5:
				//Exit the program
				System.err.println("------- Thank You! Using This Application -------:) ");
				running = false;
				
				sc.close();
				
				System.exit(0); //using exit method to exit the program
			default :
				System.err.println("---Please Enter the Valid Number!!---- \n");
				break;
			} 
			
			fh.Endisplay();            
            System.out.println("\nDo you want to continue (Type Y or N) \n");
            ch = sc.next().charAt(0);
			 	
		} while (ch == 'Y'|| ch == 'y');
		{
			if(running == true);
			
			
		}
				
	}
}


	
//Custom Exception
class InvalidFileException extends Exception
{
	public InvalidFileException(String s)
	{
		super(s);
	}
}
