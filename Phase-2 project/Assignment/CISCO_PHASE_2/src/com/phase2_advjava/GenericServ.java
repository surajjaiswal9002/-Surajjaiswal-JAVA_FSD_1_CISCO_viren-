package com.phase2_advjava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericServ extends GenericServlet
{
	public void service(ServletRequest request , ServletResponse response ) throws IOException ,ServletException 
	{
		PrintWriter out = response.getWriter();
		String login = request.getParameter("Login");
		String password = request.getParameter("password");
		
		out.println("Successfully Login");
		out.print("Login id is : "+login);
		out.print("password is : "+password);
		out.close();
	}

}
