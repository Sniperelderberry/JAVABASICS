import java.sql.*;

public class ODBCInsertExample {
    public static void main(String[] args) {
        String dsn = "jdbc:odbc:student";  // Your ODBC DSN name

        try (Connection connection = DriverManager.getConnection(dsn)) {
            // Load the JDBC-ODBC driver 
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

            // Execute the insert directly with the entire SQL query inside executeUpdate
            Statement stmt = connection.createStatement();
            stmt.executeUpdate("INSERT INTO students (id, name) VALUES ,(4406, 'Sukhdeep Singh')");

            System.out.println("Record inserted successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

