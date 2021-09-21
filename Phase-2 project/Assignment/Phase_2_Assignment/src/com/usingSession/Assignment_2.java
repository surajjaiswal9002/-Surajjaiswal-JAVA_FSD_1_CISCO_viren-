package com.usingSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Assignment_2
 */
@WebServlet("/Assignment_2")
public class Assignment_2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		try
		{
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			
			String name = request.getParameter("userName");
			String password = request.getParameter("userPassword");
					
			pw.print("hello "+name);
			pw.print("password is "+password);
			
			HttpSession sess = request.getSession();
			sess.setAttribute("Uname", name);
			sess.setAttribute("Upassword", password);
			sess.setMaxInactiveInterval(2000);
			
			pw.print("<a href='Welcome'> view details </a>");
			pw.close();
			
			
		}
		catch (Exception e)
		{
			System.out.println(e+"Enter the valid deatils");
			
		}
		
	}

}
