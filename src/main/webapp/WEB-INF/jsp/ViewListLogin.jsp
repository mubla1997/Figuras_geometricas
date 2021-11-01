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

      <form action="${pageContext.request.contextPath}/priv/viewAllFigures" method="get">
            <input type="submit" value="View all figures" />
      </form>

   <c:forEach var = "figure" items="${listFigures}">

       <p> Name: ${figure.name}</p>
       <p> Type: ${figure.typeFigure}</p>
       <p> Creation Date: ${figure.date} </p>

       <td><a href="viewFigure?name=${figure.name}&user_own=${figure.username_own}">View</a></td>

       <form action="${pageContext.request.contextPath}/priv/list" method="post">
       <input type="hidden" name= "nom" value= "${figure.name}" />
       <button type= "submit"> Eliminate </button>
       </form>
   </c:forEach>
</body>
</html>