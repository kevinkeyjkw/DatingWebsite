package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import DBWorks.DBConnection;
import java.sql.SQLException;
import java.sql.ResultSet;

public final class User_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <link rel=\"icon\" href=\"../../favicon.ico\">\n");
      out.write("\n");
      out.write("        <title>Dashboard Template for Bootstrap</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"css/dashboard.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("            ");

                String id = (String) session.getAttribute("ProfileID");
                String state= (String)session.getAttribute("state");
            
      out.write("\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">");
      out.print(id);
      out.write("</a>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                        <li><a href=\"User.jsp?ProfileID=");
      out.print(id);
      out.write("\" id=\"emp\"  >My Profile</a></li>\n");
      out.write("                        <li><a href=\"SelectProfile.jsp\" >Change Profile</a></li>\n");
      out.write("                        <li><a href=\"index.jsp\">Logout</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <form class=\"navbar-form navbar-right\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Search...\">\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3 col-md-2 sidebar\">\n");
      out.write("                    <ul class=\"nav nav-sidebar\">\n");
      out.write("                        <li id=\"home\" class=\"active\"><a href=\"#\" onclick=\"showOtherUser();\">Other User<span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("                        <li id=\"past\"><a href=\"#\" onclick=\"getPastDate()\">My Past Dates</a></li>\n");
      out.write("                        <li id=\"pending\"><a href=\"#\" onclick=\"getPendingDate()\">My Pending Dates</a></li>\n");
      out.write("                        <li id=\"mylike\"><a href=\"#\" onclick=\"myLike()\">My Like List</li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"nav nav-sidebar\">\n");
      out.write("                        <li><a href=\"#\">Profile Filter</a></li>\n");
      out.write("                        <li><a href=\"#\">Most Active</a></li>\n");
      out.write("                        <li><a href=\"#\">Most Highly Rated</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"nav nav-sidebar\">\n");
      out.write("                        <li><a href=\"#\">Popular Geo-Date Location</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"nav nav-sidebar\">\n");
      out.write("                        <li><a href=\"#\">Date Suggestion</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main\">\n");
      out.write("                    <h1 class=\"page-header\">");
      out.print(id);
      out.write("</h1>\n");
      out.write("                    \n");
      out.write("                    <!--<div class=\"row placeholders\">\n");
      out.write("                      <div class=\"col-xs-6 col-sm-3 placeholder\">\n");
      out.write("                        <img data-src=\"holder.js/200x200/auto/sky\" class=\"img-responsive\" alt=\"Generic placeholder thumbnail\">\n");
      out.write("                        <h4>Label</h4>\n");
      out.write("                        <span class=\"text-muted\">Something else</span>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"col-xs-6 col-sm-3 placeholder\">\n");
      out.write("                        <img data-src=\"holder.js/200x200/auto/vine\" class=\"img-responsive\" alt=\"Generic placeholder thumbnail\">\n");
      out.write("                        <h4>Label</h4>\n");
      out.write("                        <span class=\"text-muted\">Something else</span>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"col-xs-6 col-sm-3 placeholder\">\n");
      out.write("                        <img data-src=\"holder.js/200x200/auto/sky\" class=\"img-responsive\" alt=\"Generic placeholder thumbnail\">\n");
      out.write("                        <h4>Label</h4>\n");
      out.write("                        <span class=\"text-muted\">Something else</span>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"col-xs-6 col-sm-3 placeholder\">\n");
      out.write("                        <img data-src=\"holder.js/200x200/auto/vine\" class=\"img-responsive\" alt=\"Generic placeholder thumbnail\">\n");
      out.write("                        <h4>Label</h4>\n");
      out.write("                        <span class=\"text-muted\">Something else</span>\n");
      out.write("                      </div>\n");
      out.write("                    </div>-->\n");
      out.write("                    <div id=\"mainTable\">\n");
      out.write("                        <h2 class=\"sub-header\"></h2>\n");
      out.write("                        <div class=\"table-responsive\" >\n");
      out.write("                            <table class=\"table table-striped\">\n");
      out.write("                                <thead>\n");
      out.write("\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody id=\"bodyemp\">\n");
      out.write("                                    ");

                                        String getOtherUserColQuery = "SELECT `COLUMN_NAME` FROM `INFORMATION_SCHEMA`.`COLUMNS` "
                                                + "WHERE `TABLE_SCHEMA`='The_Expendables' AND `TABLE_NAME`='Profile';";
                                        java.sql.ResultSet otherUserColRs = DBConnection.ExecQuery(getOtherUserColQuery);
                                        
                                        String ownerssnQuery = "SELECT Person.SSN FROM Person, Profile P WHERE P.ProfileID='"+id+"'AND P.OwnerSSN=Person.SSN";
                                        java.sql.ResultSet ownerssnRs=DBConnection.ExecQuery(ownerssnQuery);
                                        String ssn="";
                                        if (ownerssnRs.next()){
                                            ssn=ownerssnRs.getString("SSN");
                                        }
                                        String getOtherUserProfile = "SELECT * FROM Profile ,User WHERE Profile.OwnerSSN !='" + ssn +"'AND Profile.OwnerSSN=User.SSN";
                                        java.sql.ResultSet otherUserProfileRs = DBConnection.ExecQuery(getOtherUserProfile);
                                        
                                        
                                        
                                        
                                       
                                    
      out.write("\n");
      out.write("\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core JavaScript\n");
      out.write("        ================================================== -->\n");
      out.write("        <!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\n");
      out.write("        <script href=\"js/bootstrap.min.js\" ></script>\n");
      out.write("        <script type=\"text/javascript\" language=\"javascript\">\n");
      out.write("                            $(document).ready(function () {\n");
      out.write("                                ");

                                SimpleDateFormat dateFormat;
                                Calendar cal;
                                
      out.write("\n");
      out.write("                                showOtherUser();\n");
      out.write("                                toggleActive();\n");
      out.write("                                ");
if (state!=null){ 
                                    if (state.equals("make")){
      out.write("\n");
      out.write("                                    alert(\"You succesfully make a date with another profile.\");\n");
      out.write("                                ");
}
                                    if (state.equals("cancel")){
      out.write("\n");
      out.write("                                    alert(\"You succesfully cancel a date .\");\n");
      out.write("                                ");
}
                                    if (state.equals("like")){
      out.write("\n");
      out.write("                                        alert(\"You succesfully like this profile .\");\n");
      out.write("                                ");
}
                                    if (state.equals("failedlike")){
      out.write("\n");
      out.write("                                        alert(\"You already like this profile\");\n");
      out.write("                                ");
} if (state.equals("comment")){
      out.write("\n");
      out.write("                                        alert(\"You successfully comment a past date\");\n");
      out.write("                                ");
}
                                }
      out.write("\n");
      out.write("                                \n");
      out.write("                            });\n");
      out.write("\n");
      out.write("                            function toggleActive() {\n");
      out.write("                                $(\"li\").click(function () {\n");
      out.write("                                    $(\"li\").removeClass(\"active\");\n");
      out.write("                                })\n");
      out.write("                                $(\"li\").click(function () {\n");
      out.write("                                    $(this).addClass(\"active\");\n");
      out.write("                                })\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("                            function showOtherUser() {\n");
      out.write("                                showTable();\n");
      out.write("                                $(\"thead\").html(\"\");\n");
      out.write("                                $(\"tbody\").html(\"\");\n");
      out.write("                                $(\".sub-header\").html(\"Profile Table\");\n");
      out.write("                                $(\"thead\").append(\"<tr>\");\n");
      out.write("                                ");
 while (otherUserColRs.next()) {
                                    if (!otherUserColRs.getString("COLUMN_NAME").equals("OwnerSSN")
                                        &&!otherUserColRs.getString("COLUMN_NAME").equals("CreationDate")
                                        &&!otherUserColRs.getString("COLUMN_NAME").equals("LastModDate")){
      out.write("\n");
      out.write("                                    $(\"thead\").append(\"<th>\" + \"");
      out.print( otherUserColRs.getString("COLUMN_NAME"));
      out.write("\" + \"</th>\");\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                                ");
 }
      out.write("\n");
      out.write("                                $(\"thead\").append(\"<th>Operation</th>\")\n");
      out.write("                                $(\"thead\").append(\"</tr>\");\n");
      out.write("                                ");
 while (otherUserProfileRs.next()){
      out.write("\n");
      out.write("                                    $(\"tbody\").append(\"<tr>\");\n");
      out.write("                                    $(\"tbody\").append(\"<td><a href=\\\"ProfileInfo.jsp?ProfileID=");
      out.print(otherUserProfileRs.getString(1));
      out.write("\\\">\"+\"");
      out.print(otherUserProfileRs.getString(1));
      out.write("\"+\"</td>\"+\n");
      out.write("                                                      \"<td>\"+\"");
      out.print(otherUserProfileRs.getInt(3));
      out.write("\"+\"</td>\"+\n");
      out.write("                                                      \"<td>\"+\"");
      out.print(otherUserProfileRs.getInt(4));
      out.write("\"+\"</td>\"+\n");
      out.write("                                                      \"<td>\"+\"");
      out.print(otherUserProfileRs.getInt(5));
      out.write("\"+\"</td>\"+\n");
      out.write("                                                      \"<td>\"+\"");
      out.print(otherUserProfileRs.getInt(6));
      out.write("\"+\"</td>\"+\n");
      out.write("                                                      \"<td>\"+\"");
      out.print(otherUserProfileRs.getString(7));
      out.write("\"+\"</td>\"+\n");
      out.write("                                                      \"<td>\"+\"");
      out.print(otherUserProfileRs.getString(8));
      out.write("\"+\"</td>\"+\n");
      out.write("                                                      \"<td>\"+\"");
      out.print(otherUserProfileRs.getDouble(9));
      out.write("\"+\"</td>\"+\n");
      out.write("                                                      \"<td>\"+\"");
      out.print(otherUserProfileRs.getInt(10));
      out.write("\"+\"</td>\"+\n");
      out.write("                                                      \"<td>\"+\"");
      out.print(otherUserProfileRs.getString(11));
      out.write("\"+\"</td>\");\n");
      out.write("                                    $(\"tbody\").append(\"<input type=button onclick=\\\"javascrip:window.open('DateForm.jsp?datee=");
      out.print(otherUserProfileRs.getString(1));
      out.write("&dater=");
      out.print(id);
      out.write("','_self');return;\\\" value=\\\"Date\\\">\");\n");
      out.write("                                    $(\"tbody\").append(\"<input type=button onclick=\\\"javascrip:window.open('LikeProfile.jsp?likee=");
      out.print(otherUserProfileRs.getString(1));
      out.write("&liker=");
      out.print(id);
      out.write("','_self');return;\\\" value=\\\"Like\\\">\");\n");
      out.write("                                    $(\"tbody\").append(\"</tr\");\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                             \n");
      out.write("                            }\n");
      out.write("                            \n");
      out.write("                            function getPastDate(){\n");
      out.write("                                showTable();\n");
      out.write("                                $(\"thead\").html(\"\");\n");
      out.write("                                $(\"tbody\").html(\"\");;\n");
      out.write("                                $(\".sub-header\").html(\"Past Date Table\");\n");
      out.write("                                $(\"thead\").append(\"<tr>\");\n");
      out.write("                                $(\"thead\").append(\"<th>Profile1</th>\" +\n");
      out.write("                                                  \"<th>Profile2</th>\" +\n");
      out.write("                                                  \"<th>Date</th>\"+ \n");
      out.write("                                                  \"<th>Location</th>\"+\n");
      out.write("                                                  \"<th>User1Rating</th>\"+\n");
      out.write("                                                  \"<th>User2Rating</th>\"+\n");
      out.write("                                                  \"<th>Operation</th>\");\n");
      out.write("                                $(\"thead\").append(\"</tr>\");\n");
      out.write("                                ");

                                dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                cal = Calendar.getInstance();
                                String getPastDateQuery = "SELECT * FROM Date D WHERE (D.Profile1= '" + id + "' OR D.Profile2= '" + id +"') AND D.Date_Time < '"+dateFormat.format(cal.getTime())+"'";
                                java.sql.ResultSet getPastDateRs = DBConnection.ExecQuery(getPastDateQuery);
                                
      out.write("\n");
      out.write("                                ");
 while (getPastDateRs.next()){
      out.write("\n");
      out.write("                                    $(\"tbody\").append(\"<tr>\");\n");
      out.write("                                    $(\"tbody\").append(\"<td><a href=\\\"ProfileInfo.jsp?ProfileID=");
      out.print(getPastDateRs.getString(1));
      out.write("\\\">\"+\"");
      out.print(getPastDateRs.getString(1));
      out.write("\"+\"</td>\"+\n");
      out.write("                                                      \"<td><a href=\\\"ProfileInfo.jsp?ProfileID=");
      out.print(getPastDateRs.getString(2));
      out.write("\\\">\"+\"");
      out.print(getPastDateRs.getString(2));
      out.write("\"+\"</td>\"+\n");
      out.write("                                                      \"<td>\"+\"");
      out.print(getPastDateRs.getDate(4));
      out.write(' ');
      out.print(getPastDateRs.getTime(4));
      out.write("\"+\"</td>\"+\n");
      out.write("                                                      \"<td>\"+\"");
      out.print(getPastDateRs.getString(5));
      out.write("\"+\"</td>\"+\n");
      out.write("                                                      \"<td>\"+");
      out.print(getPastDateRs.getInt(8));
      out.write("+\"</td>\"+\n");
      out.write("                                                      \"<td>\"+");
      out.print(getPastDateRs.getInt(9));
      out.write("+\"</td>\");\n");
      out.write("                                    $(\"tbody\").append(\"<input type=button onclick=\\\"javascript:window.open('RateDateForm.jsp?profile1=");
      out.print(getPastDateRs.getString(1));
      out.write("&profile2=");
      out.print(getPastDateRs.getString(2));
      out.write("&date=");
      out.print(getPastDateRs.getDate(4));
      out.write("&time=");
      out.print(getPastDateRs.getTime(4));
      out.write("&id=");
      out.print(id);
      out.write("','_self');return;\\\" value=\\\"Comment\\\">\");\n");
      out.write("                                    $(\"tbody\").append(\"</tr\");\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                            }    \n");
      out.write("                            \n");
      out.write("                            function getPendingDate(){\n");
      out.write("                                \n");
      out.write("                                showTable();\n");
      out.write("                                $(\"thead\").html(\"\");\n");
      out.write("                                $(\"tbody\").html(\"\");\n");
      out.write("                                $(\".sub-header\").html(\"Pending Date Table\");\n");
      out.write("                                $(\"thead\").append(\"<tr>\");\n");
      out.write("                                $(\"thead\").append(\"<th>Profile1</th>\" +\n");
      out.write("                                                  \"<th>Profile2</th>\" +\n");
      out.write("                                                  \"<th>Date</th>\"+ \n");
      out.write("                                                  \"<th>Location</th>\"+\n");
      out.write("                                                  \"<th>Operation</th>\");\n");
      out.write("                                $(\"thead\").append(\"</tr>\");\n");
      out.write("                                ");

                                dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                cal = Calendar.getInstance();
                                String getPendingDateQuery = "SELECT * FROM Dated D WHERE (D.Profile1= '" + id + "' OR D.Profile2= '" + id +"') AND D.Date_Time > '"+dateFormat.format(cal.getTime())+"'";
                                        java.sql.ResultSet getPendingDateRs = DBConnection.ExecQuery(getPendingDateQuery);
                                
      out.write("\n");
      out.write("                                ");
 while (getPendingDateRs.next()){
      out.write("\n");
      out.write("                                    $(\"tbody\").append(\"<tr>\");\n");
      out.write("                                    $(\"tbody\").append(\"<td><a href=\\\"ProfileInfo.jsp?ProfileID=");
      out.print(getPendingDateRs.getString(1));
      out.write("\\\">\"+\"");
      out.print(getPendingDateRs.getString(1));
      out.write("\"+\"</td>\"+\n");
      out.write("                                                      \"<td><a href=\\\"ProfileInfo.jsp?ProfileID=");
      out.print(getPendingDateRs.getString(2));
      out.write("\\\">\"+\"");
      out.print(getPendingDateRs.getString(2));
      out.write("\"+\"</td>\"+\n");
      out.write("                                                      \"<td>\"+\"");
      out.print(getPendingDateRs.getDate(4));
      out.write(' ');
      out.print(getPendingDateRs.getTime(4));
      out.write("\"+\"</td>\"+\n");
      out.write("                                                      \"<td>\"+\"");
      out.print(getPendingDateRs.getString(5));
      out.write("\"+\"</td>\");\n");
      out.write("                                    $(\"tbody\").append(\"<input type=button onclick=\\\"javascript:if(confirm('Are you sure that you want to cancel this date?')==true){window.open('CancelDate.jsp?datee=");
      out.print(getPendingDateRs.getString(2));
      out.write("&dater=");
      out.print(getPendingDateRs.getString(1));
      out.write("&date=");
      out.print(getPendingDateRs.getDate(4));
      out.write("&time=");
      out.print(getPendingDateRs.getTime(4));
      out.write("','_self')};return;\\\" value=\\\"Cancel\\\">\");\n");
      out.write("                 \n");
      out.write("                                    $(\"tbody\").append(\"</tr\");\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                            }   \n");
      out.write("                            \n");
      out.write("                            function myLike(){\n");
      out.write("                                showTable();\n");
      out.write("                                $(\"thead\").html(\"\");\n");
      out.write("                                $(\"tbody\").html(\"\");\n");
      out.write("                                $(\".sub-header\").html(\"My Like Table\");\n");
      out.write("                                $(\"thead\").append(\"<tr>\");\n");
      out.write("                                $(\"thead\").append(\"<th>Likee</th>\" +\n");
      out.write("                                                  \"<th>Like Time</th>\"+\n");
      out.write("                                                  \"<th>Operation</th>\");\n");
      out.write("                                $(\"thead\").append(\"</tr>\");\n");
      out.write("                                ");

                                        dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                        cal = Calendar.getInstance();
                                        String myLikeQuery = "SELECT * FROM Likes WHERE Liker='"+id+"'";
                                        java.sql.ResultSet myLikeRs = DBConnection.ExecQuery(myLikeQuery);
                                
      out.write("\n");
      out.write("                                ");
 while (myLikeRs.next()){
      out.write("\n");
      out.write("                                    $(\"tbody\").append(\"<tr>\");\n");
      out.write("                                    $(\"tbody\").append(\n");
      out.write("                                                      \"<td><a href=\\\"ProfileInfo.jsp?ProfileID=");
      out.print(myLikeRs.getString(2));
      out.write("\\\">\"+\"");
      out.print(myLikeRs.getString(2));
      out.write("\"+\"</td>\"+\n");
      out.write("                                                      \"<td>\"+\"");
      out.print(myLikeRs.getDate(3));
      out.write(' ');
      out.print(myLikeRs.getTime(3));
      out.write("\");    \n");
      out.write("                                    $(\"tbody\").append(\"<input type=button onclick=\\\"javascript:if(confirm('Are you sure that you want to unlike this file?')==true){window.open('UnlikeProfile.jsp?likee=");
      out.print(myLikeRs.getString(2));
      out.write("&liker=");
      out.print(id);
      out.write("&date=");
      out.print(myLikeRs.getDate(3));
      out.write("&time=");
      out.print(myLikeRs.getTime(3));
      out.write("','_self')};return;\\\" value=\\\"Unlike\\\">\");\n");
      out.write("\n");
      out.write("                                    $(\"tbody\").append(\"</tr\");\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                            }    \n");
      out.write("                            function hideTable() {\n");
      out.write("                                $(\"#mainTable\").hide();\n");
      out.write("                            }\n");
      out.write("                            function showTable() {\n");
      out.write("                                $(\"#mainTable\").show();\n");
      out.write("                            }\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        \n");
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
