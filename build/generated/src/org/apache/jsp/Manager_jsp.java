package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DBWorks.DBConnection;
import java.sql.SQLException;
import java.sql.ResultSet;

public final class Manager_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <link rel=\"icon\" href=\"../../favicon.ico\">\n");
      out.write("\n");
      out.write("    <title>Dashboard Template for Bootstrap</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"css/dashboard.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->\n");
      out.write("    <!--[if lt IE 9]><script src=\"../../assets/js/ie8-responsive-file-warning.js\"></script><![endif]-->\n");
      out.write("    <script src=\"../../assets/js/ie-emulation-modes-warning.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("    <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("      <div class=\"container-fluid\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("          </button>\n");
      out.write("          <a class=\"navbar-brand\" href=\"#\">Manager</a>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("          <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("            <li><a href=\"#\" id=\"emp\" onclick=\"updateEmp();\" >Employee</a></li>\n");
      out.write("            <li><a href=\"#\">User</a></li>\n");
      out.write("            <li><a href=\"#\">Date</a></li>\n");
      out.write("          </ul>\n");
      out.write("          <form class=\"navbar-form navbar-right\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Search...\">\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-3 col-md-2 sidebar\">\n");
      out.write("          <ul class=\"nav nav-sidebar\">\n");
      out.write("            <li class=\"active\"><a href=\"User.jsp\">Add, Edit, Delete Employee  <span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("            <li><a href=\"#\">Sales Reports</a></li>\n");
      out.write("            <li><a href=\"#\">List Users</a></li>\n");
      out.write("            <li><a href=\"#\">List Dates</a></li>\n");
      out.write("          </ul>\n");
      out.write("          <ul class=\"nav nav-sidebar\">\n");
      out.write("            \n");
      out.write("            <li><a href=\"\">Revenue from Dates by Customer</a></li>\n");
      out.write("            <li><a href=\"\">Most revenue customer</a></li>\n");
      out.write("            <li><a href=\"\">Most active customers</a></li>\n");
      out.write("            <li><a href=\"\">Who dated who?</a></li>\n");
      out.write("          </ul>\n");
      out.write("          <ul class=\"nav nav-sidebar\">\n");
      out.write("            <li><a href=\"\">Highest-rated customers</a></li>\n");
      out.write("            <li><a href=\"\">Best days to have a date</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main\">\n");
      out.write("          <h1 class=\"page-header\">Dashboard</h1>\n");
      out.write("\n");
      out.write("          <div class=\"row placeholders\">\n");
      out.write("            <div class=\"col-xs-6 col-sm-3 placeholder\">\n");
      out.write("              <img data-src=\"holder.js/200x200/auto/sky\" class=\"img-responsive\" alt=\"Generic placeholder thumbnail\">\n");
      out.write("              <h4>Label</h4>\n");
      out.write("              <span class=\"text-muted\">Something else</span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-6 col-sm-3 placeholder\">\n");
      out.write("              <img data-src=\"holder.js/200x200/auto/vine\" class=\"img-responsive\" alt=\"Generic placeholder thumbnail\">\n");
      out.write("              <h4>Label</h4>\n");
      out.write("              <span class=\"text-muted\">Something else</span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-6 col-sm-3 placeholder\">\n");
      out.write("              <img data-src=\"holder.js/200x200/auto/sky\" class=\"img-responsive\" alt=\"Generic placeholder thumbnail\">\n");
      out.write("              <h4>Label</h4>\n");
      out.write("              <span class=\"text-muted\">Something else</span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xs-6 col-sm-3 placeholder\">\n");
      out.write("              <img data-src=\"holder.js/200x200/auto/vine\" class=\"img-responsive\" alt=\"Generic placeholder thumbnail\">\n");
      out.write("              <h4>Label</h4>\n");
      out.write("              <span class=\"text-muted\">Something else</span>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("          <h2 class=\"sub-header\">Section title</h2>\n");
      out.write("          <div class=\"table-responsive\">\n");
      out.write("            <table class=\"table table-striped\">\n");
      out.write("                <thead>\n");
      out.write("                    \n");
      out.write("                </thead>\n");
      out.write("              <tbody id=\"bodyemp\">\n");
      out.write("                ");
 
                String getEmpQuery = "SELECT * FROM Employee";
                java.sql.ResultSet empRs = DBConnection.ExecQuery(getEmpQuery);
                
                String getEmpColQuery = "SELECT `COLUMN_NAME` FROM `INFORMATION_SCHEMA`.`COLUMNS` "
                        + "WHERE `TABLE_SCHEMA`='The_Expendables' AND `TABLE_NAME`='Employee';";
                java.sql.ResultSet empColRs = DBConnection.ExecQuery(getEmpColQuery);
                
                String getUserQuery = "SELECT * FROM User";
                java.sql.ResultSet userRs = DBConnection.ExecQuery(getUserQuery);
                
                String getUserColQuery = "SELECT `COLUMN_NAME` FROM `INFORMATION_SCHEMA`.`COLUMNS` "
                        + "WHERE `TABLE_SCHEMA`='The_Expendables' AND `TABLE_NAME`='User';";
                java.sql.ResultSet userColRs = DBConnection.ExecQuery(getUserColQuery);
                
      out.write("\n");
      out.write("                \n");
      out.write("              </tbody>\n");
      out.write("            </table>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core JavaScript\n");
      out.write("    ================================================== -->\n");
      out.write("    <!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\n");
      out.write("    \n");
      out.write("    <script type=\"text/javascript\" language=\"javascript\">\n");
      out.write("        $(document).ready(function(){\n");
      out.write("            \n");
      out.write("        });\n");
      out.write("        function updateEmp(){ \n");
      out.write("            $(\"thead\").html(\"\");\n");
      out.write("            $(\"tbody\").html(\"\");\n");
      out.write("            $(\"thead\").append(\"<tr>\");\n");
      out.write("            ");
 while(empColRs.next()){ 
      out.write("\n");
      out.write("               $(\"thead\").append(\"<th>\" + \"");
      out.print( empColRs.getString("COLUMN_NAME") );
      out.write("\" + \"</th>\");\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("                $(\"thead\").append(\"</tr>\");\n");
      out.write("            ");
 while(empRs.next()){ 
      out.write("    \n");
      out.write("                $(\"tbody\").append(\"<tr><td>\" + \"");
      out.print( empRs.getString("SSN") );
      out.write("\" + \"</td><td>\"+\"");
      out.print( empRs.getString("Role") );
      out.write("\"\n");
      out.write("            +\"</td><td>\" + \"");
      out.print( empRs.getDate("StartDate") );
      out.write("\"+\"</td><td>\" + \"");
      out.print( empRs.getInt("HourlyRate") );
      out.write("\" + \"</td></tr>\");\n");
      out.write("            ");
 }
      out.write("   \n");
      out.write("        }\n");
      out.write("        function updateUser(){\n");
      out.write("            $(\"thead\").html(\"\");\n");
      out.write("            $(\"tbody\").html(\"\");\n");
      out.write("            $(\"thead\").append(\"<tr>\");\n");
      out.write("            ");
 while(userColRs.next()){ 
      out.write("\n");
      out.write("                $(\"thead\").append(\"<th>\" + \"");
      out.print( userColRs.getString("COLUMN_NAME") );
      out.write("\" + \"</th>\");\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("                $(\"thead\").append(\"</tr>\");\n");
      out.write("            ");
 while(userRs.next()){ 
      out.write("    \n");
      out.write("                $(\"tbody\").append(\"<tr><td>\" + \"");
      out.print( userRs.getString("SSN") );
      out.write("\" + \"</td><td>\"+\"");
      out.print( userRs.getString("PPP") );
      out.write("\"\n");
      out.write("            +\"</td><td>\" + \"");
      out.print( userRs.getInt("Rating") );
      out.write("\"+\"</td><td>\" + \"");
      out.print( userRs.getDate("DateOfLastAct") );
      out.write("\" + \"</td></tr>\");\n");
      out.write("            ");
 }
      out.write("   \n");
      out.write("        }\n");
      out.write("        </script>\n");
      out.write("    <script src=\"../../dist/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"../../assets/js/docs.min.js\"></script>\n");
      out.write("    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n");
      out.write("    <script src=\"../../assets/js/ie10-viewport-bug-workaround.js\"></script>\n");
      out.write("  </body>\n");
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
