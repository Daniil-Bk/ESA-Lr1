<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>books</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <td>id</td>
        <td>name</td>
        <td>genre</td>
        <td>count</td>
        <td>author</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${booksList}" var="book">
        <tr>
            <td>${book.id}</td>
            <td>${book.name}</td>
            <td>${book.genre}</td>
            <td>${book.count}</td>
            <td>${book.author.name}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>