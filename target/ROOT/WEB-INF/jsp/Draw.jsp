<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <meta charset="utf-8">

    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>preview</title>

    <link rel="stylesheet" href="">
</head>
<body>
<h1>Preview figure</h1>
<form action="${pageContext.request.contextPath}/priv/list" method="get" >
    <input type="submit" value="Save" />

</form>

<form action="${pageContext.request.contextPath}/logout" method="post">
    <input type="submit" value="Logout" />
</form>
    <p> Name: ${name} </p>
    <p> Type: ${tipo} </p>

<canvas id="myCanvas" width="1024" height="768"> </canvas>

    <script>
    let c = document.getElementById("myCanvas");
    let ctx = c.getContext("2d");

    const type = "${tipo}";
    let coordX = "${coordenadaX}";
    let coordY = "${coordenadaY}";
    let size = "${size}";
    let color = "${color}";

    chooseFigure(type,coordX,coordY,size,color);


    <%@include file= "../js/printFigure.js" %>

</script>

</body>
</html>