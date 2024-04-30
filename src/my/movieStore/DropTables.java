package my.movieStore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DropTables {
    private static final String jdbc = "jdbc:oracle:thin:h10tran/01013866@oracle.scs.ryerson.ca:1521:orcl";
    private Connection connection;
    private ArrayList<String> output = new ArrayList<>();
    
    
    public ArrayList<String> dropTables() {
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
            System.out.println(e.getMessage());
        }

        try {
            Statement statement = connection.createStatement();

            // Names of tables and views to drop
            String[] tablesDrop = {"customer", "loginInfo", "movie", "movieTransaction", "rating", "watchlist", "movieLanguage"};
            String[] viewsDrop = {"affordableMovies", "affordableFrenchMovies", "fantasyAndBiographyDramaMovies", "moviesPurchased8to4"};
            
            // Dropping tables 
            for (String table : tablesDrop) {
                String dropQuery = "DROP TABLE " + table + " CASCADE CONSTRAINTS";
                statement.executeUpdate(dropQuery);
                output.add("Dropped: " + table);
            }
            
            // Dropping views
            for (String view : viewsDrop) {
                String dropQuery = "DROP VIEW " + view;
                statement.executeUpdate(dropQuery);
                output.add("Dropped: " + view);
            }
            statement.close();
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return output;
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
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
