<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="UTF-8" isErrorPage="true" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript">
        $(function(){
            $("#testJson").click(function() {
                var url = this.href;
                var args = {};
                $.post(url,args,function(data) {
                    for (var i = 0;i < data.length;i++) {
                        var id = data[i].id;
                        var lastName = data[i].lastName;
                        alert(id + ": " + lastName);
                    }
                })
                return false;
            })
        })
    </script>
</head>

<body>
<a href="emps">List All Employees</a>
<br>
<br>
<a href="testExceptionHandlerExceptionResolver?i=10">testExceptionHandlerExceptionResolver</a>
<br>
<a href="testSimpleMappingExceptionResolver?i=10">testSimpleMappingExceptionResolver</a>

<br>
<br>
<br>
<br>



<br>
<form action="testHttpMessageConverter" method="post" enctype="multipart/form-data">
    File: <input type="file" name="file"/>
    <br>
    Desc: <input type="text" name="desc"/>
    <br>
    <input type="submit" value="Submit"/>
</form>
<br>
<br>
<br>
<br>
<br>
<br>



<br>
<a id="testJson" href="testJson" >testJson</a>
<br>
<a href="testJson1">testJson1</a>


</body>
</html>
