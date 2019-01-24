<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>success</title>
</head>
<body>

<h1>success!!!</h1>

<br>

<fmt:message key="i18n.username"></fmt:message>
<br>
<fmt:message key="i18n.password"></fmt:message>
<br>

time:${requestScope.time}
<br>
user:${requestScope.user}
<br>

request user:${requestScope.user}
<br>
session user:${sessionScope.user}
<br>

<br>

request school:${requestScope.school}
<br>
session school:${sessionScope.school}
<br>
<br>
<br>



</body>
</html>
