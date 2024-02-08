<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
  <title>Update Signup Page</title>
  <!-- Existing style content -->
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
    <form action="usignup" method="post"> <!-- Ensure action matches servlet URL pattern -->
      <input type="hidden" name="id" value="${user.id}"> <!-- Use EL to populate -->
      
      <div class="form-group">
        <label for="username">Your Name</label>
        <input type="text" name="username" id="username" class="form-control" value="${user.username}"> <!-- Use EL to populate -->
      </div>
      
      <!-- Password field intentionally left without value for security -->
      <div class="form-group">
        <label for="password">Password</label>
        <input type="password" name="password" id="password" class="form-control">
      </div>
      
      <div class="form-group">
        <label for="email">Your Email</label>
        <input type="email" name="email" id="email" class="form-control" value="${user.email}"> <!-- Use EL to populate -->
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
      
      <!-- Consider if you want to keep the terms checkbox for updates -->
      <div class="terms">
        <input type="checkbox" id="terms" name="terms">
        <label for="terms">I agree to the Terms of Service</label>
      </div>
      <button type="submit" class="btn btn-secondary">Update</button>
      <a href="#" class="member-link">I am already a member</a>
    </form>
  </div>
</div>

</body>
</html>
