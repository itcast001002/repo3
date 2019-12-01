<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
11111111111111111
<h1>添加账号信息</h1>
<form name="accountForm" action="${pageContext.request.contextPath}/account/save" method="post">
      账号名称:<input type="text" name="name"><br>
      账号金额：<input type="text" name="money"><br>
    <input type="submit" value="保存"><br>
      ></form>
</body>
</html>