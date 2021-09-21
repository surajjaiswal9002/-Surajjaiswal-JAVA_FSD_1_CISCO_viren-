package advanced.java.program;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
 
public class LoggerFilter implements Filter {   // Step 1: implements Filter interface
 
	FilterConfig filterConfig = null;  // Step 2: create a reference of the FilterConfig
 
	public void destroy() {
		System.out.println("we are in the destroy method of Logger Filter");
	}
 
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
 
		System.out.println("In LoggerFilter before doFilter");
		chain.doFilter(request, response);
		System.out.println("In LoggerFilter after doFilter");
 
	}
 
	public void init(FilterConfig fConfig) throws ServletException {
		this.filterConfig = fConfig;
	}
 
}