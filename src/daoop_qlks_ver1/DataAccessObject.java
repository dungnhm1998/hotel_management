/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoop_qlks_ver1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DataAccessObject {

    public static ResultSet get(String sql) { //Tra ve 1 record trong table
        ResultSet rs = null;
        try {
            Connection conn = DatabaseConnector.getSQLServerConnection();
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);

        } catch (SQLException ex) {
            Logger.getLogger(DataAccessObject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataAccessObject.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public static int update(String sql) {//Tra ve so luong row thay doi
        int ans = -1;
        try {
            Connection conn = DatabaseConnector.getSQLServerConnection();
            Statement pstmt = conn.createStatement();
            ans = pstmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DataAccessObject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataAccessObject.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ans;
    }

}
