import DAO.*;
import Model.Movies;

import java.beans.PropertyVetoException;
import java.sql.*;
import java.sql.Connection;

public class Singleton {

    private final String dbURL, username, password;

    public Singleton() throws SQLException {
        this.dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
        this.username = "student";
        this.password = "STUDENT";

        try {
            Connection connection = DriverManager.getConnection(dbURL, username, password);
            System.out.println("\n[Info]: The connection to the Oracle database server has been successfully established.");

            new Insert(dbURL, username, password);
            new Find(dbURL, username, password);
            new FindEx(dbURL, username, password);
            new InsertAll(dbURL, username, password);
            new ShowAll(dbURL, username, password);
            new CreateTables(dbURL, username, password);
            new InsertAfterCreation(dbURL, username, password);
            new CSV();
            new C3P0();

        } catch (SQLException | PropertyVetoException e) {
            System.out.println("\n[Error]: The connection to the Oracle database server has failed.\n Due to :\n");
            e.printStackTrace();
        }
    }
}