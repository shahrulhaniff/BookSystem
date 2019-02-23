package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _1_005finclude_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/index.html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Book System</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("<font face=\"Arial, Helvetica, sans-serif\">\n");
      out.write("<link href=\"css.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<table width=\"700px\" align=\"center\" border=\"1\">\n");
      out.write("<tr>\n");
      out.write("<td height=\"100px\">\n");
      out.write("<img src=\"image/header.jpg\">\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td height=\"25px\">\n");
      out.write(":: <a href=\"1_include.jsp?page=1_include&id=utama\">Menu</a> \n");
      out.write(":: <a href=\"1_include.jsp?page=1_include&id=daftar\">Index</a> \n");
      out.write(":: <a href=\"index1.jsp?page=papar\">Display</a> \n");
      out.write(":: <a href=\"index1.jsp?page=kemaskini\">Update</a>\n");
      out.write(":: <a href=\"index1.jsp?page=padam\">Delete</a> \n");
      out.write(":: <a href=\"index1.jsp?page=carian\">Search</a> \n");
      out.write(":: <a href=\"index1.jsp?page=logout\">Logout</a> \n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td height=\"450px\" valign=\"top\">\n");
      out.write("\n");

    try{
        
        String pages = request.getParameter("id");
        //out.print(pages);

        if (pages.equals("utama"))
        {
            
      out.write(' ');
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("To change this license header, choose License Headers in Project Properties.\r\n");
      out.write("To change this template file, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>TODO supply a title</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div>WELCOME</div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write(' ');


        }

        else if (pages.equals("daftar"))
        {
            
      out.write(' ');
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("To change this license header, choose License Headers in Project Properties.\r\n");
      out.write("To change this template file, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>TODO supply a title</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div>WELCOME</div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write(' ');

        }
    
    }
    catch (Exception e){
        //out.print(e);
        out.print("TAK INCLUDE APA2 LAGI");
    }

      out.write("\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td height=\"20px\" align=\"center\" bgcolor=\"CCCCCC\">SHAHRUL<br>Sistem buku</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</font>\n");
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
