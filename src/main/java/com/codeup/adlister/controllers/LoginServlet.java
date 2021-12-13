package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;
import com.codeup.adlister.util.Password;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("user") != null) {
            response.sendRedirect("/profile");
            return;
        }
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User userVar = DaoFactory.getUsersDao().findByUsername(username);

        if (userVar == null) {
            response.sendRedirect("/login");
            return;
        }

        String userPassword = userVar.getPassword();

        boolean validAttempt = Password.check(password, userPassword);

        if (validAttempt) {
            request.getSession().setAttribute("user", username);  //when they log in, we set an attribute called user, to be what was passsed in as username
            response.sendRedirect("/profile");
        } else {
            response.sendRedirect("/login");
        }
    }
}
//use getAttribute  in conjunction with  request.getRequestDispatcher("/WEB-INF/delete.jsp").forward(request, response);