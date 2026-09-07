import java.sql.*;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/studentdb";

    private static final String USER = "${YOUR_USERNAME}";

    private static final String PASSWORD = "${YOUR_PASSWORD}";

    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}