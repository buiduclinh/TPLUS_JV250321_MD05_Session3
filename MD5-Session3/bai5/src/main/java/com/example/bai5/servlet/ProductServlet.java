package com.example.bai5.servlet;


import com.example.bai5.model.Product;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/products")
public class ProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> productList = new ArrayList<>();

        // Sản phẩm mẫu
        productList.add(new Product(1, "Laptop", 1500.0, "Laptop cấu hình cao"));
        productList.add(new Product(2, "Chuột", 200.0, "Chuột không dây"));
        productList.add(new Product(3, "Bàn phím", 350.0, "Bàn phím cơ"));

        // Gửi sang JSP
        request.setAttribute("productList", productList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("productList.jsp");
        dispatcher.forward(request, response);
    }
}
