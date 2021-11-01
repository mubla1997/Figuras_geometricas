
function createCercle(coordenadaX,coordenadaY,size,color){
    					var x = coordenadaX;
    					var y = coordenadaY;
    					var r = size / 2;
    					var aPartida = 0;
                        var aFinal = 2 * Math.PI;

                        ctx.beginPath();
                        ctx.moveTo(x, y);
    					ctx.arc(x,y,r,aPartida, aFinal);
    					ctx.closePath();
    					ctx.fillStyle = color;
                        ctx.fill();
    					ctx.restore();
        }


    function createSquare(coordenadaX,coordenadaY,size,color){
                    var x = coordenadaX;
                    var y = coordenadaY;
                    var base = size;
                    var alture = size;

                    ctx.beginPath();
                    ctx.moveTo(x, y);
                    ctx.rect(x,y,base,alture);
                    ctx.closePath();
                    ctx.fillStyle = color;
                    ctx.fill();
                    ctx.restore();
    }

    function createTriangle(coordenadaX,coordenadaY,size,color){
             var x = coordenadaX;
             var y = coordenadaY;
             var z = size;

            ctx.beginPath();
            ctx.lineTo(x - z , y + z);
            ctx.lineTo(x + z, y + z);
            ctx.lineTo(x , y - z);
            ctx.moveTo(x - z , y + z);

            ctx.closePath();
            ctx.fillStyle = color;
            ctx.fill();
            ctx.restore();
    }

    function createPentagon(coordenadaX,coordenadaY,size,color){
             var x = coordenadaX;
             var y = coordenadaY;
             var size = size;
             var sides = 5;
             var penta = 2 * Math.PI / sides; /* Valor precalculado del la funcion pentagono */
             var fix = (Math.PI / 180.0) * -18; /* Fijamos el pentagono */

             ctx.beginPath();

            for (var i = 1; i <= sides;i += 1) {
            var cursor = i * penta + fix;
              ctx.lineTo (x + size * Math.cos(cursor), y + size * Math.sin(cursor));
            }
            ctx.closePath();
            ctx.fillStyle = color;
            ctx.fill();
            ctx.restore();
    }

    function createStar(coordenadaX,coordenadaY,size,color) {
            /*
                 Ctx --> objeto de dibujo de contenido.
                 n --> número de vértices de estrella.
                 r --> radio interior.
                 R --> Radio exterior.
                 x --> punto central de la estrella x coordenada.
                 y --> Coordenada y tienda del centro estrella.
            */
                var x = coordenadaX;
                var y = coordenadaY;
                var R = size;
                var r = size/2;
                var n = 7;

                ctx.save();
                ctx.beginPath();
                ctx.translate(x,y);

                for(var i=0;i<n;i++){

                    ctx.lineTo(Math.cos(((1/4 + i)*2*Math.PI/n))*R,-Math.sin(((1/4 + i)*2*Math.PI/n))*R);

                    ctx.lineTo(Math.cos(((3/4 + i)*2*Math.PI/n))*r,-Math.sin(((3/4 + i)*2*Math.PI/n))*r);

                }
            ctx.fillStyle = color;

            ctx.closePath();

            ctx.fill();

            ctx.restore();
             }

function chooseFigure(type,coordenadaX,coordenadaY,size,color){
switch(type) {
 case "Cercle":
     createCercle(coordenadaX,coordenadaY,size,color);
     break;
 case "Square" :
     createSquare(coordenadaX,coordenadaY,size,color);
     break;
 case "Triangle" :
     createTriangle(coordenadaX,coordenadaY,size,color);
     break;
 case "Pentagon" :
     createPentagon(coordenadaX,coordenadaY,size,color);
     break;
 case "Star" :
     createStar(coordenadaX,coordenadaY,size,color);
     break;
 }
}