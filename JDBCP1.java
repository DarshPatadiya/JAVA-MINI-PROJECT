import java.sql.*;
import java.util.*;
/*import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;*/


class JDBCP1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String databasepath = "JAVA_DATABASE.mdb";
        String url = "jdbc:ucanaccess://"+databasepath;
        String query = "SELECT * FROM PRODUCTS WHERE PRODUCT_ID = ? AND PRODUCT_NAME=?";
           

        try( Connection conn = DriverManager.getConnection(url);
            

            PreparedStatement stmt = conn.prepareStatement(query);)
        {
            System.out.println("Enter the id:");
            int productId = sc.nextInt();
            System.out.println("Enter the name:");
            String productName = sc.nextLine();
            

           
           stmt.setInt(1, productId);
           stmt.setString(2, productName);
            ResultSet rs = stmt.executeQuery();

            while(rs.next())
            {
                System.out.println("ID  : "+rs.getString("PRODUCT_ID"));
                System.out.println("NAME  : "+rs.getString("PRODUCT_NAME"));
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}