<%-- 
    Document   : CustRep
    Created on : Nov 14, 2014, 3:25:36 PM
    Author     : Kevin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="css/dashboard.css" rel="stylesheet">
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
            <li class="active"><a href="Manager.jsp">Home <span class="sr-only">(current)</span></a></li>
            <li><a onclick="showAEDEmp();" href="#" >Add, Edit, Delete Employee </a></li>
            <li onclick="showSalesReport();"><a href="#">Sales Reports</a></li>
            <li onclick="showCustRevByDate();"><a href="#">Revenue from Dates by Customer</a></li>
            
          </ul>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header" id="title">Your Dashboard</h1>
          
          <div class="playArea">
          
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
        
        
        </script>
    </body>
</html>
