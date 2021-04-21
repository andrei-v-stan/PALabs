package DAO;
import java.sql.*;

public class FindEx {

    public FindEx(String dbURL, String username, String password) throws SQLException {

        Connection connection = DriverManager.getConnection(dbURL, username, password);
        String sql = "SELECT * FROM genres WHERE id LIKE '%2%'";
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(sql);

        int count = 0;
        while (result.next()) {
            count++;

            String id = result.getString("id");
            String title = result.getString("name");
            System.out.println("Genre nr " + count + "\t :  " + id + "\t" + title);
        }
        System.out.println("\n");
    }

}