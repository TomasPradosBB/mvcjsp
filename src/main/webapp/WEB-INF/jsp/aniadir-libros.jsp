<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <title>Añadir Libros</title>
    </head>
    <body>
        <div> Página de adición de libros </div> <br>
        <c:if test="${exito}">
            <div>Libro añadido con éxito. ISBN: ${libroGuardado.isbn} </div>
            <a href="/">Volver al índice</a> <br>
            <a href="/libros/listar">Listar Libros</a>
        </c:if>
        <br>
        <form action="/libros" method="POST">
            <label for="isbn"> ISBN del libro: </label><br>
                <input type="text" id="isbn" name="isbn"> <br>
            <label for="nombre"> Nombre del libro: </label> <br>
                <input type="text" id="titulo" name="titulo"> <br>
            <label for="autor"> Autor del libro: </label> <br>
                <input type="text" id="autor" name="autor"> <br>
            <input type="submit" value="Añadir libro"> <br>
        </form>

    </body>
</html>