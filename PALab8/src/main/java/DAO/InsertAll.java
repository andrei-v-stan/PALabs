package DAO;
import java.sql.*;

public class InsertAll {

    public InsertAll(String dbURL, String username, String password) throws SQLException {

        Connection connection = DriverManager.getConnection(dbURL, username, password);

        String sql = "INSERT INTO movies VALUES ('0003639888','Black Butler : Book of Circus',TO_DATE('2014-07-11','YYYY-MM-DD'),'120','8.2')";
        String sql1 = "INSERT INTO movies VALUES ('5476944','Black Butler : Book of the Atlantic',TO_DATE('2017-01-21','YYYY-MM-DD'),'101','7.7')";
        String sql2 = "INSERT INTO movies VALUES ('5714216','Black Butler : Book of Murder',TO_DATE('2014-10-25','YYYY-MM-DD'),'116','8.1')";
        String sql3 = "INSERT INTO movies VALUES ('5311514','Your Name',TO_DATE('2017-01-07','YYYY-MM-DD'),'106','8.4')";
        String sql4 = "INSERT INTO movies VALUES ('5311514','Demon Slayer : Mugen Train',TO_DATE('2021-01-23','YYYY-MM-DD'),'117','8.3')";
        String sql5 = "INSERT INTO movies VALUES ('9089294','The Seven Deadly Sins : Prisoners of the Sky',TO_DATE('2018-11-22','YYYY-MM-DD'),'99','7.1')";
        String sql6 = "INSERT INTO movies VALUES ('9089294','The Seven Deadly Sins : Signs of Holy War',TO_DATE('2016-08-28','YYYY-MM-DD'),'124','7.6')";
        String sql7 = "INSERT INTO movies VALUES ('5544384','Sword Art Online : Ordinal Scale',TO_DATE('2017-02-18','YYYY-MM-DD'),'119','7.4')";
        String sql8 = "INSERT INTO movies VALUES ('9089294','Konosuba : Legend of Crimson',TO_DATE('2019-08-30','YYYY-MM-DD'),'90','7.9')";
        String sql9 = "INSERT INTO movies VALUES ('0011285348','Re Zero : Frozen Bonds',TO_DATE('2019-11-8','YYYY-MM-DD'),'80','7.6')";

        String sql10 = "INSERT INTO genres VALUES ('01','Action')";
        String sql11 = "INSERT INTO genres VALUES ('02','Adventure')";
        String sql12 = "INSERT INTO genres VALUES ('03','Comedy')";
        String sql13 = "INSERT INTO genres VALUES ('04','Crime and mystery')";
        String sql14 = "INSERT INTO genres VALUES ('05','Fantasy')";
        String sql15 = "INSERT INTO genres VALUES ('06','Historical')";
        String sql16 = "INSERT INTO genres VALUES ('07','Historical fiction')";
        String sql17 = "INSERT INTO genres VALUES ('08','Horror')";
        String sql18 = "INSERT INTO genres VALUES ('09','Romance')";
        String sql19 = "INSERT INTO genres VALUES ('10','Satire')";
        String sql20 = "INSERT INTO genres VALUES ('11','Science fiction')";
        String sql21 = "INSERT INTO genres VALUES ('12','Cyberpunk and derivatives')";
        String sql22 = "INSERT INTO genres VALUES ('13','Speculative')";
        String sql23 = "INSERT INTO genres VALUES ('14','Thriller')";
        String sql24 = "INSERT INTO genres VALUES ('15','Western')";
        String sql25 = "INSERT INTO genres VALUES ('16','Other')";
        String sql26 = "INSERT INTO genres VALUES ('17','Animation')";
        String sql27 = "INSERT INTO genres VALUES ('18','Drama')";
        String sql28 = "INSERT INTO genres VALUES ('19','Unscripted')";

        Statement stmt = connection.createStatement();

        stmt.addBatch(sql1);
        stmt.addBatch(sql2);
        stmt.addBatch(sql3);
        stmt.addBatch(sql4);
        stmt.addBatch(sql5);
        stmt.addBatch(sql6);
        stmt.addBatch(sql7);
        stmt.addBatch(sql8);
        stmt.addBatch(sql9);
        stmt.addBatch(sql10);
        stmt.addBatch(sql11);
        stmt.addBatch(sql12);
        stmt.addBatch(sql13);
        stmt.addBatch(sql14);
        stmt.addBatch(sql15);
        stmt.addBatch(sql16);
        stmt.addBatch(sql17);
        stmt.addBatch(sql18);
        stmt.addBatch(sql19);
        stmt.addBatch(sql20);
        stmt.addBatch(sql21);
        stmt.addBatch(sql22);
        stmt.addBatch(sql23);
        stmt.addBatch(sql24);
        stmt.addBatch(sql25);
        stmt.addBatch(sql26);
        stmt.addBatch(sql27);
        stmt.addBatch(sql28);

        stmt.executeBatch();

        int rows = stmt.executeUpdate(sql);
        if (rows > 0) {
            System.out.println("\n[Info]: Multiple rows have been inserted.\n");
        }

    }

}
