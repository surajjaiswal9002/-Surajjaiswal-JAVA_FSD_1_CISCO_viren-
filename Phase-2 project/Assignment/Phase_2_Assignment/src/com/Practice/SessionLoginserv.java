package com.Practice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionLoginserv
{
    private static final long serialVersionUID = 1L;
    

    public SessionLoginserv() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
            // TODO Auto-generated method stub
            
             String userId = request.getParameter("userid");
             HttpSession session=request.getSession();  
         session.setAttribute("userid",  userId);
                      
         response.sendRedirect("dashboard");  
            
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        doGet(request, response);

    }

}
