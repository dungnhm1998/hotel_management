package controllerl.Util.impl;

import daoop_qlks_ver1.DatabaseConnector;
import static daoop_qlks_ver1.Main.conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.dto.Room;

public class RoomDAO extends CommonDAO<Room>{
    public RoomDAO() {
    }

    private static RoomDAO instance = new RoomDAO();

    public static RoomDAO getInstance() {
        return instance;
    }

    public final List<Room> rooms = new ArrayList<>();
    
    public boolean addRoom(Room r) {
        String sql = "INSERT INTO tblRoom(roomName, isBooked, isUsed, floor, bedNumber, price)"
                + " VALUES(?, ?, ?, ?, ?, ?)";
        try {
            conn = DatabaseConnector.getSQLServerConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, r.getRoomName());
            ps.setBoolean(2, r.getIsBooked());
            ps.setBoolean(3, r.getIsUsed());
            ps.setInt(4, r.getFloor());
            ps.setInt(5, r.getBedNumber());
            ps.setInt(6, r.getPrice());
            
            return ps.executeUpdate() > 0;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return false;
    }
    
    public ArrayList<Room> getListRoom() {
        ArrayList<Room> listRoom = new ArrayList<>();
        listRoom = new ArrayList<>();
        String sql = "SELECT * FROM tblRoom";
        try {
            conn = DatabaseConnector.getSQLServerConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Room r = new Room();
                r.setRoomID(rs.getInt("roomID"));
                r.setRoomName(rs.getString("roomName"));
                r.setIsBooked(rs.getBoolean("isBooked"));
                r.setIsUsed(rs.getBoolean("isUsed"));
                r.setFloor(rs.getInt("floor"));
                r.setBedNumber(rs.getInt("bedNumber"));
                r.setPrice(rs.getInt("price"));

                listRoom.add(r);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listRoom;
    }
     
    
    public void addToList() throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM tblRoom";
        Connection conn = DatabaseConnector.getSQLServerConnection();
        Statement stmt = conn.createStatement();
        //ResultSet rs = DataAccessObject.get(sql);
        stmt.execute(sql);
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            rooms.add(new Room(rs.getInt(1), rs.getString(2), rs.getBoolean(3), rs.getBoolean(4),
                    rs.getInt(5), rs.getInt(6), rs.getInt(7)));
        }
    }
    
    @Override
    public int update(Room room) {
        String sql = "";
        int ketqua = 0;
        try {
            sql = "UPDATE tblRoom"
                    + " SET roomName = ?, isBooked = ?, isUsed = ?, floor = ?, berNumber = ?, price = ? "
                    + " WHERE roomID = ?";
            Connection conn = DatabaseConnector.getSQLServerConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, room.getRoomName());
            stmt.setBoolean(2, room.getIsBooked());
            stmt.setBoolean(3, room.getIsUsed());           
            stmt.setInt(4, room.getFloor());
            stmt.setInt(5, room.getBedNumber());
            stmt.setInt(6, room.getPrice());            
            stmt.execute();
            System.out.println("Updated");
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ketqua;
    }
    
    @Override
    public int add(Room room) {
        int ketqua = 0;
        String sql = "";
        try {
            sql = "INSERT INTO tblRoom (roomName, isBooked, isUsed, floor, bedNumber, price) VALUES "
                    + "(?, ?, ?, ?, ?, ?)";
            Connection conn = DatabaseConnector.getSQLServerConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, room.getRoomName());
            stmt.setBoolean(2, room.getIsBooked());
            stmt.setBoolean(3, room.getIsUsed());
            stmt.setInt(4, room.getFloor());
            stmt.setInt(5, room.getBedNumber());
            stmt.setInt(6, room.getPrice());
            stmt.execute();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ketqua;
    }
}
