<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<html>
<head>
<title>Create your figure</title>
<style> <%@include file="/WEB-INF/css/createFigure.css"%> </style>
</head>
<body>

<c:if test="${not empty 'message'}">
<h4><div> ${message}</div></h4>
</c:if>

<div id="form">
            <div class="container">
                <div id="form-row" class="row justify-content-center align-items-center">
                    <div id="form-column" class="col-md-6">
                        <div id="form-box" class="col-md-12">
                            <form id="form-form" class="form" action="" method="post">
                                <h3 class="text-center text-info">Create figure</h3>
                                <div class="form-group">
                                    <label for="name" class="text-info">Name:</label><br>
                                    <input type="text" name="nombre" id="name" class="form-control" placeholder="name">
                                </div>
                                <div class="form-group">
                                    <label for="type" class="text-info">Type:</label><br>
                                    <select name = "opcionFigura" class="custom-select">
                                        <option selected>Choose...</option>
                                        <option value= "Cercle"> Cercle </option>
                                        <option value= "Square"> Square </option>
                                        <option value="Triangle"> Triangle  </option>
                                        <option value= "Pentagon"> Pentagon </option>
                                        <option value="Star"> Star </option>
                                    </select>
                                </div>

                                <div class="form-group">
                                <label for="color" class="text-info">Color:</label><br>
                                    <select name = "opcionColor" class="custom-select">
                                        <option selected>Choose...</option>
                                        <option> black </option>
                                        <option> green </option>
                                        <option> red  </option>
                                        <option> blue </option>
                                        <option> yellow </option>
                                        <option> grey </option>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label for="size" class="text-info">Size:</label><br>
                                    <input type="number" name="tamany" class="form-control"placeholder="size">
                                </div>
                                <div class="form-group">
                                    <label for="coordX" class="text-info">Coordenate:</label>
                                   <input type="number" name="coordenadaX" class="form-control" placeholder="CoordenateX">
                                   <br><input type="number" name="coordenadaY" class="form-control" placeholder="CoordenateY">
                                </div>
                                <div >
                                    <input type="submit" name="submit" class="btn btn-info btn-md" value="Preview">
                                </div>
                                   <br><a href="${pageContext.request.contextPath}/priv/list" class="btn btn-info btn-md"> View list </a>
                                    <a href="${pageContext.request.contextPath}/logout" class="text-info"> logout</a>

                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>