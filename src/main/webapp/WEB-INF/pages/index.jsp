<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Production</title>
</head>
<body>
<div align="center">
    <h2>Hello, World!!</h2>
<%--    <table border="1">--%>
<%--        <tr>--%>
<%--            <th>ID</th>--%>
<%--            <th>Name</th>--%>
<%--            <th>Description</th>--%>
<%--            <th>Quantity</th>--%>
<%--        </tr>--%>
<%--        <c:forEach var="prod" items="${productions}" varStatus="status">--%>
<%--            <tr>--%>
<%--                <td>${status.index + 1}</td>--%>
<%--                <td>${prod.prod_name}</td>--%>
<%--                <td>${prod.prod_des}</td>--%>
<%--                <td>${prod.prod_number}</td>--%>
<%--            </tr>--%>
<%--        </c:forEach>--%>
<%--    </table>--%>
    ${productions}
</div>
</body>
</html>