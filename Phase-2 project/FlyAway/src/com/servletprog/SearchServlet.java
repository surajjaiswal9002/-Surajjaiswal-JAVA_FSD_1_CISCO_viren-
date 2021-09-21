package com.servletprog;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.details.*;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		 	Search.date = req.getParameter("date");
	        Search.source = req.getParameter("source");
	        Search.destination = req.getParameter("destination");
	        Search.persons = Integer.parseInt(req.getParameter("persons"));

	        if (Search.date.equals("")) {
	            PrintWriter out = resp.getWriter();
	            out.println("Please enter a valid date");
	        }
	        else {
	            Search.date = getDate(Search.date);
	            resp.sendRedirect("search-results.jsp");
	        }
		
	}

	private String getDate(String date) {
		 LocalDate dt = LocalDate.parse((CharSequence) date);
	        return dt.getDayOfWeek().toString();
	}

	
}
