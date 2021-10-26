<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<title>Indice</title>
</head>
<body>
<h1> Indice </h1>
<h2> Creacion de figuras geometricas <h2>

<form action="/indice" method="post">
<table>

<tr>
    <td> Name: </td><td> <input type="text" name="nombre"> </td>
</tr>

<tr>
    <td>
        Figure:
        <td>
            <select name = "opcionFigura">
                <option value= "Cercle"> Cercle </option>
                <option value= "Square"> Square </option>
                <option> Triangle  </option>
                <option> Pentagon </option>
                <option> Star </option>
            </select>
        </td>
    </td>
</tr>

<tr>
    <td>
        Color:
        <td>
            <select name = "opcionColor">
                    <option> black </option>
                    <option> green </option>
                    <option> red  </option>
                    <option> blue </option>
                    <option> yellow </option>
                    <option> grey </option>
            </select>
        </td>
    </td>
</tr>

</tr>
    <td> Size: </td><td> <input type="number" name="tamany"> </td>
</tr>

<tr>
    <td>Coordenate: </td> <td> <input type="number" name="coordenadaX"> </td> <td> <input type="number" name="coordenadaY"> </td>
</tr>

</table>
<button type="submit">Crear</button>
</form>
<form action="${pageContext.request.contextPath}/logout" method="post">
    <input type="Logout" value="Logout" />
</form>
</body>
</html>