package FileHandling;

import java.io.File;
import java.io.IOException;

public class F_HandlingExp {

	public static void main(String[] args) 
	{
		
		try
		{
			File f = new File("C:\\Users\\SURAJ KUMAR JAISWAL\\Desktop\\file.txt");
			if(f.createNewFile())
			{
				System.out.println("New file is created");
			}
			else
			{
				if(f.exists())
				{
					System.out.println("File already exists");
					System.out.println("File path "+f.getAbsolutePath());
					System.out.println("file name "+f.getName());
					System.out.println("file class "+f.getClass());
					System.out.println("file class "+f.getParent());
					System.out.println("Fle space allocaytted "+f.getUsableSpace());
					System.out.println("File length "+f.length());
					System.out.println("File length "+f.list());
				
					
				}
				else
				{
					System.out.println("File doesnot exist");
				}
				
				
				boolean b = f.delete();
				if(b == true)
				{
					System.out.println("File deleted ");
				}
				else
				{
					System.out.println("file not deleted");
				}

			}
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
