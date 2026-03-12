package addProducts;
import java.sql.*;

public class AddCategoryHelper {
    public static void CategoryEntry()
    {
         String url = "JAVA_DATABASE.mdb";
        try 
        {
            Connection conn = DriverManager.getConnection(url);
            String sql = "INSERT INTO PRODUCT_CATEGORY (PRODUCT_CATEGORY_NAME) VALUES (?)"; 
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString( 1, PRODUCT_CATEGORY_NAME);  
            pstmt.executeUpdate(sql);
            
        } 
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        System.out.println("Add Category Helper placeholder");
    }
    public static void display()
    {
        
         String url = "JAVA_DATABASE.mdb";
        try 
        {
            Connection conn = DriverManager.getConnection(url);
            String sql = "SELECT * FROM PRODUCT_CATEGORY"; 
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.executeQuery(sql);
            
        } 
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        System.out.println("Add Category Helper placeholder");
        

    }
}