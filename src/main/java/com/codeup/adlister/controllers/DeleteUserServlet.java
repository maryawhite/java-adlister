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

        User user = DaoFactory.getUsersDao().findByUsername((String) request.getSession().getAttribute("user"));

        //if they're not logged in, send them to login
        if (request.getSession().getAttribute("user") == null) {
            response.sendRedirect("/login");
        }

        request.getRequestDispatcher("/delete").forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        User user = DaoFactory.getUsersDao().findByUsername(request.getParameter("user")); //building a user object using the current user
        System.out.println(user.getUsername());

        DaoFactory.getUsersDao().deleteUser(user.getId());
        response.sendRedirect("/ads");



    }


    }
