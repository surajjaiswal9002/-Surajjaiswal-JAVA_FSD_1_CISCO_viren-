<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Get Header Example</title>
</head>
<body>
<%
        String office = request.getParameter("office");
        if (office != null)
                out.println("value of Office obtained :" + office + "<br>");
        else
                out.println("No value of Office found<br>");
%>

</body>
</html>
