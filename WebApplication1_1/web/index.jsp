<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="misEstilos.css">
    </head>
    <body>
        <%@page import="controller.registro" %>
        <div id="contenedora">
            <h1>Tus datos</<h1>
    <form action="registro" method="post">
    <table class="misTabla" >     
            <tr>
                <td>Nombre</td> <td><input type="text" name="nombre"> <td/> 
            </tr>
            <tr>
                <td>Apellido</td>
                <td><input type="text" name="apellido"> </td>
            </tr>
            <tr>
                <td>Promedio</td>
                <td><input type="text" name="promedio"> <td/> 
            </tr>
            <tr>
                <td>Legajo</td>
                <td><input type="text" name="legajo"> <td/> 
            </tr>
        </table>
            <button type="reset"> Borrar</button>
            <button type="submit"> Enviar</button> 
             
    </form>
        </div>
    </body>
</html>