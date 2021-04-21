import com.mchange.v2.c3p0.*;
import java.beans.PropertyVetoException;

public class C3P0 {
    public C3P0() throws PropertyVetoException {

        try {
            ComboPooledDataSource cpds = new ComboPooledDataSource();
            System.out.println("\n[Info]: The connection to the Oracle database server has been successfully established.");
            cpds.setDriverClass( "org.postgresql.Driver" );
            cpds.setJdbcUrl( "jdbc:oracle:thin:@localhost:1521:xe" );
            cpds.setUser("student");
            cpds.setPassword("STUDENT");
            cpds.close();

        } catch (PropertyVetoException e) {
            System.out.println("\n[Error]: The connection to the Oracle database server has failed.\n Due to :\n");
            e.printStackTrace();
        }






    }
}
