package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;

@WebServlet (name = "controllers.ViewAd", urlPatterns = "/viewad/*")
public class ViewAd extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int adId = Integer.parseInt(request.getParameter("adId"));
//        try {
//            request.setAttribute("creationDate", DaoFactory.getAdsDao().getCreationDate(adId));
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        try {
            Ad ad = (Ad) DaoFactory.getAdsDao().getAdById(adId);
            long userId = ad.getUserId();
            request.setAttribute("user", DaoFactory.getUsersDao().findByUserId((int) userId));
            request.setAttribute("ad", DaoFactory.getAdsDao().getAdById(adId));


        } catch (SQLException e) {
            e.printStackTrace();
        }

        request.getRequestDispatcher("/WEB-INF/ads/viewad.jsp").forward(request, response);

    }

}
