<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.details.*" %>
<%
	Booking.p_address =  request.getParameter("f_no");
	Booking.name = request.getParameter("name");
%>
   

<!DOCTYPE html>
<html>
<head>

 <meta charset="ISO-8859-1" name="viewport" content="width=device-width, initial-scale=1">
    <title>Booking Details - FlyAway Airlines</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/style/global.css">
    <link rel = "shortcut icon" type = "image/png" href = "img/favicon.png" >
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <style>
        body,h1,h2,h3,h4,h5,h6 {font-family:"Raleway", sans-serif}
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
    <a href="index.jsp" class="w3-bar-item w3-button w3-wide">  FlyAway</a>
    <div class="w3-right w3-hide-small">
        <a href="login.jsp" class="w3-bar-item w3-button"><i class="fa fa-gear"></i> Admin Login</a>
    </div>
</div>

 <section class="container-fluid bg" t>
        <section class="row justify-content-center">
            <div class="row">
                <div class="col">
                    <h1 align="center" style="color:red;"><b>Booking Details</b></h1>
                    <p align="center" style="color:black;"><span><strong>Enter Passenger Details</strong></span></p><br>
                </div>
            </div>
            <section class="col-sm-6 col-md-3" ">
                <form action="${pageContext.request.contextPath}/payment.jsp" method="post" class="form-container">
                    <div class="form-group"  >
                        <label   for="p_name">Passenger Name</label>
                        <input type="text" class="form-control" id="p_name" name="p_name" placeholder="Enter name ">
                    </div>
                    <div class="form-group"  >
                        <label   for="p_address">Address</label>
                        <input type="text" class="form-control" id="p_address" name="p_address" placeholder="Enter address ">
                    </div>
                     <div class="form-group"  >
                        <label   for="p_age"> Age</label>
                        <input type="number" class="form-control" id="p_age" name="p_age" placeholder="Enter age ">
                    </div>
                     <div class="form-group">
                        <label for="p_mobile">Mobile</label>
                        <input type="number" class="form-control" id="p_mobile" name="p_mobile" placeholder="Enter Mobile number">
                    </div>
                    <div class="form-group"  >
                        <label for="p_email">Email</label>
                        <input type="email" name="p_email" class="form-control" id="p_email" aria-describedby="emailHelp" placeholder="Enter email">
                    </div>
                     <div class="form-group"  >
                        <label for="country">country</label>
                        <input type="text" name="country" class="form-control" id="country" placeholder="Enter Country name">
                    </div>
                   
                    <br>
                    <button type="submit" class="btn btn-success btn-blue" value="Submit">Submit</button>
                </form>
            </section>
        </section>
    </section>
 <div class="footer" align="center">
   <b>&#169 Surajjaiswal FlyAway</b>
</div>

</body>
</html>