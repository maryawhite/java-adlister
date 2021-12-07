package com.codeup.adlister.dao;
import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;

public class DaoFactory {
    private static Ads adsDao;
    private static Config config = new Config();

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }
}
