<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="publishedjob">
<table>
<tr>
<td>${records.organisationname}</td>
<td>${records.jobdescription}</td>
<td>${records.expectedexpirience}</td>
<td>${records.skills}</td>
<td>${records.salary}</td>
</table>
</form>
</body>
</html>