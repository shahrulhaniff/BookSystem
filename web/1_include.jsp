<%-- 
    Document   : 1_include
    Created on : Apr 28, 2017, 11:55:34 PM
    Author     : User
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Book System</title>
    </head>
    <body>
<font face="Arial, Helvetica, sans-serif">
<link href="css.css" rel="stylesheet" type="text/css">
<table width="700px" align="center" border="1">
<tr>
<td height="100px">
<img src="image/header.jpg">
</td>
</tr>
<tr>
<td height="25px">
:: <a href="1_include.jsp?page=1_include&id=utama">Menu</a> 
:: <a href="1_include.jsp?page=1_include&id=daftar">Index</a> 
:: <a href="index1.jsp?page=papar">Display</a> 
:: <a href="index1.jsp?page=kemaskini">Update</a>
:: <a href="index1.jsp?page=padam">Delete</a> 
:: <a href="index1.jsp?page=carian">Search</a> 
:: <a href="index1.jsp?page=logout">Logout</a> 
</td>
</tr>
<tr>
<td height="450px" valign="top">

<%
    try{
        
        String pages = request.getParameter("id");
        //out.print(pages);

        if (pages.equals("utama"))
        {
            %> <%@ include file ="index.html" %> <%

        }

        else if (pages.equals("daftar"))
        {
            %> <%@ include file ="index.html" %> <%
        }
    
    }
    catch (Exception e){
        //out.print(e);
        out.print("TAK INCLUDE APA2 LAGI");
    }
%>

</td>
</tr>
<tr>
<td height="20px" align="center" bgcolor="CCCCCC">SHAHRUL<br>Sistem buku</td>
</tr>
</table>
</font>
    </body>
</html>
