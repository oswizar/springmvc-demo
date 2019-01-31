<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="UTF-8" isErrorPage="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>input</title>
</head>
<body>



<form action="testConversionServiceConverter" method="post">
    Employee: <input type="text" name="employee"/>
    <input type="submit" value="Submit"/>
</form>

<%--@elvariable id="employee" type="map"--%>
<form:form action="${pageContext.request.contextPath}/emp" method="post"
           modelAttribute="employee">

    <%--lastName属性在添加时显示，修改时隐藏不进行修改--%>
    <c:if test="${employee.id == null}">
        LastName: <form:input path="lastName"/>
        <form:errors path="lastName"></form:errors>
    </c:if>


    <c:if test="${employee.id != null}">
        <form:hidden path="id"/>

        <input type="hidden" name="_method" value="PUT"/>
        <%--对于"_method" 不能用 form:hidden标签，因为medelAttribute对应的bean中没有"_method"这个属性--%>
        <%--
            <form:hidden path="_method" value="PUT"/>
        --%>
    </c:if>

    <br>
    Email: <form:input path="email"/>
    <form:errors path="email"></form:errors>
    <br>
    <%
        Map<String, String> genders = new HashMap<>();
        genders.put("0", "Female");
        genders.put("1", "Male");
        request.setAttribute("genders", genders);
    %>
    Gender:
    <br>
    <form:radiobuttons path="gender" items="${genders}" delimiter="<br>"/>
    <br>
    Department: <form:select path="department.id" items="${departments}" itemLabel="departmentName"
                             itemValue="id"/>
    <br>
    <%--
        1.数据类型转换
        2.数据类型格式化
        3.数据校验
    --%>

    Birth: <form:input path="birth" />
    <form:errors path="birth"></form:errors>
    <br>

    Salary: <form:input path="salary" />
    <br>

    <input type="submit" value="Submit"/>


    <br>
    <%--<form:errors path="*"></form:errors>--%>

    <br>
</form:form>

</body>
</html>
