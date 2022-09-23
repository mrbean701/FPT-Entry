package RudyRentSystem.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtil {
	 private static Connection connection;

	    public static void checkDBConnection() throws SQLException, IOException {
	        Properties properties = new Properties();
	        try (FileInputStream fis = new FileInputStream("src/Reference/database.properties")) {
	            properties.load(fis);
	            String url = properties.getProperty("url");
	            try (Connection connection = DriverManager.getConnection(url)) {
	                System.out.println("Connect to database successfully!");
	            }
	        }
	    }

	    public static Connection getConnection() throws IOException, SQLException {
	        if (connection == null || connection.isClosed()) {
	            Properties properties = new Properties();
	            try (FileInputStream fis = new FileInputStream("src/Reference/database.properties")) {
	                properties.load(fis);
	                String url = properties.getProperty("url");
	                connection = DriverManager.getConnection(url);
	            }
	        }
	        return connection;
	    }

	    public static void close() throws SQLException {
	        if (connection != null) {
	            connection.close();
	        }
	    }
}
