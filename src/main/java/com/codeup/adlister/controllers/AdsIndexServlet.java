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

@WebServlet(name = "controllers.AdsIndexServlet", urlPatterns = "/ads")
public class AdsIndexServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("ads", DaoFactory.getAdsDao().all());
        request.getRequestDispatcher("/WEB-INF/ads/index.jsp").forward(request, response);


        int adId = Integer.parseInt(request.getParameter("adId"));

        Ad ad = null;
        try {
            ad = (Ad) DaoFactory.getAdsDao().getAdById(adId);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if(ad != null){
            long userId = ad.getUserId();
            request.setAttribute("user", DaoFactory.getUsersDao().findByUserId((int) userId));

        }
        try {
            request.setAttribute("ad", DaoFactory.getAdsDao().getAdById(adId));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
