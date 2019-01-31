<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="UTF-8" isErrorPage="true" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>
<form action="upload" method="post" enctype="multipart/form-data">
    File: <input type="file" name="file"/>
    <br>
    Desc: <input type="text" name="desc"/>
    <br>
    <input type="submit" value="Submit"/>
</form>
</body>
</html>
