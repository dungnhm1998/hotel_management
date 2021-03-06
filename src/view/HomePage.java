/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controllerl.Util.impl.BookRoomDAO;
import controllerl.Util.impl.RoomDAO;
import controllerl.Util.impl.UserDAO;
import daoop_qlks_ver1.DatabaseConnector;
import java.sql.Connection;
//import java.sql.Date;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.dto.BookRoom;
import model.dto.Room;
import model.dto.User;
import view.DO.BillView;
import view.DO.CustomerView;
import view.DO.RoomView;
import view.DO.RoomViewList;

/**
 *
 * @author Admin
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    ArrayList<User> listUser;
    ArrayList<BookRoom> listBookRoom;
    ArrayList<Room> listRoom;

    public HomePage() {
        initComponents();
        this.setLocationRelativeTo(null);
        listUser = new UserDAO().getListUser();
        listBookRoom = new BookRoomDAO().getListBookRoom();
        listRoom = new RoomDAO().getListRoom();
        for (BookRoom br : listBookRoom) {
            if (br.getIsPaid() == 0) {
                try {
                    Date date1 = (Date) new SimpleDateFormat("yyyy-MM-dd").parse(br.getDateFrom());
                    long millis = System.currentTimeMillis();
                    Date date2 = new java.sql.Date(millis);
                    if (date1.before(date2)) {
                        System.out.println(br.getDateFrom() + " " + " " + date2);
                        String sql = "UPDATE tblRoom SET isUsed = 1, isBooked = 1 WHERE roomID = ?";
                        Connection conn;
                        try {
                            conn = DatabaseConnector.getSQLServerConnection();
                            PreparedStatement stmt = conn.prepareStatement(sql);
                            stmt.setInt(1, br.getRoomID());
                            stmt.execute();
                        } catch (SQLException | ClassNotFoundException ex) {
                            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnQLTK = new javax.swing.JButton();
        btnQLDP = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        btnTTKH = new javax.swing.JButton();
        btnQLP = new javax.swing.JButton();
        btnTK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home page");

        btnQLTK.setText("Quan ly tai khoan");
        btnQLTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLTKActionPerformed(evt);
            }
        });

        btnQLDP.setText("Quan ly dat phong");
        btnQLDP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLDPActionPerformed(evt);
            }
        });

        btnLogout.setText("Dang xuat");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnTTKH.setText("Thong tin khach hang");
        btnTTKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTTKHActionPerformed(evt);
            }
        });

        btnQLP.setText("Quan ly phong");
        btnQLP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLPActionPerformed(evt);
            }
        });

        btnTK.setText("Thong ke");
        btnTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTK)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnQLTK)
                            .addComponent(btnTTKH))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnQLP)
                            .addComponent(btnQLDP))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQLTK)
                    .addComponent(btnQLDP))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTTKH)
                    .addComponent(btnQLP))
                .addGap(42, 42, 42)
                .addComponent(btnTK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQLTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLTKActionPerformed
        // TODO add your handling code here:
        dispose();
        UserForm userForm = new UserForm();
        userForm.pack();
        userForm.setLocationRelativeTo(null);
        userForm.setVisible(true);
    }//GEN-LAST:event_btnQLTKActionPerformed

    private void btnQLDPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLDPActionPerformed
        // TODO add your handling code here:
        dispose();
        RoomViewList rvList = new RoomViewList();
        rvList.pack();
        rvList.setLocationRelativeTo(null);
        rvList.setVisible(true);
//        RoomViewFloor1 roomview1 = new RoomViewFloor1();
//        roomview1.pack();
//        roomview1.setLocationRelativeTo(null);
//        roomview1.setVisible(true);
    }//GEN-LAST:event_btnQLDPActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        for (User u : listUser) {
            if (u.getIsLogin() == true) {
                u.setIsLogin(false);
                //afterLoginDone();
                try {
                    String sql = "Update tblUser SET isLogin = 0 WHERE userID = ?";
                    Connection conn = DatabaseConnector.getSQLServerConnection();
                    PreparedStatement stmt = conn.prepareStatement(sql);
                    stmt.setInt(1, u.getUserID());
                    stmt.execute();
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
                }

                dispose();
                Login login = new Login();
                login.pack();
                login.setLocationRelativeTo(null);
                login.setVisible(true);
            }
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnTTKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTTKHActionPerformed
        // TODO add your handling code here:
        dispose();
        CustomerView customerView = new CustomerView();
        customerView.pack();
        customerView.setLocationRelativeTo(null);
        customerView.setVisible(true);
    }//GEN-LAST:event_btnTTKHActionPerformed

    private void btnQLPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLPActionPerformed
        // TODO add your handling code here:
        dispose();
        RoomView roomView = new RoomView();
        roomView.pack();
        roomView.setLocationRelativeTo(null);
        roomView.setVisible(true);
    }//GEN-LAST:event_btnQLPActionPerformed

    private void btnTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKActionPerformed
        // TODO add your handling code here:
        dispose();
        BillView billView = new BillView();
        billView.pack();
        billView.setLocationRelativeTo(null);
        billView.setVisible(true);
    }//GEN-LAST:event_btnTKActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnQLDP;
    private javax.swing.JButton btnQLP;
    private javax.swing.JButton btnQLTK;
    private javax.swing.JButton btnTK;
    private javax.swing.JButton btnTTKH;
    // End of variables declaration//GEN-END:variables
}
