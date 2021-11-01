<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <meta charset="utf-8">

    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>View Figure</title>

    <link rel="stylesheet" href="">
</head>
<body>
    <h1>View figure</h1>
<form action="${pageContext.request.contextPath}/priv/list" method="post">
    <input type="submit" value="Go list" />
</form>
<form action="${pageContext.request.contextPath}/priv/viewAllFigures" method="post">
    <input type="submit" value="Go all list" />
</form>
<form action="${pageContext.request.contextPath}/logout" method="post">
    <input type="submit" value="Logout" />
</form>
    <p> Name: ${name} </p>
    <p> Type: ${figure} </p>

<canvas id="myCanvas" width="1024" height="768"> </canvas>

    <script>
        var c = document.getElementById("myCanvas");
        var ctx = c.getContext("2d");

        const name = "${viewFigure.name}";
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