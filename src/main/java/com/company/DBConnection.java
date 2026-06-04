package com.company;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {

        Connection con = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://192.168.0.2:3306/UserDB",
                    "appuser",
                    "App@123");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}
