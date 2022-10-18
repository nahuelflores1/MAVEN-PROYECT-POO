<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@page import="model.Alumno" %>
        <% Alumno al=(Alumno) request.getAttribute("atribAlumn"); %>
        <h1>Muestra datos Alumnos</h1>
        <h2>Aqui se despliegan los datos se grabaron en la BD</h2>
        <p>Tus Datos son los siguiente:</p>
        <table cellspacing="3" cellpadding="3" border="1">
            <tr>
                <td aling="right">Te llamas: </td>
                <td> <%= al.getNombre() %> </td>
            </tr>
            <tr>
                <td aling="right">Apellidos </td>
                <td> <%= al.getApellido() %> </td>
            </tr>
            <tr>
                <td aling="right">Y tu promedio es: </td>
                <td> <%= al.getPromedio() %> </td>
            </tr>
        </table>
            <form action="index.jsp" method="post">
                <button type="submit">volver</button>
            </form>
            
            
    </body>
</html>
