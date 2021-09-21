<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

 <meta charset="ISO-8859-1" name="viewport" content="width=device-width, initial-scale=1">
    <title>FlyAway</title>
    <link rel = "shortcut icon" type = "image/png" href = "img/favicon.png" >
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
 
  
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <style>
        body,h1,h2,h3,h4,h5,h6 {font-family:"Raleway", sans-serif}
        body, html {
       		 align= "center";
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
                <h2 align="center" style="color:red;"><b>FlyAway Ticket Booking</b></h2>
                <br>
            </div>
        </div>
       
        <section class="col-sm-6 col-md-3" >
        
            <form action="search" class="form-container" >
                <div class="form-group" >
                    <label for="date">Date</label>
                    <input align="center" type="date"  class="form-control" id="date" name="date" placeholder="[2021-09-20]">
                </div>
                <div class="form-group">
                    <label for="source">Source</label>
                    <select  class="form-control" id="source" name="source">
                        <option value="Banglore">Banglore</option>
                        <option value="Hydrabad">Hydrabad</option>
                        <option value="Chennai">Chennai</option>
                        <option value="Jharsuguda">Jharsuguda</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="destination">Destination</label>
                    <select  class="form-control" id="destination" name="destination">
                       <option value="Banglore">Banglore</option>
                        <option value="Hydrabad">Hydrabad</option>
                        <option value="Chennai">Chennai</option>
                        <option value="Jharsuguda">Jharsuguda</option>
                    </select>
                </div>
                <div>
                    <label for="persons">No of Persons</label>
                    <select class="form-control" id="persons" name="persons">
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                    </select>
                </div>
                <br>
                <button type="submit" class="btn btn-success btn-block" value="Submit">Search Flights</button>
            </form>
           
        </section>
    </section>
</section>
<div class="footer" align="center">
   <b>&#169 Surajjaiswal FlyAway</b>
</div>

</body>
</html>