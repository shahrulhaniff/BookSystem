<%-- 
    Document   : update
    Created on : Apr 25, 2017, 10:14:02 PM
    Author     : User
--%>
<%@page import = "java.sql.ResultSet"%>
<%@page import = "java.sql.Connection"%>
<%@page import = "java.sql.DriverManager"%>
<%@page import = "java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body><center>
         <%@ include file ="menu.html" %>
         <%
            Connection connection = null;
            
                Class.forName("org.gjt.mm.mysql.Driver");
                String url = "jdbc:mysql://localhost/booksystem";
                String user = "root";
                String pwd = "";
                connection = DriverManager.getConnection(url,user,pwd);
                Statement statement = connection.createStatement();
                
                //String emp = request.getParameter("Name");
                String bookid = request.getParameter("bookId");
                String querySelect = "select * from book where bookId = '"+bookid+"'";
                ResultSet rows = statement.executeQuery(querySelect);
                
                while(rows.next())
                {
                    String title = rows.getString("title");
                    String author = rows.getString("author");
                    out.print("<form action='update2.jsp' method='post' >");
                    out.print("Book ID : <input type='text' name='bookid' value='"+bookid+"' ><br>");
                    out.print("Title : <input type='text' name='title' value='"+title+"' ><br>");
                    out.print("Author : <input type='text' name='author' value='"+author+"' ><br>");
                    out.print(" <input type ='submit'><br>");
                    out.print(" </form>");
                }
                if (connection != null)
                    connection.close();
                
            
        %>
    </center>
    </body>
</html>
