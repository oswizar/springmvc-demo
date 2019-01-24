<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isErrorPage="true" %>
<!DOCTYPE html >
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>index</title>
</head>
<body>

<br>
<a href="springmvc/testForward">testForward</a>
<br>
<a href="springmvc/testRedirect">testRedirect</a>
<br>


<br>
<a href="springmvc/testViewAndViewResolver">testViewAndViewResolver</a>
<br>
<a href="springmvc/testView">testView</a>
<br>

<br>

<br>

<br>

<br>

<br>















<%--1.可以访问--%>
<%--<a href="<%=request.getContextPath()%>/helloworld">Hello World</a>--%>

<%--2.也可以访问--%>
<a href="helloworld">Hello World</a> <br>


<a href="springmvc/testMethod">testMethod</a> <br>

<br>
<form action="springmvc/testMethod" method="post">
    <input type="submit" value="submit"/>
</form> <br>
<a href="springmvc/testParamsAndHeaders?username=xiexing&age=11">testParamsAndHeaders</a> <br>



<a href="springmvc/testPathVariable/11">testPathVariable</a>



<br>
<br>
<a href="springmvc/testRest/11">testRest GET</a>
<br>

<form action="springmvc/testRest" method="post">
    <input type="submit" value="testRest POST"/>
</form> <br>

<form action="springmvc/testRest/1" method="post">
    <input type="hidden" name="_method" value="DELETE"/>
    <input type="submit" value="testRest DELETE"/>
</form> <br>

<form action="springmvc/testRest/2" method="post">
    <input type="hidden" name="_method" value="PUT"/>
    <input type="submit" value="testRest PUT"/>
</form> <br>


<a href="springmvc/testRequestParam?name=小明&age=12">testRequestParam</a>
<br>
<a href="springmvc/testCookieValue">testCookie</a>
<br>

<form action="springmvc/testPOJO">
    userId:<input type="text" name="userId" /><br>
    userName:<input type="text" name="userName" /><br>
    passWord:<input type="password" name="passWord" /><br>
    province:<input type="text" name="address.province" /><br>
    city:<input type="text" name="address.city" /><br>
    <input type="submit" value="submit"/><br>
</form>

<br>
<a href="springmvc/testServletAPI">testServletAPI</a>
<br>

<br>
<a href="springmvc/testModelAndView">testModelAndView</a>
<br>

<br>
<a href="springmvc/testMap">testMap</a>
<br>

<br>
<a href="springmvc/testSessionAttributes">testSessionAttributes</a>
<br>

<form action="springmvc/testModelAttribute">
    <input type="hidden" name="userId" value="123456" />
    userName:<input type="text" name="userName" value="tom"/>
    <br>
    <input type="submit" value="submit"/>
</form>






</body>
</html>
