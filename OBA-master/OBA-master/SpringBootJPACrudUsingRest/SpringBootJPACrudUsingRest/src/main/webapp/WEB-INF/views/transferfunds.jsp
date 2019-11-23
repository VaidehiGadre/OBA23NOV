<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<script type="text/javaScript">
</script>
</head>
<body>
Hello  ${user_id}
	<div style="margin: 50px">
		<h1>Update Name using Id</h1>

		<form method="get" action="fundstransferprocess">


			<span> From Account </span>
			<input type="text" name="sender_acc_no" required />
			<span> To Account </span> 
			<input type="text" name="receiver_acc_no" required /> 
			<span> Amount </span> 
			<input type="number" name="amount" required /> 
			<!-- <span> Transaction Date </span> 
			<input type="date" name="date_of_transfer" required /> -->
	</div>
	<input type="submit" value="transfer" />

	</form>

	</div>

</body>
</html>