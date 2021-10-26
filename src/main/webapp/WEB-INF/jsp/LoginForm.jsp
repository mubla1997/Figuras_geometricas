<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<head>
<title>Login</title>
</head>
<body>
<h1> Login de usuario </h1>

<c:if test="${not empty 'message'}">
<div> ${message}</div>
</c:if>

<form action="/login" method="post">
<table>
<tr>
    <td>Name: </td> <td> <input type="text" name="username"> </td>
</tr>
<tr>
    <td> password: </td><td> <input type="password" name="password"> </td>
</tr>
</table>
<button type="submit">Login</button>
</form>

</body>
</html>