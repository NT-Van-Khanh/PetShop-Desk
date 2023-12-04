
package hdt.petshopproject.util;

import java.sql.Connection;
import java.sql.DriverManager;
import static java.sql.DriverManager.getConnection;

public class helper {

    
    
    public static Connection openConnection()  throws Exception{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost;database=QuanLyPetShop";
        String username = "sa";
        String password = "100303";
        Connection con = DriverManager.getConnection(connectionURL, username, password);
        return con;
    }
}
