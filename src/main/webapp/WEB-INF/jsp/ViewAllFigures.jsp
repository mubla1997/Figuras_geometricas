<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<html>
<head>
<title>List all figure</title>
<style> <%@include file="/WEB-INF/css/index.css"%> </style>
</head>
<body>

    <c:if test="${not empty 'message'}">
    <div> ${message}</div>
    </c:if>

   <h1 class="text-info">List all figures</h1>

    <form action="${pageContext.request.contextPath}/priv/form" method="get">
        <input type="submit" class="btn btn-info btn-md" value="Create other figure" />
    </form>

     <form action="${pageContext.request.contextPath}/priv/list" method="get">
        <input type="submit" class="btn btn-info btn-md" value="Go back" />
     </form>

     <a href="${pageContext.request.contextPath}/logout" class="text-info"> logout</a>

    <div class="container">
   <c:forEach var = "figure" items="${listFigures}">
       <div class="card" style="width: 30rem;">
       <div class="card-body">
      <h5 class="card-title"> Name: ${figure.name} </h5>
       <p class="card-text"> Type: ${figure.typeFigure}</p>
       <p class="card-text"> Creation Date: ${figure.date} </p>

       <td><a href="viewFigure?name=${figure.name}&user_own=${figure.username_own}" class="btn btn-primary">View</a></td>

       <form action="${pageContext.request.contextPath}/priv/list" method="post">
       <input type="hidden" name= "nom" value= "${figure.name}" />
       <button type= "submit"> Eliminate </button>
       </form>
       </div>
   </c:forEach>
   /div>
</body>
</html>