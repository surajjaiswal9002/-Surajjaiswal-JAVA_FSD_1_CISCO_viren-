package Simplilearn_Assignment;

import java.io.StringBufferInputStream;

public class Assisted_String {

	public static void main(String[] args)
	{
		System.out.println("Method of String");
		
		String s1 = new String("Hello World ");
		System.out.println(s1.length());
		
		//substring
		String s2 = new String("Welcome");
		System.out.println(s2.substring(2));
		
		//String comparison
		String s3 ="Hello";
		String s4 = "hello";
		System.out.println(s3.compareTo(s4));
		
		//IsEmpty
		String s5="";
		System.out.println(s5.isEmpty());
		
		//toLowercase
		String s6 = " Navai";
		System.out.println(s6.toLowerCase());
		
		//replace
		String s7 = "manu";
		String replace = s2.replace('m', 'i');
		System.out.println(replace);
		
		
		//equals
		String x = "Welcome of cisco";
		String y = "WELCOME OF Cisco";
		System.out.println(x.equals(y));
		
		
		System.out.println("\nCreating BufferString");
		//BufferString and append method
		StringBuffer Buffer = new StringBuffer("Welcome to my program"); 
		Buffer.append("Focus on you career");
		System.out.println(Buffer);
		
		
	//Insert method
		Buffer.insert(0, "w");
		System.out.println(Buffer);
		
		
		//replace method
		StringBuffer  sb = new StringBuffer("Hello");
		sb.replace(0, 2, "heyyyy");
		
		//delete method
		sb.delete(0, 2);
		System.out.println(sb);
		
		//StringBulder
		System.out.println("\nCreating StringBuilder");
		StringBuilder s = new StringBuilder("Happy");
		s.append("Learning");
		System.out.println(s);
		
		System.out.println(s.delete(0, 1));
		System.out.println(s.insert(1, "Welcome"));
		System.out.println(s.reverse());
		
		
		//conversion
		System.out.println("\nConversion of String to string BUffer and Bulder");
		String ss2 = "My namula";
		
		StringBuffer sb3 = new StringBuffer(ss2);
		sb3.reverse();
		System.out.println("String Buffer");
		System.out.println(sb3);
		
		
		//Conversion from String object to StringBulder
		StringBuilder sb4 = new StringBuilder(ss2);
		sb4.append("bold");
		
		System.out.println("String to StrtingBuilder");
		System.out.println(sb4);
		
		
		

	}

}
