import java.sql.*;

public class ODBCUpdateExample {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:odbc:student");
             Statement stmt = connection.createStatement()) {

            stmt.executeUpdate("UPDATE students SET id= 22046989 WHERE name= Sukhdeep Singh");
            System.out.println("Record updated successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

