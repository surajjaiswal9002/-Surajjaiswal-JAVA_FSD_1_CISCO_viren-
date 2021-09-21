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
 * Servlet implementation class Serv_32
 */
@WebServlet("/Serv_32")
public class Serv_32 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		 ServletContext c3=getServletContext();
		
		
		 int s1=Integer.parseInt(c3.getInitParameter("n1"));
		int s2=Integer.parseInt(c3.getInitParameter("n2"));
		int s3=Integer.parseInt(c3.getInitParameter("n3"));
		
		
		//int s5 = Integer.parseInt(s3+s4);
		
		pw.print("n3 value is "+s1 +" \nn4 value is "+s2);
		pw.print("total is "+(s1+s2+s3));
		pw.close();
	}

}
