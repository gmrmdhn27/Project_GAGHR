
package rentcar.config;

import java.sql.*;
import java.sql.Connection;

public class DatabaseConnect {
    
    public static Connection connect() {
        
        Connection conn = null;
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db_rentcar",
                    "root",
                    "");
            System.out.println("Koneksi Berhasil");
            
        } catch(Exception e) {
            
            System.out.println("Koneksi gagal" + e.getMessage());
            
        }
        return conn;
    }
    
}
