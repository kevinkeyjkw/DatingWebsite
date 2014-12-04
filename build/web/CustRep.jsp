<%@page import="java.sql.ResultSetMetaData"%>
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
    

    <title>Dashboard Template for Bootstrap</title>
    <!-- Bootstrap core CSS -->
    
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="css/dashboard.css" rel="stylesheet">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    
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
          <a class="navbar-brand" href="#">Customer Representative</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="#" id="emp" onclick="showEmp();" >Employee</a></li>
            <li><a href="#" onclick="showUser();" >User</a></li>
            <li><a  href="Date.jsp" >Date</a></li>
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
            <li class="active"><a href="CustRep.jsp">Home <span class="sr-only">(current)</span></a></li>
            <li onclick="recordDate();"><a href="#">Record a Date</a></li>
            <li><a onclick="showAEDEmp();" href="#" >Add, Edit, Delete Customer </a></li>
            <li onclick="showCustRevByDate();"><a href="#">Produce Customer Mailing Lists</a></li>
            
            
          </ul>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header" id="title">Your Dashboard</h1>
          
          <div class="playArea">
              <div id="activeUser" class="hidden">
                  <button type="button" onclick="showActiveCustLikes();" class="btn btn-default" >Based on # of Likes</button>
                  <button type="button" onclick="showActiveCustDates();" class="btn btn-default" >Based on # of Dates</button>
              </div>
              
                    
       <div id="salesReport" class="hidden">
        <div id="salesReportA">
         <form action="suggestedByReport.jsp">
            <form  role="form" method="POST" action="processAddEmp.jsp" id="form1">
            <div class="form-group form-group-sm col-sm-6 col-md-offset-3">
                <label for="ProfileID">Enter A Profile ID</label>
                <input type="text" class="form-control input-sm" name="ProfileID" id="ProfileID" placeholder="Profile ID">
            </div>
            <button type="submit" class="btn btn-default col-sm-2 col-md-offset-5">Submit</button>
        </form>
              </form>
              </div>
              <div id="salesReportB">
                  
              </div>
            </div>  <!-- End of get sales report-->
        
        <div id="recordDate" class="hidden">
        <div id="recordDateA">
         <form action="processDateRecord.jsp" method="post">
            <div class="form-group form-group-sm col-sm-6 col-md-offset-3">
                <label >Profile1</label>
                <input type="text" class="form-control input-sm" name="Profile1"  placeholder="Profile1">
            </div>
            <div class="form-group form-group-sm col-sm-6 col-md-offset-3">
                <label>Profile2 </label>
                <input type="text" class="form-control" name="Profile2"  placeholder="Profile2">
            </div>
            <div class="form-group form-group-sm col-sm-6 col-md-offset-3">
                <label>Customer Representative Name</label>
                <input type="text" class="form-control" name="CustRep" placeholder="Customer Representative">
            </div>
            <div class="form-group form-group-sm col-sm-6 col-md-offset-3">
                <label>Date Time</label>
                <input type="text" class="form-control" name="DateTime" placeholder="Date Iime">
            </div>
            <div class="form-group form-group-sm col-sm-6 col-md-offset-3">
                <label>Location</label>
                <input type="text" class="form-control" name="Location" placeholder="Location">
            </div>
            <div class="form-group form-group-sm col-sm-6 col-md-offset-3">
                <label>BookingFee</label>
                <input type="text" class="form-control" name="BookingFee"  placeholder="BookingFee">
            </div>
            <div class="form-group form-group-sm col-sm-6 col-md-offset-3">
                <label>Comments</label>
                <input type="text" class="form-control" name="Comments" placeholder="Comments">
            </div>
            <div class="form-group form-group-sm col-sm-6 col-md-offset-3">
                <label>User1 Rating</label>
                <input type="text" class="form-control" name="User1Rating" placeholder="User1 Rating">
            </div>
            <div class="form-group form-group-sm col-sm-6 col-md-offset-3">
                <label>User2 Rating</label>
                <input type="text" class="form-control" name="User2Rating" placeholder="User2 Rating">
            </div>
            <button type="submit" class="btn btn-default col-sm-2 col-md-offset-5">Submit</button>
        </form>
              </div>
          
            </div>  <!-- End of record a date-->
            
            <div id="aedEmp" class="hidden">
                <a  class="btn btn-default" href="AddCustomer.jsp">Add Customer</a>
                <a  class="btn btn-default" href="EditCustomer.jsp">Edit Customer</a>
                <a  class="btn btn-default" href="DeletCustomer.jsp">Delete Customer</a>
            </div>
          </div>
          
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
            $('.nav.nav-sidebar li a').click(function(){
                hideTable();
            });
        });
      
       
       
        
        function showActiveCust(){
            hideTable();
            hideSalesReport();
            hideAEDEmp();
            hideRecordDate()
            $("#activeUser").removeClass("hidden");
            $("#title").html("Most Active Customers");
        }
        function hideActiveCust(){
            $("#title").html("");
            $("#activeUser").addClass("hidden");
        }
        
        function showAEDEmp(){
            hideTable();
            hideRecordDate()
            hideActiveCust();
            hideSalesReport();
            $("#title").html("Add Edit Delete Customer");
            $("#aedEmp").removeClass('hidden');
        }
        function hideAEDEmp(){
            $("#title").html("");
            $("#aedEmp").addClass('hidden');
        }
          function hideRecordDate(){
            $("#title").html("");
            $("#recordDate").addClass('hidden');
        }
        function recordDate(){
            hideTable();
            hideActiveCust();
            hideAEDEmp();
            hideSalesReport();
            $("#title").html("Record a Date");
            $("#recordDate").removeClass('hidden');
        }
        function hideSalesReport(){
            $("#title").html("");
            $("#salesReport").addClass('hidden');
        }
        
       
        function showCustRevByDate(){
            showTable();
            hideAEDEmp();
            hideRecordDate()
            hideActiveCust();
            hideSalesReport();
            $("#mainTable thead").html("");
            $("#mainTable tbody").html("");
            <%
            String getCustRevDateQuery = "SELECT P.FirstName, P.LastName, P.Street, P.City, P.State, P.Zipcode"
                    + " FROM Person P, User U"
                    + " WHERE P.SSN=U.SSN";
                java.sql.ResultSet custRevDateRs = DBConnection.ExecQuery(getCustRevDateQuery);
                String [] custRevDateColName = {"First Name","Last Name", "Street", "City", "State","Zip Code"};
            %>
            $(".sub-header").html("Customer Mailing List");
            $("#mainTable thead").append("<tr>");
            <% for(String tmp: custRevDateColName){ %>
               $("#mainTable thead").append("<th>" + "<%= tmp %>" + "</th>");
            <% } %>
                $("#mainTable thead").append("</tr>");
            <% while(custRevDateRs.next()){ %>    
                $("#mainTable tbody").append("<tr><td>" + "<%= custRevDateRs.getString("FirstName") %>" + "</td><td>"
                        +"<%= custRevDateRs.getString("LastName") %>"+"</td><td>"
                        +"<%= custRevDateRs.getString("Street") %>"+"</td><td>"
                        +"<%= custRevDateRs.getString("City") %>"+"</td><td>"
                        +"<%= custRevDateRs.getString("State") %>"+"</td><td>"
                        +"<%= custRevDateRs.getString("Zipcode") %>"+"</td></tr>");
            <% }%>   
        }
        
        function showEmp(){ 
            showTable();
            hideAEDEmp();
            hideActiveCust();
            hideSalesReport();
            <%
            String getEmpQuery = "SELECT * FROM Employee";
                java.sql.ResultSet empRs = DBConnection.ExecQuery(getEmpQuery);
                
                String getEmpColQuery = "SELECT `COLUMN_NAME` FROM `INFORMATION_SCHEMA`.`COLUMNS` "
                        + "WHERE `TABLE_SCHEMA`='The_Expendables' AND `TABLE_NAME`='Employee';";
                java.sql.ResultSet empColRs = DBConnection.ExecQuery(getEmpColQuery);
            %>
            $("#mainTable thead").html("");
            $("#mainTable tbody").html("");
            $(".sub-header").html("Employee Table");
            $("#mainTable thead").append("<tr>");
            <% while(empColRs.next()){ %>
               $("#mainTable thead").append("<th>" + "<%= empColRs.getString("COLUMN_NAME") %>" + "</th>");
            <% } %>
                $("#mainTable thead").append("</tr>");
            <% while(empRs.next()){ %>    
                $("#mainTable tbody").append("<tr><td>" + "<%= empRs.getString("SSN") %>" + "</td><td>"+"<%= empRs.getString("Role") %>"
            +"</td><td>" + "<%= empRs.getDate("StartDate") %>"+"</td><td>" + "<%= empRs.getInt("HourlyRate") %>" + "</td></tr>");
            <% }%>   
        }
        function showUser(){
            showTable();
            hideAEDEmp();
            hideActiveCust();
            hideSalesReport();
            $("thead").html("");
            $("tbody").html("");
            <%
             String getUserQuery = "SELECT * FROM User";
                java.sql.ResultSet userRs = DBConnection.ExecQuery(getUserQuery);
                
                String getUserColQuery = "SELECT `COLUMN_NAME` FROM `INFORMATION_SCHEMA`.`COLUMNS` "
                        + "WHERE `TABLE_SCHEMA`='The_Expendables' AND `TABLE_NAME`='User';";
                java.sql.ResultSet userColRs = DBConnection.ExecQuery(getUserColQuery);
            %>
            $(".sub-header").html("User Table");
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
            showTable();
            hideAEDEmp();
            hideActiveCust();
            hideSalesReport();
            $("thead").html("");
            $("tbody").html("");
            <%
            String getDateQuery = "SELECT * FROM Date";
                java.sql.ResultSet dateRs = DBConnection.ExecQuery(getDateQuery);
                
                String getDateColQuery = "SELECT `COLUMN_NAME` FROM `INFORMATION_SCHEMA`.`COLUMNS` "
                        + "WHERE `TABLE_SCHEMA`='The_Expendables' AND `TABLE_NAME`='Date';";
                java.sql.ResultSet dateColRs = DBConnection.ExecQuery(getDateColQuery);
            %>
            $(".sub-header").html("Dates Table");
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
        function hideTable(){
        $("#mainTable").hide();
        }
        function showTable(){
        $("#mainTable").show();
        }
        function submitDate(){
            
        }
        
        </script>
<!--    <script src="../../dist/js/bootstrap.min.js"></script>
    
    
    
  </body>
</html>
