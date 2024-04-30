
package my.movieStore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;

public class MakeRequests {
    private static final String jdbc = "jdbc:oracle:thin:h10tran/01013866@oracle.scs.ryerson.ca:1521:orcl";
    private Connection connection;
    private ArrayList<String> output = new ArrayList<>();
    private ArrayList<String> queries = new ArrayList<>();
    

    public MakeRequests() {
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
    }
    
    public String getUsername(String email){
        System.out.println(email);
        String username = "";
        
        // Find the username of the customer by searching for their email
        String sqlQuery = "SELECT username FROM customer WHERE email = " + "'" + email + "'";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            ResultSet resultSet = preparedStatement.executeQuery();) {
            
            // Retrieve the username from the result
            if (resultSet.next()) {
                username = resultSet.getString("username");
            }
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        return username;
    }
    
    public ArrayList<String> updatePassword(String email, String password){
        try (PreparedStatement preparedStatement = connection.prepareStatement("UPDATE loginInfo SET password = ? WHERE email = ?");) {
            // Updates the customer's password by using their email address
            preparedStatement.setString(1, password);
            preparedStatement.setString(2, email);
            preparedStatement.executeUpdate();
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        queries.add("SELECT * FROM loginInfo WHERE email = " + "'" + email+ "'");
        executeQueries(queries);
        return output;
    }
    
    public ArrayList<String> viewMovies(){
        // Select all the movies from the movie table and display it
        queries.add("SELECT * FROM movie");
        executeQueries(queries);
        return output;
    }
    
    public ArrayList<String> purchaseMovies(String username, Integer movieId){
        // Generate random transactionId and time
        Random random = new Random();
        int transactionId = random.nextInt(90) + 10;
        int time = random.nextInt(1401) + 1000;
        // Customer can only purchase from this date
        int datePurchased = 11242023;
        int price = 0;
        
        String sqlQuery = "SELECT price FROM movie WHERE movieId = " + "'" + movieId + "'";
        
        // Find the price of the movie selected
        try (PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
            ResultSet resultSet = preparedStatement.executeQuery();) {
            // Retrieve the price from the result
            if (resultSet.next()) {
                price = resultSet.getInt("price");
            } 
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        
        // Insert a new record into the movieTransaction table to store the new transaction
        try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO movieTransaction (TransactionId, Username, MovieId, DatePurchased, TimePurchased, Price) VALUES (?, ?, ?, ?, ?, ?)");) {
            // Setting the parameters for the query
            preparedStatement.setInt(1, transactionId);
            preparedStatement.setString(2, username);
            preparedStatement.setInt(3, movieId);
            preparedStatement.setInt(4, datePurchased);
            preparedStatement.setInt(5, time);
            preparedStatement.setInt(6, price);
            preparedStatement.executeUpdate();
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        output.add("Purchased");
        return output;
    }
    
    public ArrayList<String> viewTransactions(String username){
        // Select all the purchased made by the customer and display it
        queries.add("SELECT * FROM movieTransaction WHERE username = " + "'" + username +"'");
        executeQueries(queries);
        return output;
    }
    
    public ArrayList<String> viewRatings(){
        // Select all the ratings made by every customer and display it
        queries.add("SELECT * FROM rating");
        executeQueries(queries);
        return output;
    }
    
    public ArrayList<String> makeRating(Integer movieId, String username, Integer rating){
        String insertQuery = "INSERT INTO rating (movieId, username, rating) VALUES (?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);) {
            // Setting the parameters for the query
            preparedStatement.setInt(1, movieId);
            preparedStatement.setString(2, username);
            preparedStatement.setInt(3, rating);
            preparedStatement.executeUpdate();
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        output.add("Rating added");
        return output;
    }
    
    public ArrayList<String> viewLang(){
        // Select and display all the languages offered in each movie
        queries.add("SELECT * FROM movieLanguage");
        executeQueries(queries);
        return output;
    }
    
    public ArrayList<String> addToWatchlist(Integer movieId, String username){
        int dateAdded = 11242023;
        String insertQuery = "INSERT INTO watchlist (movieId, username, dateadded) VALUES (?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);) {
            // Setting the parameters for the query
            preparedStatement.setInt(1, movieId);
            preparedStatement.setString(2, username);
            preparedStatement.setInt(3, dateAdded);
            preparedStatement.executeUpdate();
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        output.add("Added to watchlist");
        return output;
    }
    
    public ArrayList<String> viewWatchlist(String username){
        // SELECT and display all the movies in the customer's watchlist
        queries.add("SELECT * FROM watchlist WHERE username = " + "'" + username + "'");
        executeQueries(queries);
        return output;

    }
    
    public ArrayList<String> delRating(Integer movieId, String username){
        String deleteQuery = "DELETE FROM rating WHERE movieId = ? AND username = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);) {
            // Setting the parameters for the query
            preparedStatement.setInt(1, movieId);
            preparedStatement.setString(2, username);
            preparedStatement.executeUpdate();
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        output.add("Rating removed");
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
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void executeQueries(ArrayList<String> queries) {
        try {
            // Execute each query from the queries array
            for (String query : queries) {
                PreparedStatement preparedStatement = connection.prepareStatement(query);

                if (preparedStatement.execute()) {
                    ResultSet resultSet = preparedStatement.getResultSet();
                    ResultSetMetaData metaData = resultSet.getMetaData();
                    int count = metaData.getColumnCount();
                    
                    // Append the results into the output array to display it for the custommer 
                    while (resultSet.next()) {
                        StringBuilder resultRow = new StringBuilder();
                        for (int i = 1; i <= count; i++) {
                            String name = metaData.getColumnName(i);
                            String value = resultSet.getString(i);
                            resultRow.append(name).append(": ").append(value).append("  ");
                        }
                        output.add(resultRow.toString());
                    }
                }
            }
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
