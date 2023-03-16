<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <title>Index page</title>
    </head>
    <body>
        <table>
            <thead>
                <tr>
                    <th>ISBN</th>
                    <th>Titulo</th>
                    <th>Autor</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${libros}" var="libro">
                    <tr>
                        <td>${libro.isbn}</td>
                        <td>${libro.titulo}</td>
                        <td>${libro.autor}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>