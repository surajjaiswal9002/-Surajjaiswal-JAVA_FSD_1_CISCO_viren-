package com.phase2_advjava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class InterfaceDemo implements Servlet
{
	ServletConfig config = null;
	public void init(ServletConfig config)
	{
		this.config = config;
		System.out.println("Initialization Complete");
	}
	
	public void service(ServletRequest req,ServletResponse res ) throws IOException , ServletException 
	{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.print("<html>");
		pw.print("<body>");
		pw.print("In the service() method <br>");
		pw.print("</body>");
		pw.print("</html>");
	}
	
	public void destroy()
	{
		System.out.println("In destroy() method");
	}
	
	public ServletConfig getServletConfig()
	{
		return config;
		
	}
	
	public String getServletString()
	{
		return "This is a sample servlet info";
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
