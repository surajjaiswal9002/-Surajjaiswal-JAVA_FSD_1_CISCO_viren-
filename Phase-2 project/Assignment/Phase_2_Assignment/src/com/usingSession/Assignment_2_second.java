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
 * Servlet implementation class Assignment_2_second
 */
@WebServlet("/Assignment_2_second")
public class Assignment_2_second extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,
	IOException
	{
		try
		{
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			
			HttpSession sess = request.getSession(false);
			
			String myName = (String) sess.getAttribute("Uname");
			String myPass = (String) sess.getAttribute("Upassword");
			
			pw.print("Welcome "+myName);
			pw.print("<br>");
		      pw.print("session creation time" + sess.getCreationTime());
		      pw.print("<br>");
		      pw.print("session last accessed time" +sess.getLastAccessedTime());
		      pw.print("<br>");
		      pw.print("session max interval time" +sess.getMaxInactiveInterval());
		      pw.print("<br>");
		      pw.print("session servelt context" +sess.getServletContext());
		      
		      sess.invalidate();
		      pw.print("<br>");
		      
		      pw.print("Name: "+myName+" Pass: "+myPass);
		      pw.close();
			
			
		}
		catch (Exception e) {
			System.out.println("Enter valid details");
		}
	}

}
