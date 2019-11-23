<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<title>Login</title>
<meta name="viewport">

<style>
@import
	"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css"
	;

body {
	margin: 0;
	padding: 0;
	font-family: sans-serif;
	background:
		url(https://www.davesworld.com/wp-content/uploads/2015/10/Heat-Pump-Rebates.jpg)
		no-repeat;
	background-size: cover;
}

.login-box {
	width: 280px;
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
	color: white;
}

.login-box h1 {
	float: left;
	font-size: 40px;
	border-bottom: 6px solid #4caf50;
	margin-bottom: 50px;
	padding: 13px 0;
}

.textbox {
	width: 100%;
	overflow: hidden;
	font-size: 20px;
	padding: 8px 0;
	margin: 8px 0;
	border-bottom: 1px solid #4caf50;
}

.textbox i {
	width: 26px;
	float: left;
	text-align: center;
}

.textbox input {
	border: none;
	outline: none;
	backround: none;
	color: black;
	font-size: 18px;
	width: 80%;
	float: left;
	margin: 0 10px;
}

.btn {
	width: 100%;
	background: none;
	border: 2px solid #4caf50;
	color: white;
	padding: 5px;
	font-size: 18px;
	cursor: pointer;
}
</style>

<body>

	<form method="get" action="loginprocess">
		<div class="login-box">
			<h1>Login</h1>
			<div class="textbox">
				<i class="fa fa-user" aria-hidden="true"></i> <input type="text"
					placeholder="User Id" name="user_id" title="Please fill this field"
					required>
			</div>
			<h6>${error}</h6>
			<div class="textbox">
				<i class="fa fa-lock" aria-hidden="true"></i> <input type="password"
					placeholder="Password" name="password"
					title="Please fill this field" required>
			</div>
			<input class="btn" type="submit" value="login to dashboard" />
			<!-- <input class="btn" type="button" name="" value="Sign in"> -->

		</div>
	</form>
		<%-- 			<span>User id</span>
			<input type="text" name="user_id" required />
			<span> Password<span>
			<input type="password" name="password" required />
			${error}
	</div>


	<input type="submit" value="login to dashboard" />

	</form>

	</div> --%>
</body>
</html>