package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "controllers.ViewProfileServlet", urlPatterns = "/profile")
public class ViewProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = DaoFactory.getUsersDao().findByUsername((String) request.getSession().getAttribute("user"));
        long userId = user.getId();

        if (request.getSession().getAttribute("user") == null) {
            response.sendRedirect("/login");
        } else {
            try {
                request.setAttribute("ads", DaoFactory.getAdsDao().allById(user.getId()));  //we set the attribute ads here, then we can loop through ads in the profile.jsp
                request.setAttribute("user", DaoFactory.getUsersDao().findByUserId((int) userId));
            } catch (SQLException e) {
                e.printStackTrace();
            }
            request.getRequestDispatcher("/WEB-INF/profile.jsp").forward(request, response);

        }

    }



    }
