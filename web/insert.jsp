<%-- 
    Document   : insert
    Created on : Apr 25, 2017, 10:13:38 PM
    Author     : User
--%>
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
    <body>
        <%
            Connection connection = null;
            
                Class.forName("org.gjt.mm.mysql.Driver");
                String url = "jdbc:mysql://localhost/booksystem";
                String user = "root";
                String pwd = "";
                connection = DriverManager.getConnection(url,user,pwd);
                Statement statement = connection.createStatement();
                
                //String emp = request.getParameter("Name");
                String title = request.getParameter("title");
                String author = request.getParameter("author");
                
                String queryInsert = "INSERT INTO book"
                                       +"(title, author)"
                                       +"VALUES"
                                       +"('"+title+"','"+author+"')";
                
                int i = statement.executeUpdate(queryInsert);
                
                if (i == 1)
                out.println("<script>alert('Book Recorded');document.location.href='display.jsp';</script>");
                
                else
                    out.println("<script>alert('Book not Recorded');document.location.href='insertForm.jsp';</script>");
                if (connection != null)
                    connection.close();
                
            
        %>
    </body>
</html>
