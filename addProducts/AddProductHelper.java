package addProducts;    
import java.sql.*;


public class AddProductHelper 
{
    public static display_product()
    {
         String url = "JAVA_DATABASE.mdb";
        try 
        {
            Connection conn = DriverManager.getConnection(url);
            String sql = "SELECT * FROM PRODUCT"; 
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.executeQuery(sql);
            
        } 
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        System.out.println("Add Category Helper placeholder");
    }
    public static void addProduct() 
    {
        
        String url = "JAVA_DATABASE.mdb";
        try 
        {
            Connection conn = DriverManager.getConnection(url);
            String sql = "INSERT INTO products (PRODUCT_NAME,TOTAL_QUANTITY,PRICE,PRODUCT_CATEGORY_ID,PRODUCT_DESCRIPTION) VALUES (?, ?, ?,?,?)"; 
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, PRODUCT_NAME);
            pstmt.setInt( 2, TOTAL_QUANTITY);
            pstmt.setInt(3, PRICE);
            pstmt.setInt(4,PRODUCT_CATEGORY_ID);
            pstmt.setString(5,PRODUCT_DESCRIPTION);
            pstmt.executeUpdate(sql);
            
        } 
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

}