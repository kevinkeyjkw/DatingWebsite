package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import DBWorks.DBConnection;
import java.sql.SQLException;
import java.sql.ResultSet;

public final class processAddEmp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("       \n");
      out.write("        <div id=\"success\" >\n");
      out.write("        <h1></h1>\n");
      out.write("        <button type=\"button\" class=\"btn btn-default\" onclick=\"window.location.replace('AddEmp.jsp');\">Return</button>\n");
      out.write("        </div> \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\n");
      out.write("    <script href=\"js/bootstrap.min.js\" ></script>\n");
      out.write("    <script type=\"text/javascript\" language=\"javascript\">\n");
      out.write("        $(document).ready(function(){\n");
      out.write("             ");
 
            
             String insertPersonQuery = "INSERT INTO Person(SSN,Password,FirstName,LastName,Street,City,State,Zipcode,Email,Telephone)"
                    + " VALUES ('"+request.getParameter("SSN")+"','"
                    + request.getParameter("Password") + "','"
                    + request.getParameter("FirstName") + "','"
                    + request.getParameter("LastName") + "','"
                    + request.getParameter("Street") + "','"
                    + request.getParameter("City") + "','"
                    + request.getParameter("State") + "',"
                    + request.getParameter("Zipcode") + ",'"
                    + request.getParameter("Email") + "','"
                    + request.getParameter("Telephone") + "')";
            
            String insertEmpQuery = "INSERT INTO Employee(SSN,Role,StartDate,HourlyRate)"
                    + "VALUES('" + request.getParameter("SSN") + "','"
                    + request.getParameter("Role") + "','"
                    + request.getParameter("StartDate") + "',"
                    + request.getParameter("HourlyRate") + ")";//hourly rate is int
            
            int myResultSet1 = DBConnection.ExecUpdateQuery(insertPersonQuery);
            int myResultSet2 = DBConnection.ExecUpdateQuery(insertEmpQuery);
           
         
          
        
      out.write("\n");
      out.write("                if(");
      out.print( myResultSet1 );
      out.write(" > 0 && ");
      out.print( myResultSet2 );
      out.write(" > 0 ){\n");
      out.write("                    $(\"h1\").html(\"Successfully added Employee\");\n");
      out.write("                }else{\n");
      out.write("                    $(\"h1\").html(\"Failed to add Employee\");\n");
      out.write("                }\n");
      out.write("            \n");
      out.write("        });\n");
      out.write("    </script>\n");
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
