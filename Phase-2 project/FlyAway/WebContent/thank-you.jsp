<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.details.Search" %>
<%@ page import="com.details.Booking" %>
<%@ page import="com.servletprog.Login" %>

<!DOCTYPE html>
<html>
<head>

 <meta charset="ISO-8859-1" name="viewport" content="width=device-width, initial-scale=1">
    <title>Thank You - FlyAway Airlines</title>
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
<div class="jumbotron text-center" align="center">
  
                  <span class="w3-jumbo w3-text-red"><strong>Alet!</strong></span>
            <form  action="${pageContext.request.contextPath}/end.jsp" method="post" class="form-container">
               <a  style="font-size:30px" align="center" ><span><strong>Total payment = <%=Booking.price%> X <%=Search.persons%> persons = Rs.<%=Booking.price*Search.persons%></strong></span></a>
                   <button type="submit" class="btn btn-success btn-block" value="Submit">Confirm Payment</button>
               </form>         
     
 

<div class="footer" align="center">
 <p>
    Having trouble? Contact us</a><br>
    Email- flyaway@gmail.com<br>
    Mob - 7978702558
  </p><br>
   <b>&#169 Surajjaiswal FlyAway</b>
</div>

</body>
</html>
