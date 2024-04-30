package my.movieStore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;

public class QueryTables {
    private static final String jdbc = "jdbc:oracle:thin:h10tran/01013866@oracle.scs.ryerson.ca:1521:orcl";
    private Connection connection;
    private ArrayList<String> output = new ArrayList<>();
    private ArrayList<String> queries = new ArrayList<>();

    public ArrayList<String> queryTables() {
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
        
        // Add all the queries into the queries array for it to be later executed
        queries.add("SELECT Name FROM customer ORDER BY Name");
        queries.add("SELECT DISTINCT Name FROM customer WHERE Username NOT IN (SELECT Username FROM rating)");
        queries.add("SELECT DISTINCT Name FROM customer WHERE Username IN (SELECT Username FROM movieTransaction)");
        queries.add("SELECT Title FROM movie ORDER BY Title");
        queries.add("SELECT Director, Genre FROM movie WHERE Duration > 130 ORDER BY Director");
        queries.add("SELECT DatePurchased FROM movieTransaction");
        queries.add("SELECT DISTINCT c.Name, t.Price FROM customer c, movieTransaction t, rating r WHERE t.Price > 20 AND t.MovieID = r.MovieID AND c.Username IN (SELECT Username FROM rating) AND t.Username = c.Username");
        queries.add("SELECT c.Name, SUM(t.Price) AS Price FROM customer c, movieTransaction t WHERE c.Username = t.Username GROUP BY c.Name");
        queries.add("SELECT * FROM rating");
        queries.add("SELECT m.Title, r.Rating FROM movie m, rating r WHERE m.MovieId = r.MovieId ORDER BY Rating DESC");
        queries.add("SELECT m.Title, AVG(r.Rating) AS Rating FROM movie m, rating r WHERE m.MovieId = r.MovieId GROUP BY m.Title");
        queries.add("SELECT * FROM watchlist");
        queries.add("SELECT m.Title, m.Description FROM movie m, watchlist w WHERE m.MovieId = w.MovieID ORDER BY m.Title");
        queries.add("SELECT DISTINCT c.Name, m.Title FROM customer c, movie m, watchlist w WHERE c.Username = w.Username AND m.MovieId = w.MovieId");
        queries.add("SELECT * FROM movieLanguage");
        queries.add("SELECT m1.Title FROM movie m1 WHERE EXISTS (SELECT l1.MovieLanguage FROM movieLanguage l1 WHERE m1.MovieId = l1.MovieId AND l1.MovieLanguage = 'French') AND EXISTS (SELECT l2.MovieLanguage FROM movieLanguage l2 WHERE m1.MovieId = l2.MovieId AND l2.MovieLanguage = 'English') ORDER BY m1.Title");
        queries.add("SELECT DISTINCT m.Title, l.MovieLanguage, r.rating FROM movie m, movieLanguage l, rating r WHERE l.MovieLanguage = 'English' AND l.MovieId = m.MovieId AND l.MovieId = r.MovieId AND r.MovieId = m.MovieId AND r.rating > 5 ORDER BY r.rating DESC");
        queries.add("SELECT * FROM affordableMovies");
        queries.add("SELECT * FROM affordableFrenchMovies");
        queries.add("SELECT * FROM fantasyAndBiographyDramaMovies");
        queries.add("SELECT DISTINCT m.Title, p.TimePurchased FROM movie m, moviesPurchased8to4 p, rating r WHERE m.MovieId = p.MovieId AND p.MovieId = r.MovieId");
        queries.add("SELECT DISTINCT c.Name FROM customer c WHERE EXISTS (SELECT * FROM movieTransaction t, rating r WHERE t.Price < 21 AND c.Username = t.Username AND c.Username = r.Username)");
        queries.add("SELECT c.Name, c.Email FROM customer c WHERE NOT EXISTS (SELECT * FROM movieTransaction t WHERE c.Username = t.Username) UNION (SELECT c2.Name, c2.Email FROM customer c2 WHERE NOT EXISTS (SELECT * FROM watchlist w WHERE c2.Username = w.Username))");
        queries.add("(SELECT * FROM movieTransaction) MINUS (SELECT * FROM movieTransaction WHERE TimePurchased >= 800 AND TimePurchased <= 1600)");
        queries.add("SELECT c.Name, COUNT(*) AS Rating FROM customer c, rating r WHERE c.Username = r.Username GROUP BY c.Name");
        queries.add("SELECT m.Title, AVG(r.Rating) as Rating FROM movie m, rating r WHERE m.MovieId = r.MovieId GROUP BY m.Title HAVING AVG(r.Rating) > (SELECT AVG(Rating) FROM rating)");
        executeQueries(queries);
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
