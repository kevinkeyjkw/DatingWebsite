package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSetMetaData;
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
      out.write("          <a class=\"navbar-brand\" href=\"#\">Manager</a>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("          <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("            <li><a href=\"#\" id=\"emp\" onclick=\"showEmp();\" >Employee</a></li>\n");
      out.write("            <li><a href=\"#\" onclick=\"showUser();\" >User</a></li>\n");
      out.write("            <li><a  href=\"Date.jsp\" >Date</a></li>\n");
      out.write("            <li><a href=\"index.jsp\">Logout</a></li>\n");
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
      out.write("            <li class=\"active\"><a href=\"Manager.jsp\">Home <span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("            <li><a onclick=\"showAEDEmp();\" href=\"#\" >Add, Edit, Delete Employee </a></li>\n");
      out.write("            <li onclick=\"showSalesReport();\"><a href=\"#\">Sales Reports</a></li>\n");
      out.write("            <li onclick=\"showCustRevByDate();\"><a href=\"#\">Revenue from Dates by Customer</a></li>\n");
      out.write("            <li onclick=\"showCustTotalRev();\"><a href=\"#\">Most revenue customer</a></li>\n");
      out.write("            <li onclick=\"showActiveCust();\"><a href=\"#\">Most active customers</a></li>\n");
      out.write("            <li onclick=\"showCustRepTotalRev();\"><a href=\"#\">Most Revenue Customer Representative</a></li>\n");
      out.write("            <li ><a href=\"#\">Who dated who?</a></li>\n");
      out.write("            <li onclick=\"showHighRateCust();\"><a href=\"#\">Highest-rated customers</a></li>\n");
      out.write("            <li onclick=\"showBestDays();\"><a href=\"#\">Best days to have a date</a></li>\n");
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
      out.write("         <form action=\"salesReport.jsp\">\n");
      out.write("          <select name=\"month\" class=\"dropdown\">\n");
      out.write("            <option value=\"1\">1</option>\n");
      out.write("            <option value=\"2\">2</option>\n");
      out.write("            <option value=\"3\">3</option>\n");
      out.write("            <option value=\"4\">4</option>\n");
      out.write("            <option value=\"5\">5</option>\n");
      out.write("            <option value=\"6\">6</option>\n");
      out.write("            <option value=\"7\">7</option>\n");
      out.write("            <option value=\"8\">8</option>\n");
      out.write("            <option value=\"9\">9</option>\n");
      out.write("            <option value=\"10\">10</option>\n");
      out.write("            <option value=\"11\">11</option>\n");
      out.write("            <option value=\"12\">12</option>\n");
      out.write("            </select>\n");
      out.write("              <select name=\"year\" class=\"dropdown\">\n");
      out.write("                  <option value=\"2011\">2011</option>\n");
      out.write("            <option value=\"2012\">2012</option>\n");
      out.write("            <option value=\"2013\">2013</option>\n");
      out.write("            <option value=\"2014\">2014</option>\n");
      out.write("              </select>\n");
      out.write("              <button type=\"submit\" class=\"btn btn-default\">Obtain Report</button>\n");
      out.write("              </form>\n");
      out.write("              </div>\n");
      out.write("              <div id=\"salesReportB\">\n");
      out.write("                  \n");
      out.write("              </div>\n");
      out.write("            </div>  <!-- End of get sales report-->\n");
      out.write("            <div id=\"aedEmp\" class=\"hidden\">\n");
      out.write("                <a  class=\"btn btn-default\" href=\"AddEmp.jsp\">Add Employee</a>\n");
      out.write("                <a  class=\"btn btn-default\" href=\"EditEmp.jsp\">Edit Employee</a>\n");
      out.write("                <a  class=\"btn btn-default\" href=\"DeleteEmp.jsp\">Delete Employee</a>\n");
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
      out.write("        function showBestDays(){\n");
      out.write("              $(\".sub-header\").html(\"Best days to have a date\");\n");
      out.write("            showTable();\n");
      out.write("            hideActiveCust();\n");
      out.write("            hideAEDEmp();\n");
      out.write("            hideSalesReport();\n");
      out.write("            \n");
      out.write("            $(\"#mainTable thead\").html(\"\");\n");
      out.write("            $(\"#mainTable tbody\").html(\"\");\n");
      out.write("            ");

                String bestDaysQuery = "SELECT DATE(D.Date_Time) AS Date, AVG(D.User1Rating+D.User2Rating) AS AvgRating"
                        + " FROM Date D"
                        + " WHERE YEAR(D.Date_Time)='2014'"
                        + " GROUP BY DATE(D.Date_Time)";
                ResultSet bestDaysRs = DBConnection.ExecQuery(bestDaysQuery);
                ResultSetMetaData bestDaysMd = bestDaysRs.getMetaData();
            
      out.write("\n");
      out.write("            $(\"#mainTable thead\").append(\"<tr>\");\n");
      out.write("            ");
 for(int k=1;k<bestDaysMd.getColumnCount()+1;k++){ 
      out.write("\n");
      out.write("            $(\"#mainTable thead\").append(\"<th>\" + \"");
      out.print( bestDaysMd.getColumnLabel(k) );
      out.write("\" + \"</th>\");\n");
      out.write("            ");
 }
      out.write("\n");
      out.write("            $(\"#mainTable thead\").append(\"</tr>\");\n");
      out.write("            ");
 while(bestDaysRs.next()){ 
      out.write("\n");
      out.write("            $(\"#mainTable tbody\").append(\"<tr><td>\" + \"");
      out.print( bestDaysRs.getString("Date") );
      out.write("\" \n");
      out.write("            + \"</td><td>\" + \"");
      out.print( bestDaysRs.getString("AvgRating") );
      out.write("\" \n");
      out.write("            + \"</td></tr>\");\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("        }\n");
      out.write("        function showHighRateCust(){\n");
      out.write("            showTable();\n");
      out.write("            $(\".sub-header\").html(\"Highest Rated Customers\");\n");
      out.write("            hideActiveCust();\n");
      out.write("            hideAEDEmp();\n");
      out.write("            hideSalesReport();\n");
      out.write("            $(\"#mainTable thead\").html(\"\");\n");
      out.write("            $(\"#mainTable tbody\").html(\"\");\n");
      out.write("            ");

            String highRateCustQuery = "SELECT * FROM User"
                    + " WHERE Rating > 2"
                    + " ORDER BY Rating DESC";
            ResultSet highRateCustRs = DBConnection.ExecQuery(highRateCustQuery);
             ResultSetMetaData highRateCustMd = highRateCustRs.getMetaData();
            
      out.write("\n");
      out.write("            $(\"#mainTable thead\").append(\"<tr>\");\n");
      out.write("            ");
 for(int k=1;k<highRateCustMd.getColumnCount()+1;k++){ 
      out.write("\n");
      out.write("            $(\"#mainTable thead\").append(\"<th>\" + \"");
      out.print( highRateCustMd.getColumnLabel(k) );
      out.write("\" + \"</th>\");\n");
      out.write("            ");
 }
      out.write("\n");
      out.write("            $(\"#mainTable thead\").append(\"</tr>\");\n");
      out.write("            ");
 while(highRateCustRs.next()){ 
      out.write("\n");
      out.write("            $(\"#mainTable tbody\").append(\"<tr><td>\" + \"");
      out.print( highRateCustRs.getString("SSN") );
      out.write("\" \n");
      out.write("            + \"</td><td>\" + \"");
      out.print( highRateCustRs.getString("PPP") );
      out.write("\" \n");
      out.write("            + \"</td><td>\"+ \"");
      out.print( highRateCustRs.getInt("Rating") );
      out.write("\"\n");
      out.write("            + \"</td><td>\"+\"");
      out.print( highRateCustRs.getDate("DateOfLastAct").toString() );
      out.write("\" + \"</td></tr>\");\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("        }\n");
      out.write("        function showCustRepTotalRev(){\n");
      out.write("            $(\".sub-header\").html(\"Total Revenue of Customer Representatives\");\n");
      out.write("            showTable();\n");
      out.write("            hideActiveCust();\n");
      out.write("            hideAEDEmp();\n");
      out.write("            hideSalesReport();\n");
      out.write("            $(\"#mainTable thead\").html(\"\");\n");
      out.write("            $(\"#mainTable tbody\").html(\"\");\n");
      out.write("            ");

             String activeCustRepQuery = "SELECT D.CustRep, SUM(D.BookingFee) AS TotalRevenue,COUNT(D.CustRep) AS NumDateTransactions"
                     + " FROM Date D"
                     + " GROUP BY D.CustRep"
                     + " ORDER BY TotalRevenue DESC"
                     ;
             ResultSet activeCustRepRs = DBConnection.ExecQuery(activeCustRepQuery);
             ResultSetMetaData activeCustRepMd = activeCustRepRs.getMetaData();
             
            
      out.write("\n");
      out.write("            $(\"#mainTable thead\").append(\"<tr>\");\n");
      out.write("            ");
 for(int k=1;k<activeCustRepMd.getColumnCount()+1;k++){ 
      out.write("\n");
      out.write("            $(\"#mainTable thead\").append(\"<th>\" + \"");
      out.print( activeCustRepMd.getColumnLabel(k) );
      out.write("\" + \"</th>\");\n");
      out.write("            ");
 }
      out.write("\n");
      out.write("            $(\"#mainTable thead\").append(\"</tr>\");\n");
      out.write("            ");
 while(activeCustRepRs.next()){ 
      out.write("\n");
      out.write("            $(\"#mainTable tbody\").append(\"<tr><td>\" + \"");
      out.print( activeCustRepRs.getString("CustRep") );
      out.write("\" \n");
      out.write("            + \"</td><td>\" + \"");
      out.print( activeCustRepRs.getFloat("TotalRevenue") );
      out.write("\" \n");
      out.write("            + \"</td><td>\"+ \"");
      out.print( activeCustRepRs.getInt("NumDateTransactions") );
      out.write("\" +\"</td></tr>\");\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("        }\n");
      out.write("        function showActiveCustLikes(){\n");
      out.write("            showTable();\n");
      out.write("            $(\"#mainTable thead\").html(\"\");\n");
      out.write("            $(\"#mainTable tbody\").html(\"\");\n");
      out.write("            ");

                String activeCustLikeQuery = "SELECT P.OwnerSSN,COUNT(P.OwnerSSN) AS NumOfLikes "
                        + " FROM Profile P,Likes L"
                        + " WHERE P.ProfileID=L.Liker"
                        + " GROUP BY P.OwnerSSN"
                        + " HAVING COUNT(P.OwnerSSN) >= 2"
                        + " ORDER BY NumOfLikes DESC";
                ResultSet activeCustLikeRs = DBConnection.ExecQuery(activeCustLikeQuery);
                ResultSetMetaData activeCustLikeMd = activeCustLikeRs.getMetaData();
                
            
      out.write("\n");
      out.write("                    \n");
      out.write("                    $(\"#mainTable thead\").append(\"<tr>\");\n");
      out.write("                    ");
 for(int k=1;k<activeCustLikeMd.getColumnCount()+1;k++){ 
      out.write("\n");
      out.write("                        $(\"#mainTable thead\").append(\"<th>\" + \"");
      out.print( activeCustLikeMd.getColumnLabel(k) );
      out.write("\" + \"</th>\");\n");
      out.write("                        ");
 }
      out.write("\n");
      out.write("                    $(\"#mainTable thead\").append(\"</tr>\");\n");
      out.write("                    ");
 while(activeCustLikeRs.next()){ 
      out.write("\n");
      out.write("                        $(\"#mainTable tbody\").append(\"<tr><td>\" + \"");
      out.print( activeCustLikeRs.getString("OwnerSSN") );
      out.write("\" \n");
      out.write("                              + \"</td><td>\" + \"");
      out.print( activeCustLikeRs.getInt("NumOfLikes") );
      out.write("\" + \"</td></tr>\");\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("        }\n");
      out.write("        function showActiveCustDates(){\n");
      out.write("            showTable();\n");
      out.write("            $(\"#mainTable thead\").html(\"\");\n");
      out.write("            $(\"#mainTable tbody\").html(\"\");\n");
      out.write("            ");

             String activeCustDateQuery = "SELECT U.SSN,COUNT(U.SSN) AS NumOfDates"
                     + " FROM User U,Profile P,Date D"
                     + " WHERE P.OwnerSSN=U.SSN AND (P.ProfileID=D.Profile1 OR P.ProfileID=D.Profile2)"
                     + " GROUP BY U.SSN"
                     + " HAVING COUNT(NumOfDates) >= 2"
                     + " ORDER BY NumOfDates DESC"
                     ;
             ResultSet activeCustDateRs = DBConnection.ExecQuery(activeCustDateQuery);
             ResultSetMetaData activeCustDateMd = activeCustDateRs.getMetaData();
             
            
      out.write("\n");
      out.write("            $(\"#mainTable thead\").append(\"<tr>\");\n");
      out.write("            ");
 for(int k=1;k<activeCustDateMd.getColumnCount()+1;k++){ 
      out.write("\n");
      out.write("            $(\"#mainTable thead\").append(\"<th>\" + \"");
      out.print( activeCustDateMd.getColumnLabel(k) );
      out.write("\" + \"</th>\");\n");
      out.write("            ");
 }
      out.write("\n");
      out.write("            $(\"#mainTable thead\").append(\"</tr>\");\n");
      out.write("            ");
 while(activeCustDateRs.next()){ 
      out.write("\n");
      out.write("            $(\"#mainTable tbody\").append(\"<tr><td>\" + \"");
      out.print( activeCustDateRs.getString("SSN") );
      out.write("\" \n");
      out.write("            + \"</td><td>\" + \"");
      out.print( activeCustDateRs.getInt("NumOfDates") );
      out.write("\" + \"</td></tr>\");\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        function showActiveCust(){\n");
      out.write("            hideTable();\n");
      out.write("            hideSalesReport();\n");
      out.write("            hideAEDEmp();\n");
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
      out.write("            hideActiveCust();\n");
      out.write("            hideSalesReport();\n");
      out.write("            $(\"#title\").html(\"Add Edit Delete Employee\");\n");
      out.write("            $(\"#aedEmp\").removeClass('hidden');\n");
      out.write("        }\n");
      out.write("        function hideAEDEmp(){\n");
      out.write("            $(\"#title\").html(\"\");\n");
      out.write("            $(\"#aedEmp\").addClass('hidden');\n");
      out.write("        }\n");
      out.write("        function showSalesReport(){\n");
      out.write("            hideTable();\n");
      out.write("            hideActiveCust();\n");
      out.write("            hideAEDEmp();\n");
      out.write("            $(\"#title\").html(\"Monthly Sales Report\");\n");
      out.write("            $(\"#salesReport\").removeClass('hidden');\n");
      out.write("        }\n");
      out.write("        function hideSalesReport(){\n");
      out.write("            $(\"#title\").html(\"\");\n");
      out.write("            $(\"#salesReport\").addClass('hidden');\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        function showCustTotalRev(){\n");
      out.write("            showTable();\n");
      out.write("            hideActiveCust();\n");
      out.write("            hideAEDEmp();\n");
      out.write("            hideSalesReport();\n");
      out.write("            $(\"#mainTable thead\").html(\"\");\n");
      out.write("            $(\"#mainTable tbody\").html(\"\");\n");
      out.write("            ");

            String getCustTotalRevQuery = "SELECT U.SSN, U.PPP, CASE U.PPP"
                    + " WHEN 'Super-User' THEN SUM(D.BookingFee)+100"
                    + " WHEN 'Good-User' THEN SUM(D.BookingFee)+50"
                    + " WHEN 'User-User' THEN SUM(D.BookingFee)"
                    + " END AS TotalRevenue"
                    + " FROM User U, Profile P, Date D"
                    + " WHERE U.SSN = P.OwnerSSN"
                    + " AND (P.ProfileID = D.Profile1 OR P.ProfileID = D.Profile2)"
                    + " GROUP BY U.SSN,U.PPP"
                    + " ORDER BY TotalRevenue DESC";
            java.sql.ResultSet custTotalRevRs = DBConnection.ExecQuery(getCustTotalRevQuery);
            String[] custTotalRevCol = {"SSN", "PPP","TotalRevenue"};
            
      out.write("\n");
      out.write("             $(\".sub-header\").html(\"Total Revenue from Customers\");\n");
      out.write("            $(\"#mainTable thead\").append(\"<tr>\");\n");
      out.write("            \n");
      out.write("            ");
 for(String tmp: custTotalRevCol){ 
      out.write("\n");
      out.write("               $(\"#mainTable thead\").append(\"<th>\" + \"");
      out.print( tmp );
      out.write("\" + \"</th>\");\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("                $(\"#mainTable thead\").append(\"</tr>\");\n");
      out.write("            ");
 while(custTotalRevRs.next()){ 
      out.write("    \n");
      out.write("                $(\"#mainTable tbody\").append(\"<tr><td>\" + \"");
      out.print( custTotalRevRs.getString("SSN") );
      out.write("\" + \"</td><td>\"\n");
      out.write("                    +\"");
      out.print( custTotalRevRs.getString("PPP") );
      out.write("\" + \"</td><td>\"    \n");
      out.write("                    +\"");
      out.print( custTotalRevRs.getFloat("TotalRevenue") );
      out.write("\"+\"</td></tr>\");\n");
      out.write("            ");
 }
      out.write("   \n");
      out.write("    \n");
      out.write("        }\n");
      out.write("        function showCustRevByDate(){\n");
      out.write("            showTable();\n");
      out.write("            hideAEDEmp();\n");
      out.write("            hideActiveCust();\n");
      out.write("            hideSalesReport();\n");
      out.write("            $(\"#mainTable thead\").html(\"\");\n");
      out.write("            $(\"#mainTable tbody\").html(\"\");\n");
      out.write("            ");

            String getCustRevDateQuery = "SELECT U.SSN, SUM(D.BookingFee)"
                    + " FROM User U, Profile P, Date D"
                    + " WHERE U.SSN = P.OwnerSSN"
                    + " AND (P.ProfileID = D.Profile1 OR P.ProfileID = D.Profile2)"
                    + " GROUP BY U.SSN"
                    + " ORDER BY SUM(D.BookingFee) DESC";
                java.sql.ResultSet custRevDateRs = DBConnection.ExecQuery(getCustRevDateQuery);
                String [] custRevDateColName = {"SSN","Date Revenue"};
            
      out.write("\n");
      out.write("            $(\".sub-header\").html(\"Revenue from Customer Dates Table\");\n");
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
      out.print( custRevDateRs.getString("SSN") );
      out.write("\" + \"</td><td>\"\n");
      out.write("                        +\"");
      out.print( custRevDateRs.getFloat("SUM(D.BookingFee)") );
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
