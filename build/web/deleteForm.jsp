<%-- 
    Document   : deleteForm
    Created on : Apr 25, 2017, 10:12:27 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <center><%@ include file ="menu.html" %>
         <h1>Delete</h1>
        <form action="delete.jsp" method="post" >
            <input type ="text" name="bookId">
            <input type="submit">
        </form></center>
    </body>
</html>
