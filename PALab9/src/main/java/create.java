import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class create {

    public create() {

        Connection connection = DriverManager.getConnection(dbURL, username, password);
        String sql = "INSERT INTO movies VALUES ('1234','Test Title',TO_DATE('1234-01-23','YYYY-MM-DD'),'123','4.5')";
        Statement statement = connection.createStatement();

        int number = statement.executeUpdate(sql);
        if (number > 0) {
            System.out.println("\n[Info]: A row has been inserted.\n");
        }
    }
}
