package com.pkokoshnikov.database;

import com.pkokoshnikov.ServletContextClass;
import com.pkokoshnikov.ServletContextClass;
import com.pkokoshnikov.ServletContextClass;

import java.sql.*;

public class UserDAO {
    public String tryLogin(final Integer id) {
        try {
            final Statement statement = ServletContextClass.getConnection().createStatement();
            final ResultSet rs = statement.executeQuery("SELECT id, name FROM user WHERE user.id=" + id);
            rs.next();
            if (rs.getString("id").isEmpty()) {
                return "FAILED";
            } else {
                return "SUCCESS";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "FAILED";
    }
}
