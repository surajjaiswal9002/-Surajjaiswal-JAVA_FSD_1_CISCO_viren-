package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Serial_DeSerial 
{

	public static void main(String[] args) throws IOException
	{
		Student obj = new Student(101,25,"chaitanya","agra",6);
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try
		{
			fos = new FileOutputStream("C:\\\\Users\\\\SURAJ KUMAR JAISWAL\\\\Desktop\\\\Student.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			System.out.println("Serialization done..");
			
		}catch(IOException e)
		{
			System.out.println(e);
		}
		finally
		{
			oos.close();
			fos.close();
		}
		
		//De-serialization 
		Student o = null;
		try {
			FileInputStream fis = new FileInputStream("C:\\\\Users\\\\SURAJ KUMAR JAISWAL\\\\Desktop\\\\Student.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			o = (Student) ois.readObject();
			ois.close();
			fis.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
			return;
		}
		catch(ClassNotFoundException ee)
		{
			System.out.println("Student class is not found");
			ee.printStackTrace();
			return;
		}
		
		System.out.println("Student Name "+o.getStuName());
		System.out.println("Student Age "+o.getStuAge());
		System.out.println("Student Roll No "+o.getStuRollNum());
		System.out.println("Student Address "+o.getStuAddress());
		System.out.println("Student Hight "+o.getStuHight());
		
		
		
		
	}
}
