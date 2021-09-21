package advanced.java.program;

import java.io.IOException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {    
    
	@Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
    {                                                      
        ServletContext ctx = getServletContext();          
        System.out.println(ctx.getAttribute("ContextParam"));
    }                                              
}