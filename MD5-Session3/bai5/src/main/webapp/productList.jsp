
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Danh sách sản phẩm</title></head>
<body>
<h2>Danh sách sản phẩm</h2>
<table border="1" cellpadding="5" cellspacing="0">
    <tr>
        <th>ID</th>
        <th>Tên sản phẩm</th>
        <th>Giá</th>
        <th>Mô tả</th>
    </tr>

    <c:forEach var="p" items="${productList}">
        <tr>
            <td>${p.id}</td>
            <td>${p.productName}</td>
            <td>${p.price}</td>
            <td>${p.description}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
