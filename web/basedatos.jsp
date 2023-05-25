<%-- 
    Document   : basedatos
    Created on : 06-feb-2017, 19:13:53
    Author     : jose
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="bean.Articulo"%>
<%@page import="java.sql.*"%>
<%@page import="dao.ArticuloDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ejemplo de acceso a base de datos</h1>
        <%
        ArticuloDao aDAO=new ArticuloDao();    
        ArrayList<Articulo> articulos=aDAO.getArticulos();
        
        %>
        
        <table border="1">
            <tr>
                <th>
                    Cod_Articulo
                </th>
                <th>
                    Nombre
                </th>
                <th>
                    Precio
                </th>
            </tr>
                <%
                for (Articulo a:articulos)
                {
                    out.println("<tr>");
                    out.println("<td>"+a.getCod_articulo()+"</td>");
                    out.println("<td>"+a.getNombre()+"</td>");
                    out.println("<td>"+a.getPvp()+"</td>");
                    out.println("</tr>");
                }
                %>
        </table>
        <a href="verarticulo.do?id=1">Enlace</a>
    </body>
</html>
