<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script type="text/javaScript">
function disableBackButton() {
	window.history.forward();
}
setTimeout("disableBackButton()", 0);
</script>
<title>Insert title here</title>
</head>
<body>
	<a href="fundstransfer">NEFT</a>
	<a href="fundstransfer">RTGS</a>
	<a href="fundstransfer">IMPS</a>
	<br>
	<a href="loggingout">LogOut</a>
	<br>

<!-- onclick="disableBackButton()" -->


</body>
</html>