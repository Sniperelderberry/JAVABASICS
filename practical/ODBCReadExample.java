import java.sql.*;

public class ODBCReadExample {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:odbc:student");
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT id, name FROM students WHERE id = 4406")) {

            if (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
            } else {
                System.out.println("No record found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

