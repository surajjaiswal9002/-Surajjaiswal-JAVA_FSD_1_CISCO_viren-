package com.servletprog;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servletprog.Login;

/**
 * Servlet implementation class ChangePassword
 */
@WebServlet("/ChangePassword")
public class ChangePassword extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		 PrintWriter out = response.getWriter();
	        String pass = request.getParameter("passwordEntered");
	        if (!Login.isLoggedIn){
	            out.println("You must login first");
	        }
	        else if (pass.equals("")){
	            out.println("Password can't be empty");
	        }
	        else if (Login.isLoggedIn && !pass.equals("")){
	            Login.password = pass;
	            out.println("Password changed. New Password is "+Login.password);
	        }
	        else {
	            out.println("Sorry, Something went wrong");
	        }
	        out.close();
	}

}
