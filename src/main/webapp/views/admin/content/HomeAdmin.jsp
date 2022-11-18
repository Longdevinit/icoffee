<%--
  Created by IntelliJ IDEA.
  User: acer
  Date: 11/8/2022
  Time: 9:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<form name="dinhdanh" action="home-admin" method="post" class="f1">
    <input name="firstname" type="text" placeholder="Ghi tên tại đây">
    <br /><br />
    <input type="submit" value="Lưu tên">
</form>
<hr />
<h2>${message}</h2>
</body>
</html>
