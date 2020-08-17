    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class DAO {
     public static Connection getSQLServerConnection()
            throws SQLException, ClassNotFoundException {
        String hostName = "localhost";
        String sqlInstanceName = "DESKTOP-FB0DNKO\\SQLEXPRESS";
        String database = "DAOOP_HOTEL";
        String userName = "qlks";
        String password = "qlks";

        return getSQLServerConnection(hostName, sqlInstanceName,
                database, userName, password);
    }

    public static Connection getSQLServerConnection(String hostName,
            String sqlInstanceName, String database, String userName,
            String password) throws ClassNotFoundException, SQLException {
    
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        
        String connectionURL = "jdbc:sqlserver://" + hostName + ":1433"
                + ";instance=" + sqlInstanceName + ";databaseName=" + database;

        Connection conn = DriverManager.getConnection(connectionURL, userName,
                password);
        System.out.println(" Ok duoc roi nhe");
        return conn;
    }
    
    
    
}
