import java.sql.*;

public class ODBCDeleteExample {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:odbc:student");
             Statement stmt = connection.createStatement()) {

            stmt.executeUpdate("DELETE FROM students WHERE id = 22046989");
            System.out.println("Record deleted successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

