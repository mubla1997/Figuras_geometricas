<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Create User</title>
</head>
<body>
<h1> Creacion de usuario </h1>

<c:if test="${not empty 'message'}">
<div> ${message}</div>
</c:if>

<form action="/register" method="post">
<table>
<tr>
    <td>Name: </td> <td> <input type="text" name="username"> </td>
</tr>
<tr>
    <td> password: </td><td> <input type="password" name="password"> </td>
</tr>
<tr>
    <td> Repit password: </td><td> <input type="password" name="repPass"> </td>
</tr>
</table>
<button type="submit">Register</button>
</form>

<form action="${pageContext.request.contextPath}/login" method="get">
    <input type="submit" value="Go back" />
</form>
</body>
</html>