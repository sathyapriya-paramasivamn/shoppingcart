<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
<link ref="text/stylesheet">
/* Full-width input fields */
input[type=text], input[type=password] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

/* Set a style for all buttons */
button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
}

/* Extra styles for the cancel button */
.cancelbtn {
    padding: 14px 20px;
    background-color: #f44336;
}

/* Float cancel and signup buttons and add an equal width */
.cancelbtn,.signupbtn {
    float: left;
    width: 50%;
}

/* Add padding to container elements */
.container {
    padding: 16px;
}

/* Clear floats */
.clearfix::after {
    content: "";
    clear: both;
    display: table;
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 100px) {
    .cancelbtn, .signupbtn {
       width: 100%;
    }
}
</style>
</head>
<body>
<form action="addUser" method="post" style="border:1px solid #ccc">
  <div class="container">
<label><b>name</b></label>
    <input type="text" placeholder="Enter name" name="username" required>
    <br>
<label><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="mailid" required><br>
<label><b>mobileno</b></label>
    <input type="text" placeholder="Enter mobileno" name="mobileno" required>
<br>
<label><b>address</b></label>
    <input type="text" placeholder="Enter address" name="address" required>


<br>
    <label><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>
<br>
    
   
    <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>

    <div class="clearfix">
      <button type="button" class="cancelbtn">Cancel</button>
      <button type="submit" class="signupbtn" value="new user">Sign Up</button>
    </div>
  </div>
</form>
</body>
</html>