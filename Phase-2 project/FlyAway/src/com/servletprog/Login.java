package com.servletprog;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Login")
public class Login extends HttpServlet {
	
	 public static boolean isLoggedIn = false;
	    public static String password = "Suraj";
	    public static String email = "admin@flyaway.com";

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 PrintWriter out = resp.getWriter();

	        String email = req.getParameter("emailEntered");
	        String pass = req.getParameter("passwordEntered");

	        if (email.equals(Login.email) && pass.equals(Login.password)){
	            isLoggedIn = true;
	            out.println("You have LoggedIn");
	            resp.sendRedirect("admin-dashboard.jsp");
	        }
	        else {
	            isLoggedIn = false;
	            out.println("Login Failed : Incorrect email or Password");
	        }
	        out.close();
	}

}
