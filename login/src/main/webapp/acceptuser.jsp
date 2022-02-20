<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>Accept User Page</title>
    </head>
    <body>
        <h1>Verifying Details</h1>
        <%-- Include the ValidateUser.java class whose method 
             boolean validate(String, String) we will be using
        --%>
        <%-- Create and instantiate a bean and assign an id to 
             uniquely identify the action element throughout the jsp
        --%>
        <jsp:useBean id="snr" class="login.ValidateUser"/>
          
        <%-- Set the value of the created bean using form data --%>
        <jsp:setProperty name="snr" property="user"/>
        <jsp:setProperty name="snr" property="pass"/>
          
        <%-- Display the form data --%>
        The Details Entered Are as Under<br/>
        <p>Email : <jsp:getProperty name="snr" property="user"/></p>
        <p>Password : <jsp:getProperty name="snr" property="pass"/></p>
          
        <%-- Validate the user using the validate() of 
             ValidateUser.java class
        --%>
        <%if(snr.validate("shashikumar@gmail.com", "shashi")){%>
            Welcome! You are a VALID USER<br/>
        <%}else{%>
            Error! You are an INVALID USER<br/>
        <%}%>  
    </body>
</html>
