package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSetMetaData;
import DBWorks.DBConnection;
import java.sql.SQLException;
import java.sql.ResultSet;

public final class CustRep_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <title>Dashboard Template for Bootstrap</title>\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    \n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"css/dashboard.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->\n");
      out.write("    <!--[if lt IE 9]><script src=\"../../assets/js/ie8-responsive-file-warning.js\"></script><![endif]-->\n");
      out.write("    \n");
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
      out.write("          <a class=\"navbar-brand\" href=\"#\">Customer Representative</a>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("          <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("            <li><a href=\"#\" id=\"emp\" onclick=\"showEmp();\" >Employee</a></li>\n");
      out.write("            <li><a href=\"#\" onclick=\"showUser();\" >User</a></li>\n");
      out.write("            <li><a  href=\"Date.jsp\" >Date</a></li>\n");
      out.write("          </ul>\n");
      out.write("          <form class=\"navbar-form navbar-right\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Search...\">\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("      \n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-3 col-md-2 sidebar\">\n");
      out.write("          <ul class=\"nav nav-sidebar\">\n");
      out.write("            <li class=\"active\"><a href=\"CustRep.jsp\">Home <span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("            <li onclick=\"recordDate();\"><a href=\"#\">Record a Date</a></li>\n");
      out.write("            <li><a onclick=\"showAEDEmp();\" href=\"#\" >Add, Edit, Delete Customer </a></li>\n");
      out.write("            <li onclick=\"showCustRevByDate();\"><a href=\"#\">Produce Customer Mailing Lists</a></li>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main\">\n");
      out.write("          <h1 class=\"page-header\" id=\"title\">Your Dashboard</h1>\n");
      out.write("          \n");
      out.write("          <div class=\"playArea\">\n");
      out.write("              <div id=\"activeUser\" class=\"hidden\">\n");
      out.write("                  <button type=\"button\" onclick=\"showActiveCustLikes();\" class=\"btn btn-default\" >Based on # of Likes</button>\n");
      out.write("                  <button type=\"button\" onclick=\"showActiveCustDates();\" class=\"btn btn-default\" >Based on # of Dates</button>\n");
      out.write("              </div>\n");
      out.write("              \n");
      out.write("                    \n");
      out.write("       <div id=\"salesReport\" class=\"hidden\">\n");
      out.write("        <div id=\"salesReportA\">\n");
      out.write("         <form action=\"suggestedByReport.jsp\">\n");
      out.write("            <form  role=\"form\" method=\"POST\" action=\"processAddEmp.jsp\" id=\"form1\">\n");
      out.write("            <div class=\"form-group form-group-sm col-sm-6 col-md-offset-3\">\n");
      out.write("                <label for=\"ProfileID\">Enter A Profile ID</label>\n");
      out.write("                <input type=\"text\" class=\"form-control input-sm\" name=\"ProfileID\" id=\"ProfileID\" placeholder=\"Profile ID\">\n");
      out.write("            </div>\n");
      out.write("            <button type=\"submit\" class=\"btn btn-default col-sm-2 col-md-offset-5\">Submit</button>\n");
      out.write("        </form>\n");
      out.write("              </form>\n");
      out.write("              </div>\n");
      out.write("              <div id=\"salesReportB\">\n");
      out.write("                  \n");
      out.write("              </div>\n");
      out.write("            </div>  <!-- End of get sales report-->\n");
      out.write("        \n");
      out.write("        <div id=\"recordDate\" class=\"hidden\">\n");
      out.write("        <div id=\"recordDateA\">\n");
      out.write("         <form action=\"processDateRecord.jsp\" method=\"post\">\n");
      out.write("            <div class=\"form-group form-group-sm col-sm-6 col-md-offset-3\">\n");
      out.write("                <label >Profile1</label>\n");
      out.write("                <input type=\"text\" class=\"form-control input-sm\" name=\"Profile1\"  placeholder=\"Profile1\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group form-group-sm col-sm-6 col-md-offset-3\">\n");
      out.write("                <label>Profile2 </label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"Profile2\"  placeholder=\"Profile2\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group form-group-sm col-sm-6 col-md-offset-3\">\n");
      out.write("                <label>Customer Representative Name</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"CustRep\" placeholder=\"Customer Representative\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group form-group-sm col-sm-6 col-md-offset-3\">\n");
      out.write("                <label>Date Time</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"DateTime\" placeholder=\"Date Iime\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group form-group-sm col-sm-6 col-md-offset-3\">\n");
      out.write("                <label>Location</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"Location\" placeholder=\"Location\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group form-group-sm col-sm-6 col-md-offset-3\">\n");
      out.write("                <label>BookingFee</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"BookingFee\"  placeholder=\"BookingFee\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group form-group-sm col-sm-6 col-md-offset-3\">\n");
      out.write("                <label>Comments</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"Comments\" placeholder=\"Comments\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group form-group-sm col-sm-6 col-md-offset-3\">\n");
      out.write("                <label>User1 Rating</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"User1Rating\" placeholder=\"User1 Rating\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group form-group-sm col-sm-6 col-md-offset-3\">\n");
      out.write("                <label>User2 Rating</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"User2Rating\" placeholder=\"User2 Rating\">\n");
      out.write("            </div>\n");
      out.write("            <button type=\"submit\" class=\"btn btn-default col-sm-2 col-md-offset-5\">Submit</button>\n");
      out.write("        </form>\n");
      out.write("              </div>\n");
      out.write("          \n");
      out.write("            </div>  <!-- End of record a date-->\n");
      out.write("            \n");
      out.write("            <div id=\"aedEmp\" class=\"hidden\">\n");
      out.write("                <a  class=\"btn btn-default\" href=\"AddCustomer.jsp\">Add Customer</a>\n");
      out.write("                <a  class=\"btn btn-default\" href=\"EditCustomer.jsp\">Edit Customer</a>\n");
      out.write("                <a  class=\"btn btn-default\" href=\"DeletCustomer.jsp\">Delete Customer</a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("        <div id=\"mainTable\">\n");
      out.write("          <h2 class=\"sub-header\"></h2>\n");
      out.write("          <div class=\"table-responsive\" >\n");
      out.write("            <table class=\"table table-striped\">\n");
      out.write("                <thead>                    \n");
      out.write("                </thead>\n");
      out.write("              <tbody id=\"bodyemp\">\n");
      out.write("               \n");
      out.write("              </tbody>\n");
      out.write("            </table>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("               \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core JavaScript\n");
      out.write("    ================================================== -->\n");
      out.write("    <!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("    \n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\n");
      out.write("    <script href=\"js/bootstrap.min.js\" ></script>\n");
      out.write("    \n");
      out.write("    <script type=\"text/javascript\" language=\"javascript\">\n");
      out.write("        $(document).ready(function(){\n");
      out.write("            $('.nav.nav-sidebar li').click(function(){\n");
      out.write("                $('.nav.nav-sidebar li').removeClass('active');\n");
      out.write("                $(this).toggleClass('active');\n");
      out.write("                \n");
      out.write("            });\n");
      out.write("            $('.nav.nav-sidebar li a').click(function(){\n");
      out.write("                hideTable();\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("      \n");
      out.write("       \n");
      out.write("       \n");
      out.write("        \n");
      out.write("        function showActiveCust(){\n");
      out.write("            hideTable();\n");
      out.write("            hideSalesReport();\n");
      out.write("            hideAEDEmp();\n");
      out.write("            hideRecordDate()\n");
      out.write("            $(\"#activeUser\").removeClass(\"hidden\");\n");
      out.write("            $(\"#title\").html(\"Most Active Customers\");\n");
      out.write("        }\n");
      out.write("        function hideActiveCust(){\n");
      out.write("            $(\"#title\").html(\"\");\n");
      out.write("            $(\"#activeUser\").addClass(\"hidden\");\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        function showAEDEmp(){\n");
      out.write("            hideTable();\n");
      out.write("            hideRecordDate()\n");
      out.write("            hideActiveCust();\n");
      out.write("            hideSalesReport();\n");
      out.write("            $(\"#title\").html(\"Add Edit Delete Customer\");\n");
      out.write("            $(\"#aedEmp\").removeClass('hidden');\n");
      out.write("        }\n");
      out.write("        function hideAEDEmp(){\n");
      out.write("            $(\"#title\").html(\"\");\n");
      out.write("            $(\"#aedEmp\").addClass('hidden');\n");
      out.write("        }\n");
      out.write("          function hideRecordDate(){\n");
      out.write("            $(\"#title\").html(\"\");\n");
      out.write("            $(\"#recordDate\").addClass('hidden');\n");
      out.write("        }\n");
      out.write("        function recordDate(){\n");
      out.write("            hideTable();\n");
      out.write("            hideActiveCust();\n");
      out.write("            hideAEDEmp();\n");
      out.write("            hideSalesReport();\n");
      out.write("            $(\"#title\").html(\"Record a Date\");\n");
      out.write("            $(\"#recordDate\").removeClass('hidden');\n");
      out.write("        }\n");
      out.write("        function hideSalesReport(){\n");
      out.write("            $(\"#title\").html(\"\");\n");
      out.write("            $(\"#salesReport\").addClass('hidden');\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        function showCustRevByDate(){\n");
      out.write("            showTable();\n");
      out.write("            hideAEDEmp();\n");
      out.write("            hideRecordDate()\n");
      out.write("            hideActiveCust();\n");
      out.write("            hideSalesReport();\n");
      out.write("            $(\"#mainTable thead\").html(\"\");\n");
      out.write("            $(\"#mainTable tbody\").html(\"\");\n");
      out.write("            ");

            String getCustRevDateQuery = "SELECT P.FirstName, P.LastName, P.Street, P.City, P.State, P.Zipcode"
                    + " FROM Person P, User U"
                    + " WHERE P.SSN=U.SSN";
                java.sql.ResultSet custRevDateRs = DBConnection.ExecQuery(getCustRevDateQuery);
                String [] custRevDateColName = {"First Name","Last Name", "Street", "City", "State","Zip Code"};
            
      out.write("\n");
      out.write("            $(\".sub-header\").html(\"Customer Mailing List\");\n");
      out.write("            $(\"#mainTable thead\").append(\"<tr>\");\n");
      out.write("            ");
 for(String tmp: custRevDateColName){ 
      out.write("\n");
      out.write("               $(\"#mainTable thead\").append(\"<th>\" + \"");
      out.print( tmp );
      out.write("\" + \"</th>\");\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("                $(\"#mainTable thead\").append(\"</tr>\");\n");
      out.write("            ");
 while(custRevDateRs.next()){ 
      out.write("    \n");
      out.write("                $(\"#mainTable tbody\").append(\"<tr><td>\" + \"");
      out.print( custRevDateRs.getString("FirstName") );
      out.write("\" + \"</td><td>\"\n");
      out.write("                        +\"");
      out.print( custRevDateRs.getString("LastName") );
      out.write("\"+\"</td><td>\"\n");
      out.write("                        +\"");
      out.print( custRevDateRs.getString("Street") );
      out.write("\"+\"</td><td>\"\n");
      out.write("                        +\"");
      out.print( custRevDateRs.getString("City") );
      out.write("\"+\"</td><td>\"\n");
      out.write("                        +\"");
      out.print( custRevDateRs.getString("State") );
      out.write("\"+\"</td><td>\"\n");
      out.write("                        +\"");
      out.print( custRevDateRs.getString("Zipcode") );
      out.write("\"+\"</td></tr>\");\n");
      out.write("            ");
 }
      out.write("   \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        function showEmp(){ \n");
      out.write("            showTable();\n");
      out.write("            hideAEDEmp();\n");
      out.write("            hideActiveCust();\n");
      out.write("            hideSalesReport();\n");
      out.write("            ");

            String getEmpQuery = "SELECT * FROM Employee";
                java.sql.ResultSet empRs = DBConnection.ExecQuery(getEmpQuery);
                
                String getEmpColQuery = "SELECT `COLUMN_NAME` FROM `INFORMATION_SCHEMA`.`COLUMNS` "
                        + "WHERE `TABLE_SCHEMA`='The_Expendables' AND `TABLE_NAME`='Employee';";
                java.sql.ResultSet empColRs = DBConnection.ExecQuery(getEmpColQuery);
            
      out.write("\n");
      out.write("            $(\"#mainTable thead\").html(\"\");\n");
      out.write("            $(\"#mainTable tbody\").html(\"\");\n");
      out.write("            $(\".sub-header\").html(\"Employee Table\");\n");
      out.write("            $(\"#mainTable thead\").append(\"<tr>\");\n");
      out.write("            ");
 while(empColRs.next()){ 
      out.write("\n");
      out.write("               $(\"#mainTable thead\").append(\"<th>\" + \"");
      out.print( empColRs.getString("COLUMN_NAME") );
      out.write("\" + \"</th>\");\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("                $(\"#mainTable thead\").append(\"</tr>\");\n");
      out.write("            ");
 while(empRs.next()){ 
      out.write("    \n");
      out.write("                $(\"#mainTable tbody\").append(\"<tr><td>\" + \"");
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
      out.write("        function showUser(){\n");
      out.write("            showTable();\n");
      out.write("            hideAEDEmp();\n");
      out.write("            hideActiveCust();\n");
      out.write("            hideSalesReport();\n");
      out.write("            $(\"thead\").html(\"\");\n");
      out.write("            $(\"tbody\").html(\"\");\n");
      out.write("            ");

             String getUserQuery = "SELECT * FROM User";
                java.sql.ResultSet userRs = DBConnection.ExecQuery(getUserQuery);
                
                String getUserColQuery = "SELECT `COLUMN_NAME` FROM `INFORMATION_SCHEMA`.`COLUMNS` "
                        + "WHERE `TABLE_SCHEMA`='The_Expendables' AND `TABLE_NAME`='User';";
                java.sql.ResultSet userColRs = DBConnection.ExecQuery(getUserColQuery);
            
      out.write("\n");
      out.write("            $(\".sub-header\").html(\"User Table\");\n");
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
      out.write("        function showDate(){\n");
      out.write("            showTable();\n");
      out.write("            hideAEDEmp();\n");
      out.write("            hideActiveCust();\n");
      out.write("            hideSalesReport();\n");
      out.write("            $(\"thead\").html(\"\");\n");
      out.write("            $(\"tbody\").html(\"\");\n");
      out.write("            ");

            String getDateQuery = "SELECT * FROM Date";
                java.sql.ResultSet dateRs = DBConnection.ExecQuery(getDateQuery);
                
                String getDateColQuery = "SELECT `COLUMN_NAME` FROM `INFORMATION_SCHEMA`.`COLUMNS` "
                        + "WHERE `TABLE_SCHEMA`='The_Expendables' AND `TABLE_NAME`='Date';";
                java.sql.ResultSet dateColRs = DBConnection.ExecQuery(getDateColQuery);
            
      out.write("\n");
      out.write("            $(\".sub-header\").html(\"Dates Table\");\n");
      out.write("            $(\"thead\").append(\"<tr>\");\n");
      out.write("            ");
 while(dateColRs.next()){ 
      out.write("\n");
      out.write("                $(\"thead\").append(\"<th>\" + \"");
      out.print( dateColRs.getString("COLUMN_NAME") );
      out.write("\" + \"</th>\");\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("                $(\"thead\").append(\"</tr>\");\n");
      out.write("            ");
 while(dateRs.next()){ 
      out.write("    \n");
      out.write("                $(\"tbody\").append(\"<tr><td>\" + \"");
      out.print( dateRs.getString("Profile1") );
      out.write("\" + \"</td><td>\"+\"");
      out.print( dateRs.getString("Profile2") );
      out.write("\"\n");
      out.write("            +\"</td><td>\" + \"");
      out.print( dateRs.getString("CustRep") );
      out.write("\"+\"</td><td>\" + \"");
      out.print( dateRs.getDate("Date_Time") );
      out.write("\" + \"</td><td>\" \n");
      out.write("            + \"");
      out.print( dateRs.getString("Location") );
      out.write("\" + \"</td><td>\" + \"");
      out.print( dateRs.getFloat("BookingFee") );
      out.write("\" + \"</td><td>\" +\n");
      out.write("            \"");
      out.print( dateRs.getString("Comments") );
      out.write("\" + \"</td><td>\" + \"");
      out.print( dateRs.getInt("User1Rating") );
      out.write("\" + \n");
      out.write("            \"</td><td>\" + \"");
      out.print( dateRs.getInt("User2Rating") );
      out.write("\" + \"</td></tr>\");\n");
      out.write("            ");
 }
      out.write("   \n");
      out.write("        }\n");
      out.write("        function hideTable(){\n");
      out.write("        $(\"#mainTable\").hide();\n");
      out.write("        }\n");
      out.write("        function showTable(){\n");
      out.write("        $(\"#mainTable\").show();\n");
      out.write("        }\n");
      out.write("        function submitDate(){\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        </script>\n");
      out.write("<!--    <script src=\"../../dist/js/bootstrap.min.js\"></script>\n");
      out.write("    \n");
      out.write("    <script src=\"../../assets/js/docs.min.js\"></script>-->\n");
      out.write("    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\n");
      out.write("    <script src=\"../../assets/js/ie10-viewport-bug-workaround.js\"></script>\n");
      out.write("    \n");
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
