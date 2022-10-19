<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Facture</title>
    <link rel="stylesheet" href="<c:url value="resources/css/main.css"/>"/>
</head>
<a href="/order">Go to order&nbsp;&nbsp;</a>
<a href="/computer">Go to computer list&nbsp;&nbsp;</a>
<body>
<a href="/facture/list-name">Sort by Name&nbsp;&nbsp;</a>
<a href="/facture/list-data">Sort by Accounting date&nbsp;&nbsp;</a>
<div>
    <form action="/computer" method="post">
        <div><input type="text" placeholder="Szukaj Komputera.." name="keyword" id="keyword  ">
            <button type="submit">&nbsp;&nbsp;Szukaj&nbsp;&nbsp;
            </button>
        </div>
    </form>
    <table>
        <tr>
            <th><h4><strong>Facture Id&nbsp;</strong></h4></th>
            <th><h4><strong>Facture name&nbsp;</strong></h4></th>
            <th><h4><strong>Accounting date&nbsp;</strong></h4></th>
        </tr>
        <c:forEach items="${factures}" var="factures">
            <tr>
                <td><strong>${factures.id}</strong></td>
                <td><strong>${factures.name}&nbsp;&nbsp;</strong></td>
                <td><strong>${factures.accountingDate}&nbsp;</strong></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
