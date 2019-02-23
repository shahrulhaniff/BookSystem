<%-- 
    Document   : display
    Created on : Apr 25, 2017, 10:14:41 PM
    Author     : User
--%>
<%@page import= "java.sql.ResultSet"%>
<%@page import= "java.sql.Connection"%>
<%@page import= "java.sql.DriverManager"%>
<%@page import= "java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%@ include file ="menu.html" %>
         <%
        Connection connection=null;
            try{
                Class.forName("org.gjt.mm.mysql.Driver");
                String url = "jdbc:mysql://localhost/booksystem";
                String user="root";
                String pwd="";
                connection = DriverManager.getConnection(url,user,pwd);
                Statement statement = connection.createStatement();
                
                String querySelect = "select * from book ";
                ResultSet rows = statement.executeQuery(querySelect);
                
                out.print("<center><table border=1 bgcolor=#FDFFC9 width='50%'><tr><th>BookId</th><th>Title</th><th>Author</th></tr>");
                while(rows.next())
                {
                    String bookid = rows.getString("bookId");
                    String title = rows.getString("title");
                    String author = rows.getString("author");
                    
                    //out.println(empId+" "+name+" "+city+"<br>");
                    out.print("<tr><td>");
                    out.print(bookid);
                    out.print("</td><td>");
                    out.print(title);
                    out.print("</td><td>");
                    out.print(author);
                    out.print("</td></tr>");
                    
                }
                out.print("</table></center>");
                if(connection!=null)
                    connection.close();
            }
            catch(Exception e){
                response.sendError(HttpServletResponse.SC_NOT_FOUND);
            }
            finally
            {
                if(null!=connection)
                {
                    connection.close();
                }
            }
            %>
    </body>
</html>
