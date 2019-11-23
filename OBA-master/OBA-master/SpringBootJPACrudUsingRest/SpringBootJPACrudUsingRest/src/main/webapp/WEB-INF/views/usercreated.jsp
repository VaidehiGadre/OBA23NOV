<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.ResultSetMetaData"%>
<%@ page import="java.sql.Statement"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>
	<%-- <table>
			
skipping the table header; follow similar method to implement it 			
			<c:forEach var = "row" items = "${tableData}">
				<tr>
					<c:forEach var = "cell" items = "${row}">
						<td> <c:out value = "${cell}"/> </td>
					</c:forEach>
				</tr>
			</c:forEach>
		</table>
		 --%>

	<%-- <table width="59%" border="1">
		<%
			ResultSet r;
			int counter = 1;
			String q = "select * from category_master;";
			r = o.getdata(q);
			ResultSetMetaData metaData = r.getMetaData();
			while (r.next()) {
		%>
		<tr>
			<%
				for (int i = 1; i <= metaData.getColumnCount(); i++) {
			%>
			<td><%=r.getString(i)%></td>
			<%
				}
			%>
		</tr>
		<%
			}
		%>
	</table> --%>




<%-- <sql:query var="listUsers" dataSource = "${oracleDataSource()}">
    SELECT * FROM login_details;
</sql:query>
	<div align="center">
		<table border="1" cellpadding="5">
			<caption>
				<h2>List of users</h2>
			</caption>
			<tr>
				<th>USER_ID</th>
				<th>PASSWORD</th>
				<th>ACC_NO_FK</th>
				<th>TRANS_PASS</th>
			</tr>
			<c:forEach var="user" items="${listUsers.rows}">
				<tr>
					<td><c:out value="${user.user_id}" /></td>
					<td><c:out value="${user.password}" /></td>
					<td><c:out value="${user.acc_no_fk}" /></td>
					<td><c:out value="${user.trans_pass}" /></td>
				</tr>
			</c:forEach>
		</table>
	</div> --%>

	<h1>User Created</h1>
	<h3>acc no is ${acc_no_fk}</h3>
	<h3>user id is ${user_id}</h3>
</body>
</html>