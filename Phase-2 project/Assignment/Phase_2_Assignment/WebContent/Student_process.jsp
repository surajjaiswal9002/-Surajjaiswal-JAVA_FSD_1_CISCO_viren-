<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <<jsp:include page="header.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="std" class="com.jsp.Student"/>
	<jsp:setProperty property="*" name="std"/>  
	
		Record:<br>  
	<jsp:getProperty property="stuname" name="std"/><br>  
	<jsp:getProperty property="stuid" name="std"/><br>  
	<jsp:getProperty property="stuemail" name="std" /><br>
	<jsp:getProperty property="stuage" name="std"/><br>  
	<jsp:getProperty property="studept" name="std"/><br>  
	<jsp:getProperty property="stucourse" name="std" /><br> 

</body>
</html>