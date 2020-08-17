/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerl.Util.impl;

import daoop_qlks_ver1.DatabaseConnector;
import static daoop_qlks_ver1.Main.conn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import model.dto.User;

/**
 *
 * @author Admin
 */
public class UserDAO extends CommonDAO<User> {

    public UserDAO() {
    }

    private static UserDAO instance = new UserDAO();

    public static UserDAO getInstance() {
        return instance;
    }

    public static ArrayList<User> users = new ArrayList<>();

    public boolean addUser(User u) {
        String sql = "INSERT INTO tblUser(account, password, userName, gender, dateOfBirth, address, phoneNumber, indentityNumber, position)"
                + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            conn = DatabaseConnector.getSQLServerConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, u.getAccount());
            ps.setString(2, u.getPassword());
            ps.setString(3, u.getName());
            ps.setBoolean(4, u.getGender());

            String startDate = u.getDateOfBirth(); // Input String
            SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy"); // New Pattern
            java.util.Date date = sdf1.parse(startDate); // Returns a Date format object with the pattern
            java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
            
            ps.setDate(5, sqlStartDate);
            ps.setString(6, u.getAddress());
            ps.setString(7, u.getPhoneNumber());
            ps.setString(8, u.getIndentityNumber());
            ps.setString(9, u.getPosition());
            return ps.executeUpdate() > 0;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return false;
    }

    public ArrayList<User> getListUser() {
        ArrayList<User> listUser = new ArrayList<>();
        listUser = new ArrayList<>();
        String sql = "SELECT * FROM tblUser";
        try {
            conn = DatabaseConnector.getSQLServerConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User();
                u.setUserID(rs.getInt("userID"));
                u.setAccount(rs.getString("account"));
                u.setPassword(rs.getString("password"));
                u.setName(rs.getString("userName"));
                u.setGender(rs.getBoolean("gender"));
                u.setDateOfBirth(rs.getString("dateOfBirth"));
                u.setAddress(rs.getString("address"));
                u.setPhoneNumber(rs.getString("phoneNumber"));
                u.setIndentityNumber(rs.getString("indentityNumber"));
                u.setPosition(rs.getString("position"));
                u.setIsLogin(rs.getBoolean("isLogin"));
                listUser.add(u);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listUser;
    }

    

}
