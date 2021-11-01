<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<html>
<head>
    <meta charset="utf-8">

    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>View Figure</title>

   <style> <%@include file="/WEB-INF/css/index.css"%> </style>
</head>
<body>
    <h1 class="text-info">View figure</h1>
<form action="${pageContext.request.contextPath}/priv/list" method="get" >
    <input type="submit" class="btn btn-info btn-md" value="Go list" />
</form>
<form action="${pageContext.request.contextPath}/priv/viewAllFigures" method="get" >
    <input type="submit" class="btn btn-info btn-md" value="Go all list" />
</form>

<a href="${pageContext.request.contextPath}/logout" class="text-info"> logout</a>

    <br><h4> Name: ${viewFigure.name} </h4>
    <h4> Type: ${viewFigure.typeFigure} </h4>

<canvas id="myCanvas" width="1024" height="768"> </canvas>

    <script>
        var c = document.getElementById("myCanvas");
        var ctx = c.getContext("2d");

        const tipo = "${viewFigure.typeFigure}";
        const coordX = "${viewFigure.coordenateX}";
        const coordY = "${viewFigure.coordenateY}";
        const size = "${viewFigure.size}";
        const color = "${viewFigure.color}";

       chooseFigure(tipo,coordX,coordY,size,color);

       <%@include file= "../js/printFigure.js" %>
    </script>

</body>
</html>