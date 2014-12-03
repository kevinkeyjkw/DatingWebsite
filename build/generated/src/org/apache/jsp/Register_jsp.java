package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Register User Page</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Register your account</h1>\n");
      out.write("        <form class=\"form col-md-12 center-block\" action=\"RegisterUser.jsp\" method=\"post\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input name=\"ssn\" type=\"text\" class=\"form-control input-lg\" placeholder=\"SSN\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input name=\"password\" type=\"password\" class=\"form-control input-lg\" placeholder=\"Password\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input name=\"firstname\" type=\"text\" class=\"form-control input-lg\" placeholder=\"Firstname\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input name=\"lastname\" type=\"text\" class=\"form-control input-lg\" placeholder=\"Lastname\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input name=\"street\" type=\"text\" class=\"form-control input-lg\" placeholder=\"Street\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input name=\"city\" type=\"text\" class=\"form-control input-lg\" placeholder=\"City\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input name=\"firstname\" type=\"text\" class=\"form-control input-lg\" placeholder=\"Firstname\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input name=\"lastname\" type=\"text\" class=\"form-control input-lg\" placeholder=\"Lastname\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input name=\"street\" type=\"text\" class=\"form-control input-lg\" placeholder=\"Street\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input name=\"city\" type=\"text\" class=\"form-control input-lg\" placeholder=\"City\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input name=\"state\" type=\"text\" class=\"form-control input-lg\" placeholder=\"State\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input name=\"zipcode\" type=\"text\" class=\"form-control input-lg\" placeholder=\"Zipcode\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input name=\"email\" type=\"text\" class=\"form-control input-lg\" placeholder=\"Email\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input name=\"telephone\" type=\"text\" class=\"form-control input-lg\" placeholder=\"Telephone\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input name=\"profileID\" type=\"text\" class=\"form-control input-lg\" placeholder=\"Profile Name\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input name=\"age\" type=\"text\" class=\"form-control input-lg\" placeholder=\"Age\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input name=\"datingAgeRangeStart\" type=\"text\" class=\"form-control input-lg\" placeholder=\"datingAgeRangeStart\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input name=\"datingAgeRangeEnd\" type=\"text\" class=\"form-control input-lg\" placeholder=\"datingAgeRangeEnd\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input name=\"datingGeoRange\" type=\"text\" class=\"form-control input-lg\" placeholder=\"datingGeoRange\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input name=\"m_f\" type=\"text\" class=\"form-control input-lg\" placeholder=\"gender\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input name=\"hobbies\" type=\"text\" class=\"form-control input-lg\" placeholder=\"Hobbies\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input name=\"height\" type=\"text\" class=\"form-control input-lg\" placeholder=\"Height\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input name=\"weight\" type=\"text\" class=\"form-control input-lg\" placeholder=\"Weight\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input name=\"hairColor\" type=\"text\" class=\"form-control input-lg\" placeholder=\"Hair Color\">\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <button class=\"btn btn-primary btn-lg btn-block\">Register</button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
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
