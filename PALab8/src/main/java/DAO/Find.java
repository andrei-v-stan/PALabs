package DAO;
import java.sql.*;

public class Find {

    public Find(String dbURL, String username, String password) throws SQLException {

        Connection connection = DriverManager.getConnection(dbURL, username, password);
        String sql = "SELECT * FROM movies WHERE id LIKE '%2%'";
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery(sql);

        int count = 0;
        while (result.next()) {
            count++;
            String id = result.getString("id");
            String title = result.getString("title");
            String release = result.getString("release_date");
            String duration = result.getString("duration");
            String score = result.getString("score");
            System.out.println("Movie nr " + count + "\t :  " + id + "\t" + title + "\t" + duration + "\t" + score);
        }
        System.out.println("\n");
    }

}