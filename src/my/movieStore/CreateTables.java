package my.movieStore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class CreateTables {
    private static final String jdbc = "jdbc:oracle:thin:h10tran/01013866@oracle.scs.ryerson.ca:1521:orcl";
    private Connection connection;
    private ArrayList<String> output = new ArrayList<>();

    public ArrayList<String> createTables() {
        // Load JDBC driver
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } 
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Connect to database
        try {
            connection = DriverManager.getConnection(jdbc);
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        // Use this to create tables
        String[] table = {"customer", "loginInfo", "movie", "movieTransaction", "rating", "watchlist", "movieLanguage"};
        String[] tableRules = {
                "Username VARCHAR(30) PRIMARY KEY, Name VARCHAR(25) NOT NULL, Email VARCHAR(50) NOT NULL",
                "Email VARCHAR(50) PRIMARY KEY, Password VARCHAR(50) NOT NULL",
                "MovieId INT PRIMARY KEY, Title VARCHAR(50) NOT NULL, Director VARCHAR(25) NOT NULL, Duration INT NOT NULL, Genre VARCHAR(25) NOT NULL, ReleaseDate INT NOT NULL, Description VARCHAR(100) NOT NULL, Price INT NOT NULL",
                "TransactionId INT PRIMARY KEY,Username VARCHAR(30) REFERENCES customer(Username) NOT NULL, MovieId INT REFERENCES movie(MovieId) NOT NULL, DatePurchased INT NOT NULL, TimePurchased INT NOT NULL, Price INT NOT NULL",
                "MovieId INT REFERENCES movie(MovieId) NOT NULL, Username VARCHAR(30) REFERENCES customer(Username) NOT NULL, Rating INT CHECK (Rating >= 1 AND Rating <= 10) NOT NULL",
                "MovieId INT REFERENCES movie(MovieId) NOT NULL, Username VARCHAR(30) REFERENCES customer(Username) NOT NULL, DateAdded INT NOT NULL",
                "MovieId INT REFERENCES movie(MovieId) NOT NULL, MovieLanguage VARCHAR(30) NOT NULL"
        };
        
        String[] view = {"affordableMovies", "affordableFrenchMovies", "fantasyAndBiographyDramaMovies", "moviesPurchased8to4"};
        String[] viewRules = {
            "SELECT * FROM movie WHERE Price <= 20",
            "SELECT m.*, l.MovieLanguage FROM movie m, movieLanguage l WHERE l.MovieLanguage = 'French' AND m.Price <= 20 AND l.MovieId = m.MovieId",
            "SELECT DISTINCT m.* FROM movie m, watchlist w WHERE m.Genre = 'Fantasy' OR m.GENRE = 'Biography/Drama' AND w.MovieId = m.MovieId",
            "SELECT * FROM movieTransaction  WHERE TimePurchased >= 800 AND TimePurchased <= 1600"
        };

        output = makeTables(table, tableRules, view, viewRules);
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

    // This will use the names of tables and rules to create the tables in the database
    public ArrayList<String> makeTables(String[] table, String[] tableRules, String[] view, String[] viewRules) {
        Statement statement = null;
        try {
            statement = connection.createStatement();
            for (int i = 0; i < table.length; i++) {
                String tableName = table[i];
                String tableRule = tableRules[i];

                // Creating the table
                String createTableSQL = "CREATE TABLE " + tableName + " (" + tableRule + ")";

                // Executing the statement
                statement.executeUpdate(createTableSQL);
                output.add("Created: " + tableName);
            }
            
            for (int i = 0; i < view.length; i++) {
                String viewName = view[i];
                String viewRule = viewRules[i];

                // Creating the view table
                String createTableSQL = "CREATE VIEW " + viewName + " AS (" + viewRule + ")";

                // Executing the statement
                statement.executeUpdate(createTableSQL);
                output.add("Created: " + viewName);
            }
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        return output;
    }
}
