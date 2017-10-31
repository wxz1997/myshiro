<%--
  Created by IntelliJ IDEA.
  User: wxz
  Date: 17-10-23
  Time: 下午6:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
    <div>login</div>
    <form action="user/login" method="post">
        <P>
            <input id="username" type="text" name="username" placeholder="请输入登录名"/>
        </P>
        <P>
            <input id="password" type="password" name="password" placeholder="请输入密码"/>
        </P>
        <P>
            <input class="rememberMe" type="checkbox" name="rememberMe"/> 记住密码
        </P>
        <input type="submit" value="登录">
    </form>
</body>
</html>