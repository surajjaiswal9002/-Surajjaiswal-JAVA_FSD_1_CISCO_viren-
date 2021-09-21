<%@page import="javax.swing.GroupLayout.Alignment"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>FlyAway</title>
    <link rel = "shortcut icon"  >
 	<meta  charset="ISO-8859-1" name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
   
        body,h1,h2,h3,h4,h5,h6 {  font-family: "Raleway", sans-serif}
        body, html {
            height: 100%;
            line-height: 1.8           
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
<body style="background-color:#92a8d1;";">
  <div class="w3-top">
        <div class="w3-bar w3-white w3-card" id="myNavbar">
            <a href="index.jsp" class="w3-bar-item w3-button w3-wide">  FlyAway</a>
            <div class="w3-right w3-hide-small">
                <a href="login.jsp" class="w3-bar-item w3-button"><i class="fa fa-gear"></i> Admin Login</a>
            </div>
        </div>
    </div>
    <header  id="home">
        <br>
        <div  align="center"  class="w3-display-center w3-text-red" style="padding:40px">
            <span class="w3-jumbo w3-hide-small"><strong>welcome to the flyaway</strong></span>

            <p style="font-size:30px">Book  Flight Tickets at best price.</p>
        </div>
        <div align="center" class="w3-display-center w3-text-white" style="padding:48px">
            <p><br>
            <a href="searchportal.jsp" class="w3-button w3-white w3-padding-large w3-large w3-margin-top w3-opacity w3-hover-opacity-on">
            <i class="fa fa-fighter-jet"></i>
			  Flight Booking
			 </a>
			 </p>
            <p>
            <a href="login.jsp" class="w3-button w3-white w3-padding-large w3-large w3-margin-top w3-opacity w3-hover-opacity-on">
            <i class="fa fa-gear"></i> 
              Admin Login
             </a>
             </p>
        </div>
    </header>
    <div class="footer">
       <b>&#169 Surajjaiswal FlyAway</b>
    </div>

</body>
</html>