<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.Time"%>
<%@page import="java.util.Date"%>
<%@page import="javax.naming.Context"%>
<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- 1 -->
<%= "Context Method" %>
<br><br>
<%=config.getServletName()%><br><br>
<%= config.getClass() %><br>
<%= config.getInitParameter("Suraj jaiswal") %><br>
<%= config.getServletContext() %> <br>


<br><br>
<!-- 2 -->
<%= "Context Method" %><br>
<%=getServletContext()%><br>
<%=pageContext.getClass().getName()%><br>
<% pageContext.setAttribute("Test", "Test Value"); %>

<%PrintWriter pw = response.getWriter();
ServletContext sc = getServletContext();
String name = sc.getInitParameter("Suraj");
String mail = sc.getInitParameter("suraj@Email.com");
%>
<%="Name = "+name %><br>
<%="Email = "+mail %><br>
<% sc.getAttribute("Name of the Attribute");%><br>
<%= "get Attribute Name "+sc.getAttributeNames() %><br>
<%= "class name "+getClass() %><br>


<!-- 3 -->
<%= " Session program" %>
<%
   // Get session creation time.
  Time createTime = new Time(session.getCreationTime());
   
   // Get last access time.
   Time lastAccessTime = new Time(session.getLastAccessedTime());
   
   
   String title = "Welcome ";
   Integer visitCount = new Integer(0);
   String visitCountKey = new String("visitCount");
   String userIDKey = new String("userID");
   String userID = new String("ABCD");

   // Check if this is new comer on your Webpage.
   if (session.isNew() ){
      title = "Welcome to my website";
      session.setAttribute(userIDKey, userID);
      session.setAttribute(visitCountKey,  visitCount);
   } 
   visitCount = (Integer)session.getAttribute(visitCountKey);
   visitCount = visitCount + 1;
   userID = (String)session.getAttribute(userIDKey);
   session.setAttribute(visitCountKey,  visitCount);
%>

<%-- response object --%>
<%
    PrintWriter pw1 =  response.getWriter();
    pw1.print("Response writer example.");
    
    ArrayList<String> al = new ArrayList<String>();
%>
<br><br>
 
<%-- request object --%>
<strong>Request - locale example: </strong><%=request.getLocale().toString() %><br><br>
 
<%-- out object --%>
<strong>Out object prints: </strong><%out.print("This is an example");%><br><br>
 
<%-- config object --%>
<strong>Config example - servlet name: </strong><%=config.getServletName()%><br><br>
 
<%-- application object --%>
<strong>Application example - server info: </strong><%=application.getServerInfo()%><br><br>
 
<%-- page object --%>
<strong>Page example - page name: </strong><%=page.getClass().getName()%><br><br>
 
<%-- session object --%>
<strong>Session example - creation time: </strong><%=session.getCreationTime()%><br><br>
 
<%-- pageContext object --%>
<% pageContext.setAttribute("Test", "Test Value"); %>
<strong>PageContext example - class name: </strong><%=pageContext.getClass().getName() %><br><br>
 
 
 <!--  

<html>
   <head>
      <title>Session Tracking</title>
   </head>
   
   <body>
      <center>
         <h1>Session Tracking</h1>
      </center>
      
      <table border = "1" align = "center"> 
         <tr bgcolor = "#949494">
            <th>Session info</th>
            <th>Value</th>
         </tr> 
         <tr>
            <td>id</td>
            <td><% out.print( session.getId()); %></td>
         </tr> 
         <tr>
            <td>Creation Time</td>
            <td><% out.print(createTime); %></td>
         </tr> 
         <tr>
            <td>Time of Last Access</td>
            <td><% out.print(lastAccessTime); %></td>
         </tr> 
         <tr>
            <td>User ID</td>
            <td><% out.print(userID); %></td>
         </tr> 
         <tr>
            <td>Number of visits</td>
            <td><% out.print(visitCount); %></td>
         </tr> 
      </table> 
      
   
   </body>
</html>
-->


</body>
</html>