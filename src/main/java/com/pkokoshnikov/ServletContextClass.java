package com.pkokoshnikov;

import com.pkokoshnikov.state.State;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.ConcurrentHashMap;

public final class ServletContextClass implements ServletContextListener {
    private final String JDBC_CONNECTION = "jdbc:mysql://127.0.0.1:3306/musicapp";
    private final String USER = "musicapp";
    private final String PASSWORD = "root01";
    private static Connection connection;
    private static ConcurrentHashMap<Integer, State> concurrentHashMap;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(JDBC_CONNECTION, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        concurrentHashMap = new ConcurrentHashMap<Integer, State>();
    }

    public static Connection getConnection() {
        return connection;
    }

    public static ConcurrentHashMap<Integer, State> getStateMap() {
        return concurrentHashMap;
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
