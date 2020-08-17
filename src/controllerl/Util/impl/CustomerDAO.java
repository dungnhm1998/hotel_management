package controllerl.Util.impl;

import daoop_qlks_ver1.DatabaseConnector;
import static daoop_qlks_ver1.Main.conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.dto.Customer;

public class CustomerDAO extends CommonDAO<Customer> {

    public CustomerDAO() {
    }

    private static CustomerDAO instance = new CustomerDAO();

    public static CustomerDAO getInstance() {
        return instance;
    }

    public final List<Customer> customers = new ArrayList<>();

    public void addToList() throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM tblCustomer";
        Connection conn = DatabaseConnector.getSQLServerConnection();
        Statement stmt = conn.createStatement();
        //ResultSet rs = DataAccessObject.get(sql);
        stmt.execute(sql);
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            customers.add(new Customer(rs.getInt(1), rs.getString(2), rs.getBoolean(3),
                    rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
        }
    }

    public boolean addCustomer(Customer c) {
        String sql = "INSERT INTO tblCustomer(customerName, gender, dateOfBirth, address, phoneNumber, indentityNumber)"
                + " VALUES(?, ?, ?, ?, ?, ?)";
        try {
            conn = DatabaseConnector.getSQLServerConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, c.getName());
            ps.setBoolean(2, c.getGender());

            String startDate = c.getDateOfBirth(); // Input String
            SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy"); // New Pattern
            java.util.Date date = sdf1.parse(startDate); // Returns a Date format object with the pattern
            java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
            ps.setDate(3, sqlStartDate);
            
            ps.setString(4, c.getAddress());
            ps.setString(5, c.getPhoneNumber());
            ps.setString(6, c.getIndentityNumber());
            return ps.executeUpdate() > 0;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return false;
    }

    public ArrayList<Customer> getListCustomer() {
        ArrayList<Customer> listCustomer = new ArrayList<>();
        listCustomer = new ArrayList<>();
        String sql = "SELECT * FROM tblCustomer";
        try {
            conn = DatabaseConnector.getSQLServerConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Customer c = new Customer();
                c.setCustomerID(rs.getInt("customerID"));
                c.setName(rs.getString("customerName"));
                c.setGender(rs.getBoolean("gender"));
                c.setDateOfBirth(rs.getString("dateOfBirth"));
                c.setAddress(rs.getString("address"));
                c.setPhoneNumber(rs.getString("phoneNumber"));
                c.setIndentityNumber(rs.getString("indentityNumber"));

                listCustomer.add(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listCustomer;
    }

    @Override
    public int update(Customer customrer) {
        String sql = "";
        int ketqua = 0;
        try {
            sql = "UPDATE tblCustomer"
                    + " SET customerName = ?, gender = ?, dateOfBirth = ?, address = ?, phoneNumber = ?, indentityNumber = ? "
                    + " WHERE customerID = ?";
            Connection conn = DatabaseConnector.getSQLServerConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, customrer.getName());
            stmt.setBoolean(2, customrer.getGender());
            stmt.setString(3, customrer.getDateOfBirth());
            stmt.setString(4, customrer.getAddress());
            stmt.setString(5, customrer.getPhoneNumber());
            stmt.setString(6, customrer.getIndentityNumber());
            stmt.setInt(7, customrer.getCustomerID());
            stmt.execute();
            System.out.println("Updated");
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ketqua;
    }

    @Override
    public int add(Customer customer) {
        int ketqua = 0;
        String sql = "";
        try {
            sql = "INSERT INTO tblCustomer (customerName, gender, dateOfBirth, address, phoneNumber, indentity) VALUES "
                    + "(?, ?, ?, ?, ?, ?)";
            Connection conn = DatabaseConnector.getSQLServerConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, customer.getName());
            stmt.setBoolean(2, customer.getGender());
            stmt.setString(3, customer.getDateOfBirth());
            stmt.setString(4, customer.getAddress());
            stmt.setString(5, customer.getPhoneNumber());
            stmt.setString(6, customer.getIndentityNumber());
            stmt.execute();
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ketqua;
    }
}
