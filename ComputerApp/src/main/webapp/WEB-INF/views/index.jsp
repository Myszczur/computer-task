<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Computer App</title>
</head>
<body>
<h4>What you want to do?</h4>
<a href="<c:url value="/computer"/>"><b>Go to the Computer list</b></a><br>
<a href="<c:url value="/order"/>"><b>Submit your order</b></a>
</body>
</html>
