package com.example.bai3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet (urlPatterns = "/signin")
public class SignIn extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        if(username==null || password==null || email==null || username.isEmpty() || password.isEmpty() || email.isEmpty()){
            req.getRequestDispatcher("error.jsp").forward(req,resp);
        }else {
            req.getSession().setAttribute("username", username);
            req.getSession().setAttribute("password", password);
            req.getSession().setAttribute("email", email);
            req.getRequestDispatcher("infor.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("signin.jsp").forward(req,resp);
    }
}
