<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Order</title>
</head>
<a href="/order">Go to order</a>
<body>
<a href="/computer/list-name">Sort by Name</a>

<a href="/computer/list-data">Sort by Accounting date</a>
<div>
    <table>
        <tr>
            <th><h4><strong>Computer Id</strong></h4></th>
            <th><h4><strong>Computer name</strong></h4></th>
            <th><h4><strong>USD Cost</strong></h4></th>
            <th><h4><strong>PLN Cost</strong></h4></th>
            <th><h4><strong>Accounting date</strong></h4></th>
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
