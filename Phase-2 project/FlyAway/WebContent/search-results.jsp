<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>
<%@ page import="com.details.*" %>
<%
    String driverName = "com.mysql.jdbc.Driver";
    String connectionUrl = "jdbc:mysql://localhost:3306/";
    String dbName = "flyaway";
    String userId = "root";
    String password = "tiger";
    String query = Search.getQuery();
    try {
        Class.forName(driverName);
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
%>
<!DOCTYPE html>
<html>
<head>

  	<meta charset="ISO-8859-1" name="viewport" content="width=device-width, initial-scale=1">
    <title>Search Results - FlyAway Airlines</title>
    <link rel = "shortcut icon" type = "image/png" href = "img/favicon.png" >
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <style>
        body,h1,h2,h3,h4,h5,h6 {font-family: "Raleway", sans-serif}
        body, html {
            height: 100%;
            line-height: 1.8;
        }
      
        .w3-bar .w3-button {
            padding: 16px;
        }
    </style>
</head>
<body style="background-color:#92a8d1;">
<div class="w3-bar w3-white w3-card" id="myNavbar">
    <a href="/index.jsp" class="w3-bar-item w3-button w3-wide">  FlyAway</a>
    <div class="w3-right w3-hide-small">
        <a href="/login.jsp" class="w3-bar-item w3-button"><i class="fa fa-gear"></i> Admin Login</a>
    </div>
</div>
<div class="container">
    <h2 align="center"><span><strong>Search Results</strong></span></h2>
    <p align="center"><span><strong>
        Showing available flights from <%=Search.source%> to  <%=Search.destination%> <br>
        Date of travel : <%=Search.date%>   <br>
        No of travellers :  <%=Search.persons%>  <br>
    </p>
    <table class="table table-hover table-striped">
        <thead>
        <tr>
           <td><b>name</b></td>
			<td><b>f_no</b></td>
			<td><b>source</b></td>
			<td><b>destination</b></td>
			<td><b>date</b></td>
			<td><b>price</b></td>
        </tr>
        </thead>
        <tbody>
        <br><p align="center"><span><strong>Select a flight</strong></span></p><br>
        <%
            try{
                connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
                statement=connection.createStatement();
                resultSet = statement.executeQuery(query);
                while(resultSet.next()){
        %>
        <tr bgcolor="#F5F5F5">
           <td><%=resultSet.getString("name") %></td>
			<td><%=resultSet.getInt("f_no") %></td>
			<td><%=resultSet.getString("source") %></td>
			<td><%=resultSet.getString("destination") %></td>
			<td><%=resultSet.getString("date") %></td>
			<td><%=resultSet.getInt("price") %></td>
            <td>
                <form action="${pageContext.request.contextPath}/booking-details.jsp" method="post">
                    <input type="hidden" id="name" name="name" value="<%=resultSet.getString("name")%>">
                      <input type="hidden" id="f_no" name="f_no" value="<%=resultSet.getString("f_no")%>">
                     <input type="hidden" id="source" name="source" value="<%=resultSet.getString("source")%>">
                    <input type="hidden" id="destination" name="destination" value="<%=resultSet.getString("destination")%>">
                    <input type="hidden" id="date" name="date" value="<%=resultSet.getString("date")%>">
                     <input type="hidden" id="price" name="price" value="<%=resultSet.getInt("price")%>">
                    <input type="submit" class="btn btn-success" value="Book This Flight">
                   
                </form>
            </td>
        </tr>
        <%
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        %>
        </tbody>
    </table>
</div>
</body>
</html>