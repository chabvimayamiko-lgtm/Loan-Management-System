import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL =
            "jdbc:mysql://localhost:3306/loan_system";

    private static final String USER = "root";

    private static final String PASSWORD = "Mikomaya@2";

    public static Connection getConnection() {

        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (SQLException e) {
            System.out.println("Database connection failed!");
            System.out.println(e.getMessage());
            return null;
        }
    }


}



public class Main {

    public static void main(String[] args) {

        try (Connection connection = DatabaseConnection.getConnection()) {

            if (connection != null) {
                System.out.println("Connected to MySQL successfully!");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}