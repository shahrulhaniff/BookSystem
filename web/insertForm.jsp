<%-- 
    Document   : insertForm
    Created on : Apr 25, 2017, 10:12:04 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>INSERT PAGE</title>
    </head>
    <body>
         <%@ include file ="menu.html" %>
    <center>
        <h1>Insert New Book</h1>
        <form action ="insert.jsp" method="post">
        Title : <input type="text" name="title"><br>
        Author : <input type="text" name="author"><br>
         <input type="submit"><br>
        </form>
    </center>
    </body>
</html>
