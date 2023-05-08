<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="menu.jsp" %>
	<div align="center">
		<form action="save-contact">
			Enter First Name : <input name="fname">
			<br><br>
			Enter Middle Name : <input name="mname">
			<br><br>
			Enter Last Name : <input name="lname">
			<br><br>
			Enter Email : <input name="email">
			<br><br>
			Enter Contact : <input name="contact">
			<br><br>
			Enter DOB : <input type="date" name="dob">
			<br><br>
			<button type="submit">Add Contact</button>
		</form>
	</div>	

</body>
</html>