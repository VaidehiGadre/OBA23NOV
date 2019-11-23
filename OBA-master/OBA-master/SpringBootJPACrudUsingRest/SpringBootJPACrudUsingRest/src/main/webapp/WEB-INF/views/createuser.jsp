<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<style>
body {font-family: Arial, Helvetica, sans-serif;
background:url(https://www.davesworld.com/wp-content/uploads/2015/10/Heat-Pump-Rebates.jpg);
}
* {box-sizing: border-box}
input[type=text], input[type=password] {
 width: 50%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

/* Add a background color when the inputs get focus */
input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Set a style for all buttons */
button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 400%;
  opacity: 0.9;
}

button:hover {
  opacity:1;
}


/* Float signup buttons and add an equal width */
.signupbtn {
  float: left;
  width: 50%;
}

/* Add padding to container elements */
.container {
  padding: 10px;
}
button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
  
}

button:hover {
  opacity:1;
}


/* Float signup buttons and add an equal width */
.signupbtn {
  float: left;
  width: 50%;
}

/* Add padding to container elements */
.container {
  padding-left: 400px;
  
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
  .cancelbtn, .signupbtn {
     width: 100%;
  }
</style>
</head>

<body>

	<script>
		function checkpassword() {
			var p = f.password.value;
			var cp = f.password2.value;
			if (p != cp)
				alert("Password and Confirm Passwords Mismatch");
		}

		function checktranspassword() {
			var tp = f.trans_pass.value;
			var tcp = f.trans_pass2.value;
			if (tp != tcp)
				alert("Transaction Password and Transaction Confirm Passwords Mismatch");
		}
	</script>

		<form name ="f" method="get" action="createprocess">

<div class="container">
<h1>Sign Up</h1>
      <p>Please fill in this form to create an account.</p>
      
<p>
			 <label for="text"><b>Account Number:</b></label><br>
			 <input type="text" placeholder="Enter all digits" name="acc_no_fk" required>
		 			
		 </p>
		 
			<p>
			 <label for="text"><b>User Id:</b></label><br>
		 	 <input type="text" placeholder="Enter User ID" name="user_id" required>
		 
					<h6>${error}</h6>
			 </p>			
			<p>
			 <label for="password"><b>Password:</b></label><br>
		 	 <input type="password" name="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" 
		 	 		title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters"required>
			 </p>
			<p>
			<label for="psw-repeat"><b>Confirm Password</b></label><br>
    		<input type="password" name="password2"  required /> 
			 </p>
			
			<p>
			
			<label for="password"><b>Transaction Password:</b></label><br>
			<input type="password" name="trans_pass" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" 
			       title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required />
			 </p>
			<p>
			<label for="trans-repeat"><b>Confirm Transaction Password</b></label><br>
    		<input type="password" name="trans_pass2"  required />
		
		 </p>
			

<!-- 	<input type="submit" value="Register for internet banking" onclick="checkpassword();checktranspassword()"/> -->
      <button type="submit" class="signupbtn" value= "Register for internet banking" onclick="checkpassword();checktranspassword()">Register</button>
    </div>

	</form>


</body>
</html>







