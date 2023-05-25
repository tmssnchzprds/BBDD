<%-- 
    Document   : zonaprivadada
    Created on : 08-feb-2017, 9:32:18
    Author     : jose
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<jsp:useBean id="beanUsuario" scope="session" class="bean.Usuario" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenido a la zona privada</h1>
        Perfil:
        <br>
        Nombre Completo:
        <br>
        Cod_usuario:
        <br>
        <a href="prueba.jsp">Continuar</a>
    </body>
</html>
