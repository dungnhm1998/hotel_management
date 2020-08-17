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
import java.util.ArrayList;
import model.dto.PayBill;

/**
 *
 * @author Admin
 */
public class PayBillDAO {

    public PayBillDAO() {
    }

    private static PayBillDAO instance = new PayBillDAO();

    public static PayBillDAO getInstance() {
        return instance;
    }

    public boolean addPayBill(PayBill pb) {
        String sql = "INSERT INTO tblPayBill(billID, roomID)"
                + " VALUES(?, ?)";
        try {
            conn = DatabaseConnector.getSQLServerConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, pb.getBillID());
            ps.setInt(2, pb.getRoomID());
           
            return ps.executeUpdate() > 0;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return false;
    }

    public ArrayList<PayBill> getLisPaytBill() {
        ArrayList<PayBill> listPayBill = new ArrayList<>();
        listPayBill = new ArrayList<>();
        String sql = "SELECT * FROM tblPayBill";
        try {
            conn = DatabaseConnector.getSQLServerConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PayBill pb = new PayBill();
                pb.setPayBillID(rs.getInt("payBillID"));
                pb.setBillID(rs.getInt("billID"));
                pb.setRoomID(rs.getInt("roomID"));
               
                listPayBill.add(pb);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listPayBill;
    }
}
