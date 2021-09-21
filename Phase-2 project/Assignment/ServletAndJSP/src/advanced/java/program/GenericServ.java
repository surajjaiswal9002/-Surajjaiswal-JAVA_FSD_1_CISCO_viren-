package advanced.java.program;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericServ extends GenericServlet {

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
	 
		  PrintWriter out = response.getWriter();
	      String login= request.getParameter("loginid");
	      String password= request.getParameter("password");

	      out.print("You have successfully login :");
	      out.println("Your login ID is: "+login);
	      out.println("Your password is: " +password);
	      out.close();		
	}
}
