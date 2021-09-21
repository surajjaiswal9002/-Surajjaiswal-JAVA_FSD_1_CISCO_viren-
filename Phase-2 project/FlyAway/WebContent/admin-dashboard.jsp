<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>
<%@page import="com.servletprog.Login"%>

<%
    String driverName = "com.mysql.jdbc.Driver";
    String connectionUrl = "jdbc:mysql://localhost:3306/";
    String dbName = "flyaway";
    String userId = "root";
    String password = "tiger";

    try 
    {
        Class.forName(driverName);
    }
    catch (ClassNotFoundException e)
    {
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
    <title> FlyAway Airlines </title>
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
         .footer {
            position: fixed;
            left: 0;
            bottom: 0;
            width: 100%;
            background-color: #f5f5f5;
            color: #3b3b3b;
            text-align: center;
        }
    </style>
</head>
<body style="background-color:#92a8d1;">
<div class="w3-bar w3-white w3-card" id="myNavbar">
    <a href="index.jsp" class="w3-bar-item w3-button w3-wide">  FlyAway</a>
    <div class="w3-right w3-hide-small">
        <a href="login.jsp" class="w3-bar-item w3-button"><i class="fa fa-gear"></i> Admin Login</a>
    </div>
</div>

<%
    if (Login.isLoggedIn) {
%>

<div class="container">
   <h2 align="center"><b>Admin Dashboard</b></h2>
    <p align="center"><span><strong>You are LoggedIn as : <%=Login.email%>. Your Password is : <%=Login.password%></strong></span></p><br>
    <br>
    <div class="row">
        <div class="col-lg-3 col-md-4 col-sm-6 mb-4">
            <form method="post" action="${pageContext.request.contextPath}/change-password.jsp">
                <button type="submit" class="btn btn-success mb-2 btn-block">Change Password</button>
            </form>&ensp;
        </div>
        <div class="col-lg-3 col-md-4 col-sm-6 mb-4">
            <form method="post" action="${pageContext.request.contextPath}/add-flight.jsp">
                <button type="submit" class="btn btn-success mb-2 btn-block">Add new Flight</button>
            </form>&ensp;
        </div>
        <div class="col-lg-3 col-md-4 col-sm-6 mb-4">
            <form method="post" action="${pageContext.request.contextPath}/show-bookings.jsp">
                <button type="submit" class="btn btn-success mb-2 btn-block">Previous bookings</button>
            </form>&ensp;
        </div>
        <div class="col-lg-3 col-md-4 col-sm-6 mb-4">
            <form method="post" action="${pageContext.request.contextPath}/login.jsp">
                <button type="submit" class="btn mb-2 btn-danger btn-block">Logout</button>
            </form>
        </div>
        <br>
    </div>
</div>

<section class="container-fluid">
    <section class="row justify-content-center">
        <section>
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                   <th scope="col">name</th>
					<th scope="col">price</th>
					<th scope="col">f_no</th>
					<th scope="col">source</th>
					<th scope="col">destination</th>
					<th scope="col">date</th>
                </tr>
                </thead>
                <tbody>
                
               
                <%
                    try{
                        connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
                        statement=connection.createStatement();
                        String sql ="SELECT * FROM flight_details";
                        resultSet = statement.executeQuery(sql);
                        while(resultSet.next()){
                %>
                <tr>
                    <td><%=resultSet.getString("name") %></td>
					<td><%=resultSet.getString("price") %></td>
					<td><%=resultSet.getString("f_no") %></td>
					<td><%=resultSet.getString("source") %></td>
					<td><%=resultSet.getString("destination") %></td>
					<td><%=resultSet.getString("date") %></td>
                </tr>
                <%
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    else {
                        out.print("You must Login first");
                    }
                %>
                </tbody>
            </table>
        </section>
    </section>
</section>
<div class="footer" align="center">
   <b>&#169 Surajjaiswal FlyAway</b>
</div>


</body>
</html>