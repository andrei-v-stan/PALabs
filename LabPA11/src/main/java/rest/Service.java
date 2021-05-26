package rest;

import entity.Person;

import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Service {

    public List<Person> getAll() {
        List<Person> people = new ArrayList<>();
        try {
            Person person;
            Statement stmt = ConnectionDB.getConnection().createStatement();
            ResultSet resultS = stmt.executeQuery("SELECT * FROM PERSON");
            while (resultS.next()) {
                person = new Person(resultS.getString(1), resultS.getString(2));
                people.add(person);
            }
            stmt.close();
            resultS.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return people;
    }

    public void add(Person person) {
        try {
            PreparedStatement stmtP = ConnectionDB.getConnection().prepareStatement("INSERT INTO PERSON VALUES(?, ?)");
            stmtP.setString(1, person.getId());
            stmtP.setString(2, person.getNume());
            if (stmtP.executeUpdate() != 0) {
                System.out.println("[Info]: The person has been added");
                stmtP.close();
            } else
                stmtP.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(String id) {
        try {
            PreparedStatement stmtP = ConnectionDB.getConnection().prepareStatement("DELETE FROM PERSON WHERE id = ?");
            stmtP.setString(1, id);
            if (stmtP.executeUpdate() != 0) {
                System.out.println("[Info]: The person has been deleted");
                stmtP.close();
            } else
                stmtP.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Person person) {
        try {
            PreparedStatement stmtP = ConnectionDB.getConnection().prepareStatement("UPDATE PERSON SET nume = ? WHERE id = ?");
            stmtP.setString(1, person.getNume());
            stmtP.setString(2, person.getId());
            if (stmtP.executeUpdate() != 0) {
                System.out.println("[Info]: The update has been realised");
                stmtP.close();
            } else
                stmtP.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
