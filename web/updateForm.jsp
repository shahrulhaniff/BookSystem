
<%-- 
    Document   : updateForm
    Created on : Apr 25, 2017, 10:13:03 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UPDATE</title>
    </head>
    <body>
         <center><%@ include file ="menu.html" %>
         <h1>Update</h1>
        <form action="update.jsp" method="post" >
            <input type ="text" name="bookId">
            <input type="submit">
        </form></center>
    </body>
</html>
