<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Order</title>
    <link rel="stylesheet" href="<c:url value="resources/css/main.css"/>"/>
</head>
<body>
<form:form method="post" modelAttribute="computer">
    <div>
        <label for="name"><strong>Computer name:</strong></label>
        <form:input path="name"/><br/>
        <form:errors path="name" cssStyle="color: #e02d1b"/>
    </div>
    <div class="form-group">
        <label for="usdCost"><strong>USD Cost:</strong>:</label>
        <form:input type="number" path="usdCost"/><br/>
        <form:errors path="usdCost" cssStyle="color: #e02d1b"/>
    </div>
    <button type="submit">Add to Card</button>
</form:form>
<a href="/order/order-summary">Order Summary</a>
</body>
</html>
