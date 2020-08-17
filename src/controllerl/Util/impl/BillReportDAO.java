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
import model.dto.Bill;
import model.dto.BillReportDB;

/**
 *
 * @author Admin
 */
public class BillReportDAO {
    public BillReportDAO() {
    }

    private static BillReportDAO instance = new BillReportDAO();

    public static BillReportDAO getInstance() {
        return instance;
    }
    
     public boolean addBillReportDB(Bill brp) {
        String sql = "INSERT INTO tblBill(customerID, totalPrice, userID, datePay)"
                + " VALUES(?, ?, ?, ?)";
        try {
            conn = DatabaseConnector.getSQLServerConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, brp.getCustomerID());
            ps.setInt(2, brp.getTotalPrice());
            ps.setInt(3, brp.getUserID());

            String startDate = brp.getDatePay(); // Input String
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

    public ArrayList<BillReportDB> getListBillReportDB() {
        ArrayList<BillReportDB> listBillReportDB = new ArrayList<>();
        listBillReportDB = new ArrayList<>();
        String sql = "SELECT * FROM tblBill JOIN tblPayBill ON tblPayBill.billID = tblBill.billID";
        try {
            conn = DatabaseConnector.getSQLServerConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BillReportDB brp = new BillReportDB();
                brp.setPayBillID(rs.getInt("payBillID"));
                brp.setBillID(rs.getInt("billID"));
                brp.setCustomerID(rs.getInt("customerID"));
                brp.setPrice(rs.getInt("totalPrice"));
                brp.setRoomID(rs.getInt("roomID"));
                brp.setDatePay(rs.getString("datePay"));
                listBillReportDB.add(brp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listBillReportDB;
    }
}
