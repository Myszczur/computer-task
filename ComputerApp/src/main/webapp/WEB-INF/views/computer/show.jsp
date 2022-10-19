<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Show Computer</title>
    <link rel="stylesheet" href="<c:url value="/resources/css/main.css"/>"/>
</head>
<body>
<table>
    <thead>
    <tr>
        <th><h4><strong>Computer Id&nbsp;</strong></h4></th>
        <th><h4><strong>Computer name&nbsp;</strong></h4></th>
        <th><h4><strong>USD Cost&nbsp;</strong></h4></th>
        <th><h4><strong>PLN Cost&nbsp;</strong></h4></th>
        <th><h4><strong>Accounting date&nbsp;</strong></h4></th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td><strong>${computer.id}</strong></td>
        <td><strong>${computer.name}</strong></td>
        <td><strong>${computer.usdCost}</strong></td>
        <td><strong>${computer.plnCost}</strong></td>
        <td><strong>${computer.accountingDate}</strong></td>
    </tr>
    </tbody>
</table>
<div>
    <a href="<c:url value="/computer"/>"><b>Go to Computer List</b></a>
</div>
</body>
</html>
