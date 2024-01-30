<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.servlet.SignupDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<title>Search Page</title>
<style>
    body {
        padding-top: 20px;
        background-color: #f8f9fa;
    }
    
    .image-container{
    	display: flex;
        justify-content: center; /* Aligns horizontally to center */
        align-items: center; /* Aligns vertically to center */
        
    }
    .search-form {
        width: 100%;
        max-width: 400px;
        margin: auto;
        padding: 15px;
        background-color: white;
        border-radius: 8px;
        box-shadow: 0 4px 8px rgba(0,0,0,.05);
    }
    .search-label {
        font-weight: bold;
    }
    .header-image {
        width: 100%;
        max-height: 150px;
        object-fit: cover;
        object-position: center;
    }
</style>
</head>

<body>
<div class="image-container">
<img src="https://www.apple.com/newsroom/images/partnerships/Apple-Google-partner-industry-specification-hero_inline.jpg.large.jpg"/ style="height:220px;">
</div>

<div class="search-form">
    <form action="searchdata" method="get" class="form-group">
        <label class="search-label">Apple & Google Search Engine</label>
        <input type="text" name="searchText" class="form-control">
        <button type="submit" class="btn btn-primary mt-2">Submit</button>
    </form>
</div>

 <%
List<SignupDto> signuplist =(List<SignupDto>)request.getAttribute("searchResults");
if(signuplist==null){
  signuplist=new ArrayList();
}
if(signuplist.size()>0){
%>



<div class="table-responsive">
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
for(SignupDto sss:signuplist){
%>
<tr>
 	<td><%=sss.getUsername()%></td>
       <td><%=sss.getPassword()%></td>
       <td><%=sss.getEmail()%></td>
       <td><%=sss.getGender()%></td>
      </tr>
  
      <%

}
      %>            
      		</tbody>
        </table>
        <%
        }
        %>
    </div>
    





</body>
</html>
