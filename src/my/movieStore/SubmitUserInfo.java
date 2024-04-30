package my.movieStore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class SubmitUserInfo {
    
    private static final String jdbc = "jdbc:oracle:thin:h10tran/01013866@oracle.scs.ryerson.ca:1521:orcl";
    private Connection connection;
    
    public boolean submitUserData(String username, String name, String password, String email) {
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
        } 
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        
        // Insert data into the customer table
        String insertCustomerQuery = "INSERT INTO customer (username, name, email) VALUES (?, ?, ?)";
        
        // Insert data into the loginInfo table
        String insertLoginInfoQuery = "INSERT INTO loginInfo (email, password) VALUES (?, ?)";

        try (PreparedStatement customerStatement = connection.prepareStatement(insertCustomerQuery);
             PreparedStatement loginInfoStatement = connection.prepareStatement(insertLoginInfoQuery)) {

            // Setting the parameters in the tables
            customerStatement.setString(1, username);
            customerStatement.setString(2, name);
            customerStatement.setString(3, email);

            loginInfoStatement.setString(1, email);
            loginInfoStatement.setString(2, password);

            // Execute the queries
            int customerRowsAffected = customerStatement.executeUpdate();
            int loginInfoRowsAffected = loginInfoStatement.executeUpdate();

            // Check if queries were successful
            return customerRowsAffected > 0 && loginInfoRowsAffected > 0;

        } 
        catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Connection closed.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
