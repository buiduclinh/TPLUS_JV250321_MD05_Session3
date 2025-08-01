<%@ page import="java.util.*, com.example.bai4.model.Product" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Quản Lý Sản Phẩm</title></head>
<body>
<h2>Quản Lý Sản Phẩm</h2>

<h3>Thêm Sản Phẩm</h3>
<form action="addProduct" method="post">
    ID: <input type="number" name="id"><br>
    Tên sản phẩm: <input type="text" name="productName"><br>
    Giá: <input type="number" name="price"><br>
    Mô tả: <input type="text" name="description"><br>
    Số lượng: <input type="number" name="stock"><br>
    <button type="submit">Thêm sản phẩm</button>
</form>

<h3>Danh sách sản phẩm đã thêm:</h3>
<table border="1">
    <tr>
        <th>ID</th><th>Tên sản phẩm</th><th>Giá</th><th>Mô tả</th><th>Số lượng</th><th>Trạng thái</th>
    </tr>
    <%
        List<Product> products = (List<Product>) application.getAttribute("products");
        if (products != null) {
            for (Product p : products) {
    %>
    <tr>
        <td><%= p.getId() %></td>
        <td><%= p.getProductName() %></td>
        <td><%= p.getPrice() %></td>
        <td><%= p.getDescription() %></td>
        <td><%= p.getStock() %></td>
        <td><%= p.getStatus() %></td>
    </tr>
    <%
            }
        }
    %>
</table>
</body>
</html>