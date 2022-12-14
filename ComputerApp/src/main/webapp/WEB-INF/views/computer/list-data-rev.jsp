<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Computer list</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/main.css"/>"/>
</head>
<a href="/order">Go to order&nbsp;&nbsp;</a>
<a href="/facture">Go to facture list&nbsp;&nbsp;</a>
<body>
<div>
    <a href="/computer/list-name">Sort by Name&nbsp;&nbsp;</a>
    <a href="/computer/list-data">Sort by Accounting date&nbsp;&nbsp;</a>
    <table>
        <tr>
            <th><h4><strong>Computer Id&nbsp;</strong></h4></th>
            <th><h4><strong>Computer name&nbsp;</strong></h4></th>
            <th><h4><strong>USD Cost&nbsp;</strong></h4></th>
            <th><h4><strong>PLN Cost&nbsp;</strong></h4></th>
            <th><h4><strong>Accounting date&nbsp;</strong></h4></th>
        </tr>
        <c:forEach items="${computers}" var="computers">
            <tr>
                <td><strong>${computers.id}</strong></td>
                <td><strong>${computers.name}</strong></td>
                <td><strong>${computers.usdCost}</strong></td>
                <td><strong>${computers.plnCost}</strong></td>
                <td><strong>${computers.accountingDate}</strong></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
