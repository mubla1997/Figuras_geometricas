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

    <form action="${pageContext.request.contextPath}/logout" method="post">
        <input type="submit" value="Logout" />
    </form>
    <form action="${pageContext.request.contextPath}/priv/form" method="get">
        <input type="submit" value="Create other figure" />
    </form>

   <c:forEach var = "figure" items="${listFigures}">

       <p> Name: ${figure.name}</p>
       <p> Type: ${figure.typeFigure}</p>
       <p> Creation Date: ${figure.date} </p>



       </form>
   </c:forEach>
</body>
</html>