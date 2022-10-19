<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Computer App</title>
    <link rel="stylesheet" href="<c:url value="resources/css/main.css"/>"/>
</head>
<body>
<h4>What you want to do?</h4>
<a href="<c:url value="/computer"/>"><b>Go to the Computer list</b></a><br>
<a href="<c:url value="/facture"/>"><b>Go to the Factures list</b></a><br>
<a href="<c:url value="/order"/>"><b>Submit your order</b></a><br>
</body>
</html>
