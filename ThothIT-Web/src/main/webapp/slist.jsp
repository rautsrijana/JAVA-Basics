<!DOCTYPE html>
<%@page import="java.util.ArrayList"%>
 <%@page import="com.servlet.SignupDto"%>
<%@page import="java.util.List"%>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<title>Web page</title>
</head>
<body>
<header style="background-color: maroon; height:20px;">
</header>
<h1 style="background-color: aqua;">Displaying data</h1>
<marquee direction="left">
<img src="https://www.lingayasvidyapeeth.edu.in/sanmax/wp-content/uploads/2023/07/studentlife.webp"/ style="height:240px;">
<img src="images/students.jpg"/ style="height:240px;">
</marquee>
<h1 style="color:red;">${message }</h1>
<h2>${email }</h2>

<hr>
<table class="table table-striped">
    <thead>
      <tr>
      <th>id</th>
        <th>Username</th>
        <th>Password</th>
        <th>Email</th>
         <th>Gender</th>
         <th>Action</th>
      </tr>
    </thead>
    <tbody>
    <%  
    
   List<SignupDto> signuplist= (List<SignupDto>)request.getAttribute("sdata");
    if(signuplist==null){
    	  signuplist=new ArrayList<>();
      }
    for(SignupDto ss:signuplist){
    	
    
    %>
    
    <tr>
    <td><%=ss.getId() %></td>
    <td><%=ss.getUsername() %></td>
     <td><%=ss.getPassword() %></td>
      <td><%=ss.getEmail() %></td>
       <td><%=ss.getGender() %></td>
       
       </tr>
       <%
       
       }%>
    </tbody>
  </table>

<br>
</body>
</html>