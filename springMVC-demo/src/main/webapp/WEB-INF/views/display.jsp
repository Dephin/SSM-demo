<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ page isELIgnored="false" %>--%>
<html>
<head>
    <title>Index</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/css/style.css"/> "/>
</head>
<body>
<c:out value="${item}"/><br>
<c:out value="${null}" default="is null"/><br>
<c:out value="${user.username}"/><br>
<c:out value="${user.getPassword()}"/><br>
<c:forEach items="${userList}" var="userItem" >
    <c:out value="${userItem.username}"></c:out><br>
    <c:out value="${userItem.password}"></c:out><br>
</c:forEach>
<c:if test="${item!=null}">
    Print this sentence .
</c:if>
<c:choose>
    <c:when test="${item!=null}">
        Print this sentence When.
    </c:when>
    <c:otherwise>
        Print this sentence Else.
    </c:otherwise>
</c:choose>
</body>
</html>