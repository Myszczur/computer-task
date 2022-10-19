<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Order</title>
</head>
<a href="/order">Go to order&nbsp;&nbsp;</a>
<a href="/computer">Go to computer list&nbsp;&nbsp;</a>
<body>
<a href="/facture/list-name">Sort by Name&nbsp;&nbsp;</a>
<a href="/facture/list-data-rev">Sort by Accounting date&nbsp;&nbsp;</a>
<div>
    <table>
        <tr>
            <th><h4><strong>Facture Id&nbsp;</strong></h4></th>
            <th><h4><strong>facture name&nbsp;</strong></h4></th>
            <th><h4><strong>Accounting date&nbsp;</strong></h4></th>
        </tr>
        <c:forEach items="${factures}" var="factures">
            <tr>
                <td><strong>${factures.id}</strong></td>
                <td><strong>${factures.name}</strong></td>
                <td><strong>${factures.accountingDate}</strong></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
