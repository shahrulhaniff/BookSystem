package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public final class display_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/menu.html");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style>\r\n");
      out.write(".container {\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("    background-color: #333;\r\n");
      out.write("    font-family: Arial;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container a {\r\n");
      out.write("    float: left;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    color: white;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    padding: 14px 16px;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown {\r\n");
      out.write("    float: left;\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown .dropbtn {\r\n");
      out.write("    font-size: 16px;    \r\n");
      out.write("    border: none;\r\n");
      out.write("    outline: none;\r\n");
      out.write("    color: white;\r\n");
      out.write("    padding: 14px 16px;\r\n");
      out.write("    background-color: inherit;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container a:hover, .dropdown:hover .dropbtn {\r\n");
      out.write("    background-color: red;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-content {\r\n");
      out.write("    display: none;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    background-color: #f9f9f9;\r\n");
      out.write("    min-width: 160px;\r\n");
      out.write("    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\r\n");
      out.write("    z-index: 1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-content a {\r\n");
      out.write("    float: none;\r\n");
      out.write("    color: black;\r\n");
      out.write("    padding: 12px 16px;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    display: block;\r\n");
      out.write("    text-align: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-content a:hover {\r\n");
      out.write("    background-color: #ddd;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown:hover .dropdown-content {\r\n");
      out.write("    display: block;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("  <a href=\"index.jsp\">Home</a>\r\n");
      out.write("  <a href=\"insertForm.jsp\">Add New Book</a>\r\n");
      out.write("  <a href=\"display.jsp\">Display Book</a>\r\n");
      out.write("  <a href=\"updateForm.jsp\">Update Book</a>\r\n");
      out.write("  <a href=\"deleteForm.jsp\">Delete Book</a>\r\n");
      out.write("  \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\n");
      out.write("         ");

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
            
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
