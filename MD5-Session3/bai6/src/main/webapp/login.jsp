<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Đăng Nhập</title>
</head>
<body>
<h1>Đăng Nhập</h1>

<form method="post">
    Username: <input type="text" name="username" value="${param.username}" /><br/><br/>
    Password: <input type="password" name="password" /><br/><br/>
    <button type="submit">Đăng Nhập</button>
</form>

<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    boolean isSubmitted = username != null && password != null;

    if (isSubmitted) {
        boolean isLoginSuccess = username.equals("admin") && password.equals("123456");
        request.setAttribute("isLoginSuccess", isLoginSuccess);
        request.setAttribute("username", username);
    }
%>

<c:if test="${isLoginSuccess eq true}">
    <h2>Đăng nhập thành công</h2>
    <p>xin chào <b>${username}</b> !</p>
</c:if>

<c:if test="${isLoginSuccess eq false}">
    <h2>Đăng nhập thất bại</h2>
    <p>username hoặc mật khẩu sai</p>
</c:if>

</body>
</html>
