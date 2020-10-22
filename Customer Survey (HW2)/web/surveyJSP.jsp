<%-- 
    Document   : surveyJSP
    Created on : Sep 20, 2020, 1:59:25 PM
    Author     : spenc
--%>

<%@page import="edu.txstate.shr17.customerIO"%>
<%@page import="edu.txstate.shr17.customers"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
    String fName = request.getParameter("firstName");
    String lName = request.getParameter("lastName");
    String email = request.getParameter("email"); 
    String heardAbout = request.getParameter("heardAbout"); 
    String offer = request.getParameter("yes"); 
    if (offer == null){
        offer = "No";
    }
    String contact = request.getParameter("contact"); 
    
    customers customer = new customers(fName, lName, email, heardAbout, offer, contact);
           
    ServletContext sc = this.getServletContext();
    String c = sc.getRealPath("/WEB-INF/Customers.txt");
    customerIO.save(customer, c);
    
    
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thank you</title>
    </head>
    <body>
        <h3><%=customer.getFirstName()%>, <%=customer.getLastName()%>:</h3>
        <p> Thank you for filling out our customer survey.</p>
    </body>
</html>
