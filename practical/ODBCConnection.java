import java.sql.*;

public class ODBCConnection {
    public static void main(String[] args) {
        String dsn = "jdbc:odbc:student";  // Your ODBC DSN name

        try (Connection connection = DriverManager.getConnection(dsn)) {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  //load driver
            System.out.println("Connection successful!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

