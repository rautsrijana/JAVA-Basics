<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<title>My First Web page</title>
</head>
<body>
	<header style="background-color: maroon; height:20px;">
	</header>
	<h1 style="background-color: aqua;">Displaying Data</h1>
	<marquee direction="left">
	<img src="https://www.daysoftheyear.com/wp-content/uploads/world-student-day1.jpg" /style="height:240px;">
	</marquee>
	
	  <table class="table table-striped">
	    <thead>
	      <tr>
	        <th>Username</th>
	        <th>Password</th>
	        <th>Email</th>
	        <th>Gender</th>
	      </tr>
	    </thead>
	    
	    <tbody>
	    <%
	    
	   	List<SignuptoDo> signuplist = (List<SignuptoDo>)request.getAttribute("sdata");
	    
	    for(SignuptoDo ss:signuplist){
	    	
	    }
	    
	    %>
	    
	    <tr>
	    <td><%=ss.getUsername() %></td>
	    <td><%=ss.getUsername() %></td>
	    <td><%=ss.getUsername() %></td>
	    <td><%=ss.getUsername() %></td>
	    </tr>
	    </tbody>
	  </table>

</body>
</html>