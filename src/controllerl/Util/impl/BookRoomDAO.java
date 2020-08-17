/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerl.Util.impl;

import daoop_qlks_ver1.DatabaseConnector;
import static daoop_qlks_ver1.Main.conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.dto.BookRoom;

/**
 *
 * @author Admin
 */
public class BookRoomDAO extends CommonDAO<BookRoom> {

    public BookRoomDAO() {
    }

    private static BookRoomDAO instance = new BookRoomDAO();

    public static BookRoomDAO getInstance() {
        return instance;
    }

    public final List<BookRoom> bookRooms = new ArrayList<>();

    public boolean addBookRoom(BookRoom br) {
        String sql = "INSERT INTO tblBookRoom(customerID, roomID, dateFrom, dateTo, isPaid)"
                + " VALUES(?, ?, ?, ?, ?)";
        try {
            conn = DatabaseConnector.getSQLServerConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, br.getCustomerID());
            ps.setInt(2, br.getRoomID());

            String startDate = br.getDateFrom(); // Input String
            SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy"); // New Pattern
            java.util.Date date = sdf1.parse(startDate); // Returns a Date format object with the pattern
            java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
            ps.setDate(3, sqlStartDate);

            startDate = br.getDateTo();
            date = sdf1.parse(startDate);
            sqlStartDate = new java.sql.Date(date.getTime());
            ps.setDate(4, sqlStartDate);

            ps.setInt(5, br.getIsPaid());
            return ps.executeUpdate() > 0;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return false;
    }

    public ArrayList<BookRoom> getListBookRoom() {
        ArrayList<BookRoom> listBookRoom = new ArrayList<>();
        listBookRoom = new ArrayList<>();
        String sql = "SELECT * FROM tblBookRoom";
        try {
            conn = DatabaseConnector.getSQLServerConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                BookRoom br = new BookRoom();
                br.setCustomerID(rs.getInt("customerID"));
                br.setRoomID(rs.getInt("roomID"));
                br.setDateFrom(rs.getString("dateFrom"));
                br.setDateTo(rs.getString("dateTo"));
                br.setIsPaid(rs.getInt("isPaid"));
                listBookRoom.add(br);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listBookRoom;
    }

    @Override
    public int add(BookRoom bookRoom) {
        int ketqua = 0;
        String sql = "";
        try {
            sql = "INSERT INTO tblBookRoom (customerID, roomID, dateFrom, dateTo) VALUES "
                    + "(?, ?, ?, ?)";
            Connection conn = DatabaseConnector.getSQLServerConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, bookRoom.getCustomerID());
            stmt.setInt(2, bookRoom.getRoomID());
            stmt.setString(3, bookRoom.getDateFrom());
            stmt.setString(4, bookRoom.getDateTo());

            stmt.execute();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ketqua;
    }
}
