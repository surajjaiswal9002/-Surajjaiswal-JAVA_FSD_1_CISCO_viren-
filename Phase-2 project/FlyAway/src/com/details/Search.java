package com.details;

import java.sql.Date;

public class Search 
{
	 public static String name;
	 public static int f_no;
	 public static String source;
	 public static String destination;
	 public static String date;
	 public static int persons;
	 public static int price;
	 
	    

	    public static String getQuery() 
	    {
	        return "SELECT * FROM flight_details";
	    }
}
