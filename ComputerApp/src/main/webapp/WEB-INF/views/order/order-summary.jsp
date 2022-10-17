<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Order</title>
</head>
<body>

<div>
    <table>
        <tr>
            <th><h4><strong>Computer name</strong></h4></th>
            <th><h4><strong>USD Cost</strong></h4></th>
            <th><h4><strong>PLN Cost</strong></h4></th>
          </tr>
        <c:forEach items="${summary}" var="summary">
            <tr>
                <td><strong>${summary.name}</strong></td>
                <td><strong>${summary.usdCost}</strong></td>
                <td><strong>${summary.plnCost}</strong></td>
              </tr>
        </c:forEach>
    </table>
    <a href="/order/save-order">Submit</a>
</div>
</body>
</html>