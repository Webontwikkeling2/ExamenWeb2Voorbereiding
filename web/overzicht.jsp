<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <meta charset="UTF-8">
    <title>Overview</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<div id="container">
    <header>
        <h1>
            <span>Web shop</span>
        </h1>
        <nav>
            <ul>
				<li><a href="index.jsp">Home</a></li>
				<li><a href="Controller?command=overview">Overzicht</a></li>
            </ul>
        </nav>
        <h2>Leden Overzicht</h2>

    </header>
    <main>
        <table>
            <tr>
                <th>ID</th>
                <th>Voornaam</th>
                <th>Naam</th>
            </tr>

            <c:forEach items="${leden}" var="lid">
                <tr id="${lid.id}">
                    <td>${lid.id}</td>
                    <td>${lid.voornaam}</td>
                    <td>${lid.naam}</td>
                </tr>
            </c:forEach>

            <caption>Overzicht Leden</caption>
        </table>
    </main>
    <footer>
        &copy; Webontwikkeling 2, UC Leuven-Limburg
    </footer>
</div>
</body>
</html>