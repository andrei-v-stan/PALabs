package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertAfterCreation {

    public InsertAfterCreation(String dbURL, String username, String password) throws SQLException {

        Connection connection = DriverManager.getConnection(dbURL, username, password);
        String sql = "INSERT INTO movies VALUES ('5476944','Black Butler : Book of the Atlantic',TO_DATE('2017-01-21','YYYY-MM-DD'),'101','7.7', 'Bryn Apprill | Dawn Michelle Bennett | Justin Briner | Josh Grelle | Todd Flaberkom | Kaito Ishikawa | Jerry Jewell','Yukihiro Masumoto | Yukihiro Watanabe | Noriyuki Abe | Ayako Kawano | Kazunori Mizuno')";
        Statement statement = connection.createStatement();

        int number = statement.executeUpdate(sql);
        if (number > 0) {
            System.out.println("\n[Info]: A row has been inserted.\n");
        }

    }

}