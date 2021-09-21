<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="advanced.java.program.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Country Liste</title>
<style>
      .gradientdown {
        background:  #e0e6ff;
        background: -webkit-linear-gradient(top, #e0e6ff 0%,#eeeeee 100%); /* Chrome10+,Safari5.1+ */
        background: -o-linear-gradient(#e0e6ff, #eeeeee); /* For Opera 11.1 to 12.0 */
        background: -moz-linear-gradient(top, #e0e6ff, #eeeeee); /* For Firefox 3.6 to 15 */
        background: linear-gradient(top, #e0e6ff 0%,#eeeeee 100%); /* W3C Standard syntax (must be last) */
      }
      xmlTable xmlRow:nth-of-type(even) { 
        background: #eeeeee; 
      }
      xmlTable { 
        display: table;
        border-color: #aad5ff;
        border-style: solid;
        border-width: 0 0 1px 1px;
      }      
      xmlHeadCell, xmlCell, xmlHeadRow, xmlRow {
        border-color: #aad5ff;
        border-style: solid;
        padding: 2px;
        border-width: 1px 1px 0 0;

        vertical-align: top;  
      }
      xmlHeadRow {
        color: blue;
      }
      xmlHeadRow, xmlRow {
        display: table-row;
      } 

      xmlHeadCell, xmlCell { 
        display: table-cell;
      }
      hr { background-color: #3366ff; height: 1px; border: 0; }
      .siteblue {
        color: #3366ff;
      }
    </style>
</head>
<body>
  <div style="max-width:500px; ">
      <jsp:element name="xmlTable">
        <jsp:body> 
          <jsp:element name="xmlHeadRow">
            <jsp:attribute name="class">gradientdown </jsp:attribute> 
            <jsp:body>           
              <jsp:element name="xmlHeadCell">
                <jsp:attribute name="style">width:40px;</jsp:attribute> 
                <jsp:body><br /></jsp:body> 
              </jsp:element>
              <jsp:element name="xmlHeadCell">
                <jsp:attribute name="style">width:100px;</jsp:attribute> 
                <jsp:body>Name</jsp:body> 
              </jsp:element>
              <jsp:element name="xmlHeadCell">
                <jsp:attribute name="style">width:200px;</jsp:attribute> 
                <jsp:body>Full Name</jsp:body> 
              </jsp:element>
              <jsp:element name="xmlHeadCell">
                <jsp:attribute name="style">width:80px;</jsp:attribute> 
                <jsp:body>Capital</jsp:body> 
              </jsp:element>
              <jsp:element name="xmlHeadCell">
                <jsp:attribute name="style">width:60px;</jsp:attribute> 
                <jsp:body>Phone code</jsp:body> 
              </jsp:element>
              <jsp:element name="xmlHeadCell">
                <jsp:attribute name="style">width:60px;</jsp:attribute> 
                <jsp:body>TLD</jsp:body> 
              </jsp:element>
              <jsp:element name="xmlHeadCell">
                <jsp:attribute name="style">width:60px;</jsp:attribute> 
                <jsp:body>Region</jsp:body> 
              </jsp:element>
            </jsp:body> 
          </jsp:element>  
          <%!
            CountryControl countryControl = new CountryControl();
            List<Country> countries = countryControl.getCountries();
          %>                
          <%
            for (Country country : countries) {
          %>
          <jsp:element name="xmlRow">
            <jsp:body>
              <jsp:element name="xmlCell">
                <jsp:attribute name="style">text-align: center; vertical-align: central;</jsp:attribute> 
                <jsp:body>
                  <img src="<%= country.getFlag()%>" width="20" height="20"
                       alt="<%= country.getName()%>" /></jsp:body> 
              </jsp:element>              
              <jsp:element name="xmlCell">
                <jsp:body><%= country.getName()%></jsp:body> 
              </jsp:element>              
              <jsp:element name="xmlCell">
                <jsp:body><%= country.getFullName()%></jsp:body> 
              </jsp:element>              
              <jsp:element name="xmlCell">
                <jsp:body><%= country.getCapital()%></jsp:body> 
              </jsp:element>              
              <jsp:element name="xmlCell">
                <jsp:body><%= country.getPhoneCode()%></jsp:body> 
              </jsp:element>              
              <jsp:element name="xmlCell">
                <jsp:body><%= country.getTopLevelDomain()%></jsp:body> 
              </jsp:element>              
              <jsp:element name="xmlCell">
                <jsp:body><%= country.getRegion()%></jsp:body> 
              </jsp:element>              
            </jsp:body> 
          </jsp:element>
          <%
            }
          %>
        </jsp:body> 
      </jsp:element>
    </div>
</body>
</html>