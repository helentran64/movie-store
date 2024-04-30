
package my.movieStore;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class ValidateLogin {
    private static final String jdbc = "jdbc:oracle:thin:h10tran/01013866@oracle.scs.ryerson.ca:1521:orcl";
    private Connection connection;
    
    
    public boolean isValidLogin(String email, String password) {
        // Load JDBC driver
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } 
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Connect to the database
        try {
            connection = DriverManager.getConnection(jdbc);
            System.out.println("Connected to the database.");
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        // Check if the email and password match a record in the database
        String query = "SELECT * FROM loginInfo WHERE email = ? AND password = ?";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                return resultSet.next();
            }
        } 
        catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
