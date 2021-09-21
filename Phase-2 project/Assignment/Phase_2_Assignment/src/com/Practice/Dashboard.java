package com.Practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Dashboard")
public class Dashboard extends HttpServlet 
{
	        private static final long serialVersionUID = 1L;
	 
	    public Dashboard()
	    {
	        super();
	        // TODO Auto-generated constructor stub
	    }

	        
	        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	        {
	               
	        
	            PrintWriter out = response.getWriter();
	            out.println("<html><body>");
	            
	            HttpSession session=request.getSession(true);  
	            String userId = null;
	            if (session.getAttribute("userid") != null)
	                userId =(String)session.getAttribute("userid");  
	            if (userId == null )
	            {
	                out.println("No UserId was found in session.<br>");
	            } else
	            {
	                out.println("UserId obtained from session :" + userId + "<br>");
	            }
	            out.println("</body></html>");

	        }

	        
	        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	        {
	               
	                doGet(request, response);
	        }

	}



