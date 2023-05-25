<%-- 
    Document   : detalle
    Created on : 07-feb-2017, 13:24:12
    Author     : jose
--%>
<jsp:useBean id="beanArticulo" scope="request" class="bean.Articulo" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Datos del articulo</h1>
        <br>
        Nombre:<jsp:getProperty name="beanArticulo" property="nombre" />
        <br>
        Descripcion:<jsp:getProperty name="beanArticulo" property="descripcion" />
        <br>
        Codigo:<jsp:getProperty name="beanArticulo" property="cod_articulo" />
        <br>
        Precio:<jsp:getProperty name="beanArticulo" property="pvp" />
    </body>
</html>
