package com.example.mariakhaleta.booktest;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {
    // Change below settings as per your database ip and credentials
    String ip = "http://192.168.1.6/"; // if you have to add port then it would be like .i.e. 182.50.133.109:1433
    String db = "Store"; //Name of Database
    String un = "root"; //Database user
    String password = "xjfacjbd"; //Database Password

    @SuppressLint("NewApi")
    public Connection CONN()
    {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                .permitAll().build();
        StrictMode.setThreadPolicy(policy);
        Connection conn = null;
        String ConnURL = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            ConnURL = "jdbc:jtds:sqlserver://" + ip + ";" + "databaseName=" + db + ";user=" + un + ";password=" + password + ";";
            conn = DriverManager.getConnection(ConnURL);
        } catch (SQLException se) {
            Log.e("ERRO", se.getMessage());
        } catch (ClassNotFoundException e) {
            Log.e("ERRO", e.getMessage());
        } catch (Exception e) {
            Log.e("ERRO", e.getMessage());
        }
        return conn;
    }
}
