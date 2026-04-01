<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 4/1/2026
  Time: 1:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
    <title>Simple Dictionary</title>

</head>
<body>
<h2> Vietnamese Dictionary</h2>
<form action="/translate" method="post">
    <input type="text" name="txtSeach" placeholder="Enter your word: "/>
    <input type="submit" id="sumbit"  value="Seach"/>
</form>
</body>
</html>
