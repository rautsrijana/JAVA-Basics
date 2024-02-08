<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<title>Signup page</title>
<style>
   body {
    background-color: #f0f2f5;
  }
  .signup-card {
    max-width: 800px; /* Adjusted for a side-by-side layout */
    margin: 50px auto;
    padding: 20px;
    border-radius: 10px;
    background: #fff;
    display: flex;
    flex-wrap: wrap; /* Wrap on smaller screens */
  }
  .image-section {
    flex: 1; /* Adjust the size as needed */
    max-width: 40%; /* Adjust the size as needed */
  }
  .form-section {
    flex: 1; /* Adjust the size as needed */
    max-width: 60%; /* Adjust the size as needed */
    padding-left: 20px; /* Added padding for spacing */
  }
  .signup-image {
    max-width: 100%;
    height: auto;
    border-radius: 10px; /* Optional: if you want rounded corners */
  }
  .form-group {
    margin-bottom: 15px;
  }
  .form-control {
    border-radius: 20px;
  }
  .form-control:focus {
    border-color: #007bff;
    box-shadow: none;
  }
  .btn-secondary {
    border-radius: 20px;
    border: none;
    background-color: #007bff;
  }
  .btn-danger {
    border-radius: 20px;
    margin-left: 10px;
  }
  .form-header {
    font-size: 24px;
    margin-bottom: 20px;
  }
  .terms {
    margin-top: 20px;
  }
  .member-link {
    display: block;
    text-align: center;
    margin-top: 15px;
  }
  /* Responsive adjustments */
  @media (max-width: 768px) {
    .image-section,
    .form-section {
      max-width: 100%;
    }
    .form-section {
      padding-left: 0;
    }
  }
</style>
</head>
<body>

<div class="signup-card">
  <div class="image-section">
    <img src="images/signin-image.jpg" alt="Signup" class="signup-image">
  </div>
  <div class="form-section">
    <div class="form-header">
      Update Registration
    </div>
    <form action="update" method="post">
    <input type="hidden" name="id" value="${user.id}">
   
      <div class="form-group">
        <label for="username">Your Name</label>
        <input type="text" name="username" id="username" class="form-control" value="${user.username}">
      </div>
      
      <div class="form-group">
        <label for="password">Password</label>
        <input type="password" name="password" id="password" class="form-control">
      </div>
      
      <div class="form-group">
        <label for="email">Your Email</label>
        <input type="email" name="email" id="email" class="form-control" value="${user.email}">
      </div>
      
      <div class="form-group">
        <div class="custom-control custom-radio custom-control-inline">
          <input type="radio" id="genderMale" name="gender" class="custom-control-input" value="Male" ${user.gender == 'Male' ? 'checked' : ''}>
          <label class="custom-control-label" for="genderMale">Male</label>
        </div>
        <div class="custom-control custom-radio custom-control-inline">
          <input type="radio" id="genderFemale" name="gender" class="custom-control-input" value="Female" ${user.gender == 'Female' ? 'checked' : ''}>
          <label class="custom-control-label" for="genderFemale">Female</label>
        </div>
      </div>
      
      <div class="terms">
        <input type="checkbox" id="terms" name="terms">
        <label for="terms">I agree to the Terms of Service</label>
      </div>
      <button type="submit" class="btn btn-secondary" value="update">Signup</button>
      <a href="#" class="member-link">I am already a member</a>
    </form>
  </div>
</div>

</body>
</html>