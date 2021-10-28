<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<title>List</title>
</head>
<body>

    <c:if test="${not empty 'message'}">
    <div> ${message}</div>
    </c:if>

   <h1>Lista de figuras</h1>

   <c:forEach var = "figure" items="${list}">
       <p> Name: ${figure.name}</p>
       <p> Type: ${figure.typeFigure}</p>
       <form action="${pageContext.request.contextPath}/indice" method="post">
           <input type="submit" value="Visualizar" />
       </form>

   </c:forEach>
</body>
</html>