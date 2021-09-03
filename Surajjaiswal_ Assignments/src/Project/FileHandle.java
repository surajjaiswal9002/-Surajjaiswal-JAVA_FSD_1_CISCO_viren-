package Project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.DirectoryStream.Filter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FileHandle
{
	//Method for search the file in the folder
	public static void searchFile(String path, String fileName, List<String> fileListNames) 
	{
		File dir = new File("C:\\Users\\SURAJ KUMAR JAISWAL\\Desktop\\Virtual Key");
		File[] files = dir.listFiles();
		List<File> filesList = Arrays.asList(files);

		if (files != null && files.length > 0)
		{
			for (File file : files) 
			{

				if (file.getName().startsWith(fileName)) 
				{
					fileListNames.add(file.getAbsolutePath());	
				}

				// Need to search in directories separately to ensure all files of required
				// fileName are searched
				if (file.isDirectory()) 
				{
					searchFile(file.getAbsolutePath(), fileName, fileListNames);	
				}
			}
		}
	}

//Method  for Add file in the folder
	public static void addFile(String fileToAdd,Scanner sc) throws InvalidFileException
	{
		Path pathToFile = Paths.get("C:\\Users\\SURAJ KUMAR JAISWAL\\Desktop\\Virtual Key\\" +fileToAdd);   //path
		
		try
		{
			Files.createDirectories(pathToFile.getParent());   //file Add in the directory
			Files.createFile(pathToFile);  
			
				System.out.println(fileToAdd + " File  created successfully");  // 

		} 
		catch (IOException  e) 
		{
			
			System.err.println("File Already present \n"+e.getMessage());    //file already present, so it handle the exception
		}
		
	}
//Method for sort the file in Ascending order
	public static void openFile(String sname)
	{
		try
		{
			// path of the folder
			File fdir = new File("C:\\Users\\SURAJ KUMAR JAISWAL\\Desktop\\Virtual Key"); //path 
			if(fdir.isDirectory())
			{
				List listFile = Arrays.asList(fdir.list());    //make a list
				
				
				Collections.sort(listFile);   //sort
				System.out.println("File Name Sorted In Ascending Order");
				for(Object name : listFile)
				{
					System.out.println(name);   //print the list
				}
			}
			else
			{
				System.out.println(fdir.getName() +" No Such File Found!----");   
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
//Method for display the file 
	public static  Object display(String fileName, String path)
	{
		List<String> fileListNames = new ArrayList<>();
		FileHandle.searchFile(path, fileName, fileListNames);   

		if (fileListNames.isEmpty())
		{
			
			System.out.println("\n Unsuccessful Operation \n------ File Not find with the given file name \"" + fileName + "\" ------\n\n");  //search file if  not found print msg 
		} 
		else 
		{
			System.out.println("\n Successful Operation \n----- Found file at below location(s):");  

			List<String> files = IntStream.range(0, fileListNames.size())   
					.mapToObj(index -> (index + 1) + ": " + fileListNames.get(index)).collect(Collectors.toList());   //path of the file print 

			files.forEach(System.out::println);
		}

		return fileListNames;  
	}
// Method for delete the file 
	public static void deleteFile(String fileToDelete,Scanner sc) throws InvalidFileException  //Handle custom Exception
	{
		
		       
		File f= new File("C:\\Users\\SURAJ KUMAR JAISWAL\\Desktop\\Virtual Key\\"+fileToDelete);           //file to be delete  
		if(f.delete())                      //returns Boolean value  
		{  
			System.out.println(f.getName() + " Sucessfully Deleted");   //getting and printing the file name  
		}  
		else  
		{  
				throw new InvalidFileException("File Not Found");  //file not present its show message
		}  
		
	}
// method to select yes or no , yes to give option and no directly exit 
public void Endisplay() throws InvalidFileException
{
	
}



public void Welcomemsg(String appName, String developerName)
{
	//Welcome page Message 
	String welcome = String.format("*********************************************************\n "
					+"\nWelcome to the Company : %s.com\n" 
					+ "This Application Was Developed by : MR %s \n\n"
					+"*********************************************************\n", appName , developerName) ;
	//print statement
	System.out.println(welcome);
	
	//Application Function
	String appFunction = String.format(" You Can Use This Application :-\n"
						+"-----------------------------------------\n"
						+"(i)  Retrive All The File Name In Ascending Order\n"
						+"(ii)  ADD , DELETE & SEARCH The File Name  \n"
						+"[ Warning - Please Ensure The Correct File Name Is Provided By DELETING & SEARCHING File ]\n\n"
						+"\n\n Choose the option in the Give Menu Bar \n"
						);
	//print statement
	System.out.println(appFunction);
	

	
	
	
}







	
	



	



	
	
}
