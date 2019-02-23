<%-- 
    Document   : update2
    Created on : Apr 25, 2017, 11:31:55 PM
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
                
                String bookid = request.getParameter("bookid");
                String title = request.getParameter("title");
                String author = request.getParameter("author");
                
                String queryInsert = "update book set "
                                       +"title='"+title+"',author='"+author+"' "
                        + " where bookId='"+bookid+"'";
                
                int i = statement.executeUpdate(queryInsert);
                
                if (i == 1)
                out.println("<script>alert('Book Updated');document.location.href='display.jsp';</script>");
                
                else
                    out.println("<script>alert('Book not Updated');document.location.href='display.jsp';</script>");
                if (connection != null)
                    connection.close();
                
            
        %>
    </body>
</html>
