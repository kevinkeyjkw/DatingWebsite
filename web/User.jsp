<%@page import="java.util.Date"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="DBWorks.DBConnection"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="../../favicon.ico">

        <title>Dashboard Template for Bootstrap</title>

        <!-- Bootstrap core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <!-- Custom styles for this template -->
        <link href="css/dashboard.css" rel="stylesheet">

    </head>

    <body>
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <%
                String id = (String) session.getAttribute("ProfileID");
                String state= (String)session.getAttribute("state");
            %>
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#"><%=id%></a>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="User.jsp?ProfileID=<%=id%>" id="emp"  >My Profile</a></li>
                        <li><a href="SelectProfile.jsp" >Change Profile</a></li>
                        <li><a href="index.jsp">Logout</a></li>
                    </ul>
                    <form class="navbar-form navbar-right">
                        <input type="text" class="form-control" placeholder="Search...">
                    </form>
                </div>
            </div>
        </nav>

        <div class="container-fluid">
            <div class="row">
                <div class="col-sm-3 col-md-2 sidebar">
                    <ul class="nav nav-sidebar">
                        <li id="home" class="active" onclick="showOtherUser();"><a href="#" >Other User<span class="sr-only">(current)</span></a></li>
                        <li id="past" onclick="getPastDate();"><a href="#" >My Past Dates</a></li>
                        <li id="pending" onclick="getPendingDate();"><a href="#" >My Pending Dates</a></li>
                        <li id="mylike" onclick="myLike();"><a href="#" >My Like List</li>
                    </ul>
                    <ul class="nav nav-sidebar">
                        <li><a href="#">Profile Filter</a></li>
                        <li><a href="#">Most Active</a></li>
                        <li><a href="#">Most Highly Rated</a></li>
                    </ul>
                    <ul class="nav nav-sidebar">
                        <li><a href="#">Popular Geo-Date Location</a></li>
                    </ul>
                    <ul class="nav nav-sidebar">
                        <li><a href="#">Date Suggestion</a></li>
                    </ul>
                </div>
                <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
                    <h1 class="page-header"><%= id %></h1>
                    
                    <!--<div class="row placeholders">
                      <div class="col-xs-6 col-sm-3 placeholder">
                        <img data-src="holder.js/200x200/auto/sky" class="img-responsive" alt="Generic placeholder thumbnail">
                        <h4>Label</h4>
                        <span class="text-muted">Something else</span>
                      </div>
                      <div class="col-xs-6 col-sm-3 placeholder">
                        <img data-src="holder.js/200x200/auto/vine" class="img-responsive" alt="Generic placeholder thumbnail">
                        <h4>Label</h4>
                        <span class="text-muted">Something else</span>
                      </div>
                      <div class="col-xs-6 col-sm-3 placeholder">
                        <img data-src="holder.js/200x200/auto/sky" class="img-responsive" alt="Generic placeholder thumbnail">
                        <h4>Label</h4>
                        <span class="text-muted">Something else</span>
                      </div>
                      <div class="col-xs-6 col-sm-3 placeholder">
                        <img data-src="holder.js/200x200/auto/vine" class="img-responsive" alt="Generic placeholder thumbnail">
                        <h4>Label</h4>
                        <span class="text-muted">Something else</span>
                      </div>
                    </div>-->
                    <div id="mainTable">
                        <h2 class="sub-header"></h2>
                        <div class="table-responsive" >
                            <table class="table table-striped">
                                <thead>

                                </thead>
                                <tbody id="bodyemp">
                                   

                                </tbody>
                            </table>
                        </div>
                    </div>

                </div>
            </div>
        </div>

        <!-- Bootstrap core JavaScript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script href="js/bootstrap.min.js" ></script>
        <script type="text/javascript" language="javascript">
                        $(document).ready(function(){
                            
                            $('.nav.nav-sidebar li').click(function(){
                                $('.nav.nav-sidebar li').removeClass('active');
                                $(this).toggleClass('active');
                                });
                            <%
                                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                Calendar cal = Calendar.getInstance();
                            %>
                             
                        });
                         function showOtherUser(){
                             
                             
                         }
                        function getPastDate(){
                            <%
                            String getPastDateQuery = "SELECT * FROM Date D WHERE (D.Profile1= '" + id + "' OR D.Profile2= '" + id +"') AND D.Date_Time < '"+dateFormat.format(cal.getTime())+"'";
                            java.sql.ResultSet getPastDateRs = DBConnection.ExecQuery(getPastDateQuery);
                            %>
                             showTable();
                                $("thead").html("");
                                $("tbody").html("");;
                                $(".sub-header").html("Past Date Table");
                                 
                                $("thead").append("<tr><th>Profile1</th><th>Profile2</th><th>Date</th><th>Location</th>"
                                                  + "<th>User1Rating</th><th>User2Rating</th><th>Operation</th></tr>");
                                <% while (getPastDateRs.next()){%>
                                    $("tbody").append("<tr>");
                                    $("tbody").append("<td><a href=\"ProfileInfo.jsp?ProfileID=<%=getPastDateRs.getString(1)%>\">"+"<%=getPastDateRs.getString(1)%>"+"</td>"+
                                                      "<td><a href=\"ProfileInfo.jsp?ProfileID=<%=getPastDateRs.getString(2)%>\">"+"<%=getPastDateRs.getString(2)%>"+"</td>"+
                                                      "<td>"+"<%=getPastDateRs.getDate(4)%> <%=getPastDateRs.getTime(4)%>"+"</td>"+
                                                      "<td>"+"<%=getPastDateRs.getString(5)%>"+"</td>"+
                                                      "<td>"+<%=getPastDateRs.getInt(8)%>+"</td>"+
                                                      "<td>"+<%=getPastDateRs.getInt(9)%>+"</td>");
                                    $("tbody").append("<input type=button onclick=\"javascript:window.open('RateDateForm.jsp?profile1=<%=getPastDateRs.getString(1)%>&profile2=<%=getPastDateRs.getString(2)%>&date=<%=getPastDateRs.getDate(4)%>&time=<%=getPastDateRs.getTime(4)%>&id=<%=id%>','_self');return;\" value=\"Comment\">");
                                    $("tbody").append("</tr");
                                <%}%>
                                
                        }
                        function getPendingDate(){
                            
                        }
                       function myLike(){
                              <%
                                        dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                                        cal = Calendar.getInstance();
                                        String myLikeQuery = "SELECT * FROM Likes WHERE Liker='"+id+"'";
                                        java.sql.ResultSet myLikeRs = DBConnection.ExecQuery(myLikeQuery);
                                %>
                                showTable();
                                $("thead").html("");
                                $("tbody").html("");
                                $(".sub-header").html("My Like Table");
                                $("thead").append("<tr><th>Likee</th><th>Like Time</th><th>Operation</th></tr>");
                                  <% while (myLikeRs.next()){%>
                                    $("tbody").append("<tr>");
                                    $("tbody").append("<td><a href=\"ProfileInfo.jsp?ProfileID=<%=myLikeRs.getString(2)%>\">"+"<%=myLikeRs.getString(2)%>"
                                            +"</td><td>"+"<%=myLikeRs.getDate(3)%> <%=myLikeRs.getTime(3)%>");    
                                    $("tbody").append("<input type=button onclick=\"javascript:if(confirm('Are you sure that you want to unlike this file?')==true){window.open('UnlikeProfile.jsp?likee=<%=myLikeRs.getString(2)%>&liker=<%=id%>&date=<%=myLikeRs.getDate(3)%>&time=<%=myLikeRs.getTime(3)%>','_self')};return;\" value=\"Unlike\">");
                                    $("tbody").append("</tr");
                                <%}%>
                       }
                       function showTable(){
                           
                       };
        </script>
        
        
    </body>
</html>
