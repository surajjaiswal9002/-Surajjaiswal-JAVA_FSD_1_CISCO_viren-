package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputSteamproj 
{

	public static void main(String[] args) throws IOException
	{
		FileInputStream fin = new FileInputStream("C:\\Users\\SURAJ KUMAR JAISWAL\\Desktop\\newfile.txt");
		
		
		int ch;
		while((ch=fin.read())!=-1)
		{
			System.out.print((char)ch);
		}
		
		fin.close();
		
	}

}
