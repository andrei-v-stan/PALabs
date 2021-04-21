import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTables {

    public CreateTables(String dbURL, String username, String password) throws SQLException {

        Connection connection = DriverManager.getConnection(dbURL, username, password);
        String sql = "ALTER TABLE movies ADD (actors VARCHAR2(500), directors VARCHAR2(350))";
        Statement statement = connection.createStatement();
    }

}