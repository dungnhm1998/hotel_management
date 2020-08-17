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
import java.util.List;
import model.dto.Bill;

/**
 *
 * @author Admin
 */
public class BillDAO extends CommonDAO<Bill> {

    public BillDAO() {
    }

    private static BillDAO instance = new BillDAO();

    public static BillDAO getInstance() {
        return instance;
    }

    public final List<Bill> bills = new ArrayList<>();

    public boolean addBill(Bill b) {
        String sql = "INSERT INTO tblBill(customerID, totalPrice, userID, datePay)"
                + " VALUES(?, ?, ?, ?)";
        try {
            conn = DatabaseConnector.getSQLServerConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, b.getCustomerID());
            ps.setInt(2, b.getTotalPrice());
            ps.setInt(3, b.getUserID());

            String startDate = b.getDatePay(); // Input String
            SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy"); // New Pattern
            java.util.Date date = sdf1.parse(startDate); // Returns a Date format object with the pattern
            java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());

            ps.setDate(4, sqlStartDate);
            return ps.executeUpdate() > 0;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return false;
    }

    public ArrayList<Bill> getListBill() {
        ArrayList<Bill> listBill = new ArrayList<>();
        listBill = new ArrayList<>();
        String sql = "SELECT * FROM tblBill";
        try {
            conn = DatabaseConnector.getSQLServerConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Bill b = new Bill();
                b.setBillID(rs.getInt("billID"));
                b.setCustomerID(rs.getInt("customerID"));
                b.setTotalPrice(rs.getInt("totalPrice"));
                b.setUserID(rs.getInt("userID"));
                b.setDatePay(rs.getString("datePay"));
                b.setIsPrinted(rs.getBoolean("isPrinted"));
                listBill.add(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listBill;
    }

    
}
