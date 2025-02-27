<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form:form method="post" modelAttribute="emp">
<table>


<tr>
<th>Employee Id</th>
<td> <form:input path="empid"/></td>
</tr>

<tr>
<th>Employee Name</th>
<td> <form:input path="empName"/></td>
</tr>

<tr>
<th>Employee salary</th>
<td> <form:input path="empsalary"/></td>
</tr>

<tr>
<td><input type="submit" value="Register"></td>
</tr>
</table>
</form:form>

</body>
</html>