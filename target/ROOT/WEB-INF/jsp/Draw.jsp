<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<html>
<head>
    <meta charset="utf-8">

    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>preview</title>

    <style> <%@include file="/WEB-INF/css/index.css"%> </style>
</head>
<body>
    <h1 class="text-info"> Preview figure</h1>
<form action="${pageContext.request.contextPath}/priv/list" method="get" >
    <input type="submit" class="btn btn-info btn-md" value="Save" />
</form>
    <a href="${pageContext.request.contextPath}/logout" class="text-info"> logout</a>

    <br><h4> Name: ${name} </h4>
    <h4> Type: ${tipo} </h4>

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