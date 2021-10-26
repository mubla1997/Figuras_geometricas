<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<title>Logout</title>
</head>
<body>
<%
    response.sendRedirect("/login");
%>
</body>
</html>