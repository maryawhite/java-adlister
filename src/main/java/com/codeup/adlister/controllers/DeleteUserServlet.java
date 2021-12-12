package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.dao.MySQLUsersDao;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "DeleteUserServlet", urlPatterns = "/delete")
public class DeleteUserServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.getSession().getAttribute("username");
    request.getSession().getAttribute("userId");

        //if they're not logged in, send them to login
        if (request.getSession().getAttribute("user") == null) {
            response.sendRedirect("/login");
        }

        request.getRequestDispatcher("/delete").forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        DaoFactory.getUsersDao().deleteUser((Long) request.getSession().getAttribute("userId"));
        response.sendRedirect("/ads");



    }


    }
