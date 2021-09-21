<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.details.Booking" %>
<%@ page import="com.details.Search" %>

<%
	String p_name = request.getParameter("pname");
		Booking.p_email= request.getParameter("p_mobile");
		
		
		if (p_name == " "
		        || Booking.p_email == " ")
		       {
		    out.println("Please enter valid passenger details");
		}
    else 
    {
    
   
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
   <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Payment Details - FlyAway Airlines</title>
    <link rel = "shortcut icon" type = "image/png" href = "img/favicon.png" >
    <link rel="stylesheet" href="${pageContext.request.contextPath}/style/global.css">
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
    <section class="container-fluid bg">
        <section class="row justify-content-center">
            <div class="row">
                <div class="col">
                    <h1 align="center" style="color:red;"><b>Checkout</b></h1>
                    <p align="center" style="color:black;"><span><strong>Enter Payment Details</strong></span></p><br>
                </div>
            </div>
            
           <section class="col-sm-6 col-md-3">
               <form action="${pageContext.request.contextPath}/thank-you.jsp" method="post" class="form-container">
               <div class="form-group">
                    <label for=" Bank">Choose the Bank</label>
                    <select  class="form-control" id="Bank" name="Bank">
                        <option value="Banglore">SBI</option>
                        <option value="Hydrabad">HDFC</option>
                        <option value="Chennai">ICICI</option>
                        <option value="Jharsuguda">AXIS</option>
                    </select>
                </div>
                   <div class="form-group">
                       <label for="card_details">Name on Card</label>
                       <input type="text" class="form-control" id="name_on_card" name="name_on_card" placeholder="Enter Name">
                   </div>
                   <div class="form-group">
                       <label for="cardNumber">Card Number</label>
                       <input type="number" class="form-control" id="cardNumber" name="cardNumber" placeholder="Enter Card Number">
                   </div>
                   <br>
                   <p align="left"><span><strong>Total fare = <br> <%=Booking.price%> X <%=Search.persons%> persons = Rs.<%=Booking.price*Search.persons%></strong></span></p>
                   <button type="submit" class="btn btn-success btn-block" value="Submit">Confirm Payment</button>
               </form>
          </section>
        </section>
    </section>
<div class="footer" align="center">
    FlyAway by Suraj jaiswal
</div>

</body>
</html>
<%
    }
%>