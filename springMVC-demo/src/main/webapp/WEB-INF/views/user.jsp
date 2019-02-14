<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ page isELIgnored="false" %>--%>
<html>
<head>
    <title>Index</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css"/>
</head>
<body>
<div>
    <h3>Add User</h3>
    <form action="/add_user" method="post">
        <input type="text" name="username"/><br>
        <input type="password" name="password"/><br>
        <input type="submit" value="add user"/><br>
    </form>
    <c:if test="${addResult!=null}">
        <p>
            Add Result:&nbsp
            <c:out value="${addResult}"></c:out>
        </p>
    </c:if>

</div>

<div>
    <h3>Search User</h3>
    <form action="/search_user" method="post">
        <input type="text" name="username"/>
        <input type="submit" value="search user"/>
    </form>
    <c:if test="${searchResult!=null}">
        <b>Search Result:</b>&nbsp
    </c:if>
    <c:out value="${searchResult.username}"></c:out>
    <c:out value="${searchResult.password}"></c:out>
</div>

<div>
    <h3>Users Information</h3>
    <form action="/show_users" method="post">
        <input type="submit" value="show users"/>
    </form>
    <c:if test="${userList!=null}">
        <br>
        <c:forEach items="${userList}" var="userItem">
            <p>
                <b>username:</b>
                <c:out value="${userItem.username}"></c:out>
                &nbsp
                <b>password:</b>
                <c:out value="${userItem.password}"></c:out>
            </p>
            <br>
        </c:forEach>
    </c:if>
</div>

</body>
</html>