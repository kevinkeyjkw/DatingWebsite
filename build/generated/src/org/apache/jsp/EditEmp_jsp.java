package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DBWorks.DBConnection;
import java.sql.SQLException;
import java.sql.ResultSet;

public final class EditEmp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Edit Employee</h1>\n");
      out.write("        \n");
      out.write("        <input type=\"text\" placeholder=\"Enter Employee's SSN\" name=\"SSN\" id=\"SSN\" > \n");
      out.write("        \n");
      out.write("        <div id=\"toBeEditEmp\"> \n");
      out.write("            <div id=\"mainTable\">\n");
      out.write("            <h2 class=\"sub-header\"></h2>\n");
      out.write("                <div class=\"table-responsive col-sm-12\" >\n");
      out.write("                    <table class=\"table table-striped col-sm-12\" id=\"table1\">\n");
      out.write("           \n");
      out.write("                    </table>\n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("             \n");
      out.write("            <table  class=\"table table-striped col-sm-12\" id=\"inputGroup\" >\n");
      out.write("                <thead></thead>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"text\" placeholder=\"SSN\"  name =\"inputSSN\" id=\"inputSSN\"></td>\n");
      out.write("                <td><input type=\"text\" placeholder=\"Password\"  name =\"inputPassword\" id=\"inputPassword\"></td>\n");
      out.write("                <td><input type=\"text\" placeholder=\"First Name\"  name =\"inputFirstName\" id=\"inputFirstName\"></td>\n");
      out.write("                <td><input type=\"text\" placeholder=\"Last Name\" name =\"inputLastName\" id=\"inputLastName\"></td>\n");
      out.write("                <td><input type=\"text\" placeholder=\"Role\" name =\"inputRole\" id=\"inputRole\"></td>\n");
      out.write("                <td><input type=\"text\" placeholder=\"Start Date\"  name =\"inputStartDate\" id=\"inputStartDate\"></td>\n");
      out.write("                <td><input type=\"text\" placeholder=\"Hourly Rate\"  name =\"inputHourlyRate\" id=\"inputHourlyRate\"></td>\n");
      out.write("                <td><input type=\"text\" placeholder=\"Street\"  name =\"inputStreet\" id=\"inputStreet\"></td>\n");
      out.write("                <td><input type=\"text\" placeholder=\"City\" name =\"inputCity\" id=\"inputCity\"></td>\n");
      out.write("                <td><input type=\"text\" placeholder=\"State\"  name =\"inputState\" id=\"inputState\"></td>\n");
      out.write("                <td><input type=\"text\" placeholder=\"Zipcode\" name =\"inputZipcode\" id=\"inputZipcode\"></td>\n");
      out.write("                <td><input type=\"text\" placeholder=\"Email\"  name =\"inputEmail\" id=\"inputEmail\"></td>\n");
      out.write("                <td><input type=\"text\" placeholder=\"Telephone\"  name =\"inputTelephone\" id=\"inputTelephone\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("           </table>\n");
      out.write("            <button type=\"button\" class=\"btn btn-default col-sm-3\">Update Employee Info</button>\n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\n");
      out.write("    <script href=\"js/bootstrap.min.js\" ></script>\n");
      out.write("    <script type=\"text/javascript\" language=\"javascript\">\n");
      out.write("         $(document).ready(function(){\n");
      out.write("            $(\"button\").hide();\n");
      out.write("            $(\"#inputGroup\").hide();\n");
      out.write("           $(\"#SSN\").on('input',function(){\n");
      out.write("               $.get('RetrieveEmp',{ssn:$(\"#SSN\").val()})\n");
      out.write("                       .done(function(responseText){\n");
      out.write("                  $(\"#table1\").html(responseText);\n");
      out.write("          \n");
      out.write("                  if(responseText !== \"\"){\n");
      out.write("                      $(\"button\").show();\n");
      out.write("                      $(\"#inputGroup\").show();\n");
      out.write("                      \n");
      out.write("                  }else{\n");
      out.write("                      $(\"button\").hide();\n");
      out.write("                  }\n");
      out.write("               });\n");
      out.write("           });\n");
      out.write("           $(\"#SSN\").on('input',function(){\n");
      out.write("               $.get('testJSON')\n");
      out.write("                       .done(function(jsonObj){\n");
      out.write("                           $.each(jsonObj,function(index,value){\n");
      out.write("                               $(\"h2\").append(\"index: \"+ index + \" value:\"+value);\n");
      out.write("                           });\n");
      out.write("                       });\n");
      out.write("           });\n");
      out.write("           $(\"button\").click(function(){\n");
      out.write("               $.get('EditEmployeeServlet',{ssn:$(\"#SSN\").val(),password:$(\"#inputPassword\"),firstName:$(\"#inputFirstName\").val(),\n");
      out.write("                   lastName:$(\"#inputLastName\").val(),role:$(\"#inputRole\").val(),\n");
      out.write("                   startDate:$(\"#inputStartDate\").val(),hourlyRate:$(\"#inputHourlyRate\").val(),\n");
      out.write("                   street:$(\"#inputStreet\").val(),city:$(\"#inputCity\").val(),state:$(\"#inputState\").val(),\n");
      out.write("                   zipcode:$(\"#inputZipcode\").val(),email:$(\"#inputEmail\").val(),telephone:$(\"#inputTelephone\").val()})\n");
      out.write("                       .done(function(responseText){\n");
      out.write("                           if(parseInt(responseText)> 0){\n");
      out.write("                            $(\"#toBeEditEmp\").html(\"Successfully updated employee info!\");   \n");
      out.write("                           }else{\n");
      out.write("                            $(\"#toBeEditEmp\").html(\"Failed to updated employee info\");   \n");
      out.write("                           }\n");
      out.write("                       });\n");
      out.write("                  $(\"button\").hide();\n");
      out.write("               \n");
      out.write("           });\n");
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
