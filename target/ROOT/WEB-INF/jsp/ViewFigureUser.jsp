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

<form action="${pageContext.request.contextPath}/list" method="post">

    <input type="submit" value="Go Back" />
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

    switch("${figure}") {
    case "Cercle":
        createCercle(ctx);
        break;
    case "Square" :
        createSquare(ctx);
        break;
    case "Triangle" :
        createTriangle(ctx);
        break;
    case "Pentagon" :
        createPentagon(ctx);
        break;
    case "Star" :
        createStar(ctx);
        break;
    }

    function createCercle(ctx){
    		if (ctx) {
    					var x = ${coordenateX};
    					var y = ${coordenateY};
    					var r = ${size} / 2;
    					var aPartida = 0;
                        var aFinal = 2 * Math.PI;

                        ctx.beginPath();
                        ctx.moveTo(x, y);
    					ctx.arc(x,y,r,aPartida, aFinal);
    					ctx.closePath();
    					ctx.fillStyle = "${color}";
                        ctx.fill();
    					ctx.restore();

        }
    }

    function createSquare(ctx){
        if(ctx){
                    var x = ${coordenateX};
                    var y = ${coordenateY};
                    var base = ${size};
                    var alture = ${size};

                    ctx.beginPath();
                    ctx.moveTo(x, y);
                    ctx.rect(x,y,base,alture);
                    ctx.closePath();
                    ctx.fillStyle = "${color}";
                    ctx.fill();
                    ctx.restore();
        }
    }

    function createTriangle(ctx){
        if(ctx){
             var x = ${coordenateX};
             var y = ${coordenateY};
             var z = ${size};

            ctx.beginPath();
            ctx.lineTo(x - z , y + z);
            ctx.lineTo(x + z, y + z);
            ctx.lineTo(x , y - z);
            ctx.moveTo(x - z , y + z);

            ctx.closePath();
            ctx.fillStyle = "${color}";
            ctx.fill();
            ctx.restore();
        }
    }

    function createPentagon(ctx){
        if(ctx){
             var x = ${coordenateX};
             var y = ${coordenateY};
             var size = ${size};
             var sides = 5;
             var penta = 2 * Math.PI / sides; /* Valor precalculado del la funcion pentagono */
             var fix = (Math.PI / 180.0) * -18; /* Fijamos el pentagono */

             ctx.beginPath();

            for (var i = 1; i <= sides;i += 1) {
            var cursor = i * penta + fix;
              ctx.lineTo (x + size * Math.cos(cursor), y + size * Math.sin(cursor));
            }
            ctx.closePath();
            ctx.fillStyle = "${color}";
            ctx.fill();
            ctx.restore();
        }
    }

    function createStar(ctx) {
        if(ctx){
                /*
                             Ctx --> objeto de dibujo de contenido.
                             n --> número de vértices de estrella.
                             r --> radio interior.
                             R --> Radio exterior.
                             x --> punto central de la estrella x coordenada.
                             y --> Coordenada y tienda del centro estrella.
                */

                var x = ${coordenateX};
                var y = ${coordenateY};
                var R = ${size};
                var r = ${size}/2;
                var n = 7;

                ctx.save();
                ctx.beginPath();
                ctx.translate(x,y);

                for(var i=0;i<n;i++){

                    ctx.lineTo(Math.cos(((1/4 + i)*2*Math.PI/n))*R,-Math.sin(((1/4 + i)*2*Math.PI/n))*R);

                    ctx.lineTo(Math.cos(((3/4 + i)*2*Math.PI/n))*r,-Math.sin(((3/4 + i)*2*Math.PI/n))*r);

                }
            ctx.fillStyle = "${color}";

            ctx.closePath();

            ctx.fill();

            ctx.restore();
                }
             }
</script>

</body>
</html>