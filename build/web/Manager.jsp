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

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="../../assets/js/ie-emulation-modes-warning.js"></script>

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">Manager</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="#" id="emp" onclick="showEmp();" >Employee</a></li>
            <li><a href="#" onclick="showUser();" >User</a></li>
            <li><a href="#" onclick="showDate()">Date</a></li>
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
            <li class="active"><a href="User.jsp">Add, Edit, Delete Employee  <span class="sr-only">(current)</span></a></li>
            <li><a href="#">Sales Reports</a></li>
            <li><a href="#">List Users</a></li>
            <li><a href="#">List Dates</a></li>
          </ul>
          <ul class="nav nav-sidebar">
            
            <li><a href="">Revenue from Dates by Customer</a></li>
            <li><a href="">Most revenue customer</a></li>
            <li><a href="">Most active customers</a></li>
            <li><a href="">Who dated who?</a></li>
          </ul>
          <ul class="nav nav-sidebar">
            <li><a href="">Highest-rated customers</a></li>
            <li><a href="">Best days to have a date</a></li>
          </ul>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header">Dashboard</h1>

          <div class="row placeholders">
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
          </div>

          <h2 class="sub-header">Section title</h2>
          <div class="table-responsive">
            <table class="table table-striped">
                <thead>
                    
                </thead>
              <tbody id="bodyemp">
                <% 
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
                
                String getDateQuery = "SELECT * FROM Date";
                java.sql.ResultSet dateRs = DBConnection.ExecQuery(getDateQuery);
                
                String getDateColQuery = "SELECT `COLUMN_NAME` FROM `INFORMATION_SCHEMA`.`COLUMNS` "
                        + "WHERE `TABLE_SCHEMA`='The_Expendables' AND `TABLE_NAME`='Date';";
                java.sql.ResultSet dateColRs = DBConnection.ExecQuery(getDateColQuery);
                %>
                
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </div>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    
    <script type="text/javascript" language="javascript">
        $(document).ready(function(){
            
        });
        function showEmp(){ 
            $("thead").html("");
            $("tbody").html("");
            $("thead").append("<tr>");
            <% while(empColRs.next()){ %>
               $("thead").append("<th>" + "<%= empColRs.getString("COLUMN_NAME") %>" + "</th>");
            <% } %>
                $("thead").append("</tr>");
            <% while(empRs.next()){ %>    
                $("tbody").append("<tr><td>" + "<%= empRs.getString("SSN") %>" + "</td><td>"+"<%= empRs.getString("Role") %>"
            +"</td><td>" + "<%= empRs.getDate("StartDate") %>"+"</td><td>" + "<%= empRs.getInt("HourlyRate") %>" + "</td></tr>");
            <% }%>   
        }
        function showUser(){
            $("thead").html("");
            $("tbody").html("");
            $("thead").append("<tr>");
            <% while(userColRs.next()){ %>
                $("thead").append("<th>" + "<%= userColRs.getString("COLUMN_NAME") %>" + "</th>");
            <% } %>
                $("thead").append("</tr>");
            <% while(userRs.next()){ %>    
                $("tbody").append("<tr><td>" + "<%= userRs.getString("SSN") %>" + "</td><td>"+"<%= userRs.getString("PPP") %>"
            +"</td><td>" + "<%= userRs.getInt("Rating") %>"+"</td><td>" + "<%= userRs.getDate("DateOfLastAct") %>" + "</td></tr>");
            <% }%>   
        }
        function showDate(){
            $("thead").html("");
            $("tbody").html("");
            $("thead").append("<tr>");
            <% while(dateColRs.next()){ %>
                $("thead").append("<th>" + "<%= dateColRs.getString("COLUMN_NAME") %>" + "</th>");
            <% } %>
                $("thead").append("</tr>");
            <% while(dateRs.next()){ %>    
                $("tbody").append("<tr><td>" + "<%= dateRs.getString("Profile1") %>" + "</td><td>"+"<%= dateRs.getString("Profile2") %>"
            +"</td><td>" + "<%= dateRs.getString("CustRep") %>"+"</td><td>" + "<%= dateRs.getDate("Date_Time") %>" + "</td><td>" 
            + "<%= dateRs.getString("Location") %>" + "</td><td>" + "<%= dateRs.getFloat("BookingFee") %>" + "</td><td>" +
            "<%= dateRs.getString("Comments") %>" + "</td><td>" + "<%= dateRs.getInt("User1Rating") %>" + 
            "</td><td>" + "<%= dateRs.getInt("User2Rating") %>" + "</td></tr>");
            <% }%>   
        }
        </script>
    <script src="../../dist/js/bootstrap.min.js"></script>
    <script src="../../assets/js/docs.min.js"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>
