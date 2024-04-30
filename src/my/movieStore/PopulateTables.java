package my.movieStore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class PopulateTables {

    private static final String jdbc = "jdbc:oracle:thin:h10tran/01013866@oracle.scs.ryerson.ca:1521:orcl";
    private Connection connection;
    private ArrayList<String> output = new ArrayList<>();

    public ArrayList<String> populateTables() {
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
        // Execute all the functions to populate tables in the database
        populateCustomerTable();
        populateLoginInfoTable();
        populateMovieTable();
        populateMovieTransactionTable();
        populateRatingTable();
        populateWatchListTable();
        populateMovieLanguageTable();
        return output;
        
    }

    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Connection closed.");
            }
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void populateCustomerTable() {
        try {
            String insertQuery = "INSERT INTO customer (Username, Name, Email) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            // Add data for the customer table
            addBatch(preparedStatement, "lizzy01", "Lizzy", "lizzy@gmail.com");
            addBatch(preparedStatement, "ethan23", "Ethan", "ethan@gmail.com");
            addBatch(preparedStatement, "sophia34", "Sophia", "sophia@gmail.com");
            addBatch(preparedStatement, "liam88", "Liam", "liam@gmail.com");
            addBatch(preparedStatement, "avery22", "Avery", "avery@gmail.com");
            addBatch(preparedStatement, "francis10", "Francis", "francis@gmail.com");
            addBatch(preparedStatement, "billie8", "Billie", "billie@gmail.com");
            addBatch(preparedStatement, "taylor1989", "Taylor", "taylor@gmail.com");

            int[] result = preparedStatement.executeBatch();
            output.add(result.length + " rows inserted in the customer table");
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void populateLoginInfoTable() {
        try {
            String insertQuery = "INSERT INTO loginInfo (Email, Password) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            // Add data for the loginInfo table
            addBatch(preparedStatement, "lizzy@gmail.com", "password");
            addBatch(preparedStatement, "ethan@gmail.com", "apple2019");
            addBatch(preparedStatement, "sophia@gmail.com", "navyblue00");
            addBatch(preparedStatement, "liam@gmail.com", "newyork999");
            addBatch(preparedStatement, "avery@gmail.com", "ocean321");
            addBatch(preparedStatement, "francis@gmail.com", "bear123");
            addBatch(preparedStatement, "billie@gmail.com", "honeybee");
            addBatch(preparedStatement, "taylor@gmail.com", "swifty9891");

            int[] result = preparedStatement.executeBatch();
            output.add(result.length + " rows inserted in the loginInfo table");
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void populateMovieTable() {
        try {
            String insertQuery = "INSERT INTO movie (MovieId, Title, Director, Duration, Genre, ReleaseDate, Description, Price) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            // Add data for the movie table
            addBatch(preparedStatement, 1, "Barbie", "Greta Gerwig", 114, "Comedy/Romance", 7212023, "Barbie goes to the real world", 21);
            addBatch(preparedStatement, 2, "The Nun 2", "Michael Chaves", 110, "Horror/Thriller", 9082023, "A nun wants revenge after being murdered", 20);
            addBatch(preparedStatement, 3, "Suzume", "Makoto Shinkai", 122, "Adventure/Animation", 4142023, "A supernatural mission to save the country", 22);
            addBatch(preparedStatement, 4, "Oppenheimer", "Christopher Nolan", 180, "Biography/Drama", 07212023, "A dramatisation of the life of J. Robert Oppenheimer", 21);
            addBatch(preparedStatement, 5, "The Little Mermaid", "Rob Marshall", 135, "Fantasy", 05262023, "A mermaid princess explores the human world", 19);
            addBatch(preparedStatement, 6, "The Hunger Games", "Francis Lawrence", 170, "Science fiction/Thriller", 03232012, "Children are forced to fight in the annual Hunger Games", 23);

            int[] result = preparedStatement.executeBatch();
            output.add(result.length + " rows inserted in the movie table");
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void populateMovieTransactionTable() {
        try {
            String insertQuery = "INSERT INTO movieTransaction (TransactionId, Username, MovieId, DatePurchased, TimePurchased, Price) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            
            // Add data for the movieTransaction table
            addBatch(preparedStatement, 1, "lizzy01", 2, 9092023, 1300, 20);
            addBatch(preparedStatement, 2, "avery22", 3, 9102023, 1100, 22);
            addBatch(preparedStatement, 3, "ethan23", 4, 9012023, 1700, 21);
            addBatch(preparedStatement, 4, "sophia34", 1, 9032023, 1900, 21);
            addBatch(preparedStatement, 5, "avery22", 5, 9102023, 1800, 19);
            addBatch(preparedStatement, 6, "francis10", 1, 9122023, 1400, 21);
            addBatch(preparedStatement, 7, "francis10", 2, 9122023, 1500, 20);
            addBatch(preparedStatement, 8, "lizzy01", 3, 9092023, 1400, 22);

            int[] result = preparedStatement.executeBatch();
            output.add(result.length + " rows inserted in the movieTransaction table");
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void populateRatingTable() {
        try {
            String insertQuery = "INSERT INTO rating (MovieId, Username, Rating) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            
            // Add data for the rating table
            addBatch(preparedStatement, 1, "sophia34", 8);
            addBatch(preparedStatement, 2, "lizzy01", 5);
            addBatch(preparedStatement, 3, "avery22", 9);
            addBatch(preparedStatement, 4, "ethan23", 6);
            addBatch(preparedStatement, 5, "avery22", 2);
            addBatch(preparedStatement, 3, "lizzy01", 4);

            int[] result = preparedStatement.executeBatch();
            output.add(result.length + " rows inserted in the rating table");
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void populateWatchListTable() {
        try {
            String insertQuery = "INSERT INTO watchlist (MovieId, Username, DateAdded) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            
            // Add data for the watchlist table
            addBatch(preparedStatement, 1, "avery22", 9142023);
            addBatch(preparedStatement, 2, "ethan23", 9222023);
            addBatch(preparedStatement, 3, "sophia34", 4232023);
            addBatch(preparedStatement, 4, "avery22", 10022023);
            addBatch(preparedStatement, 5, "lizzy01", 9102023);
            addBatch(preparedStatement, 1, "taylor1989", 9112023);
            addBatch(preparedStatement, 6, "billie8", 9111023);

            int[] result = preparedStatement.executeBatch();
            output.add(result.length + " rows inserted in the watchlist table");
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void populateMovieLanguageTable() {
        try {
            String insertQuery = "INSERT INTO movieLanguage (MovieId, MovieLanguage) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            // Add data for the movieLanguage table
            addBatch(preparedStatement, 1, "English");
            addBatch(preparedStatement, 2, "English");
            addBatch(preparedStatement, 3, "English");
            addBatch(preparedStatement, 4, "English");
            addBatch(preparedStatement, 5, "English");
            addBatch(preparedStatement, 2, "French");
            addBatch(preparedStatement, 2, "Cantonese");
            addBatch(preparedStatement, 1, "Spanish");
            addBatch(preparedStatement, 1, "French");
            addBatch(preparedStatement, 5, "Arabic");
            addBatch(preparedStatement, 5, "Italian");

            int[] result = preparedStatement.executeBatch();
            output.add(result.length + " rows inserted in the movieLanguage table");
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void addBatch(PreparedStatement preparedStatement, Object... values) throws SQLException {
        for (int i = 0; i < values.length; i++) {
            if (values[i] instanceof String) {
                preparedStatement.setString(i + 1, (String) values[i]);
            } 
            else if (values[i] instanceof Integer) {
                preparedStatement.setInt(i + 1, (Integer) values[i]);
            }
        }
        preparedStatement.addBatch();
    }
}
