package com.example.bai4.servlet;

import com.example.bai4.model.Product;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/addProduct")
public class ProductServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = getServletContext();
        List<Product> products = (List<Product>) context.getAttribute("products");

        if (products == null) {
            products = new ArrayList<>();
        }

        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("productName");
        double price = Double.parseDouble(req.getParameter("price"));
        String desc = req.getParameter("description");
        int stock = Integer.parseInt(req.getParameter("stock"));

        Product product = new Product(id, name, price, desc, stock);
        products.add(product);

        context.setAttribute("products", products);

        resp.sendRedirect("product.jsp");
    }
}