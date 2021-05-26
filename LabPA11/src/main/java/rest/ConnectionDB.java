package rest;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;

public class ConnectionDB {
    private static Connection conn;

    public static Connection getConnection() throws SQLException, SQLException {

        if (conn == null) {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "student", "STUDENT");
            return conn;
        }
        else
            return conn;
    }
}
