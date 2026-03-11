import java.sql.*;

public class Demo {
    public static void main(String[] args) {
        // This is the URL format UCanAccess uses to find your file
        // Since the .mdb is in the root folder, just the filename is enough
        String databasepath = "JAVA_DATABASE.mdb";
        String url = "jdbc:ucanaccess://"+databasepath;
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            // This line attempts to connect to your database
            
            Connection connection = DriverManager.getConnection(url);
            System.out.println("Success! Connected to the MS Access database.");
            
            // Always a good habit to close it when you are done
            connection.close();
            
        } catch (Exception e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
}