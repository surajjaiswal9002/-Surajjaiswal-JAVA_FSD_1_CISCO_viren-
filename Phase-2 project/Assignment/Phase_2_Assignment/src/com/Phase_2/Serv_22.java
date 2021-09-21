package com.Phase_2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Serv_22
 */
@WebServlet("/Serv_22")
public class Serv_22 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		 ServletContext c2=getServletContext();
		
		
		 int s3=Integer.parseInt(c2.getInitParameter("n3"));
		 int s4=Integer.parseInt(c2.getInitParameter("n4"));
		
		
		//int s5 = Integer.parseInt(s3+s4);
		
		pw.print("n3 value is "+s3 +" \nn4 value is "+s4);
		pw.print("total is "+(s3+s4));
		pw.close();
	}

}
