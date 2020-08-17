/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.DO;

import controllerl.Util.impl.BookRoomDAO;
import controllerl.Util.impl.PayBillDAO;
import controllerl.Util.impl.RoomDAO;
import daoop_qlks_ver1.DatabaseConnector;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.dto.BookRoom;
import model.dto.PayBill;
import model.dto.Room;
import view.HomePage;

/**
 *
 * @author Admin
 */
public class RoomViewFloor1 extends javax.swing.JFrame {

    /**
     * Creates new form RoomViewFloor1
     */
    ArrayList<Room> listRoom;
    ArrayList<PayBill> listPayBill;
    ArrayList<BookRoom> listBookRoom;
    static int price = 0;
    static int roomID = 0;

    public RoomViewFloor1() {
        initComponents();
        this.setLocationRelativeTo(null);
        listRoom = new RoomDAO().getListRoom();
        listPayBill = new PayBillDAO().getLisPaytBill();
        listBookRoom = new BookRoomDAO().getListBookRoom();
        //int roomID = 0;
        for (Room room : listRoom) {
            if (room.getIsBooked() == true) {
                roomID = room.getRoomID();
                if (roomID == 1) {
                    btn1.setBackground(Color.red);
                }
                if (roomID == 2) {
                    btn2.setBackground(Color.red);
                }
                if (roomID == 3) {
                    btn3.setBackground(Color.red);
                }
                //break;
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

        jSplitPane2 = new javax.swing.JSplitPane();
        btn1 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtRoomID = new javax.swing.JTextField();
        txtRoomName = new javax.swing.JTextField();
        txtFloor = new javax.swing.JTextField();
        txtBedNumber = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnBook = new javax.swing.JButton();
        btnUse = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        txtHome = new javax.swing.JButton();
        btnOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RoomViewFloor1");

        btn1.setText("Phòng 101");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn3.setText("Phòng 103");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn7.setText("Phòng 107");

        btn5.setText("Phòng 105");

        btn2.setText("Phòng 102");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn4.setText("Phòng 104");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn6.setText("Phòng 106");

        btn8.setText("Phòng 108");

        jLabel1.setText("RoomID");

        jLabel2.setText("RoomName");

        jLabel3.setText("Floor");

        jLabel4.setText("Bed");

        jLabel5.setText("Price");

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        btnBook.setText("Book");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });

        btnUse.setText("Use");
        btnUse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUseActionPerformed(evt);
            }
        });

        btnNext.setText("next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        txtHome.setText("homePage");
        txtHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHomeActionPerformed(evt);
            }
        });

        btnOut.setText("Out");
        btnOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtHome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRoomID, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRoomName, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel4))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(6, 6, 6)))
                                        .addGap(48, 48, 48)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtBedNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtFloor, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(89, 89, 89)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBook)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNext)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUse)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnOut)))
                        .addGap(27, 27, 27))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn5, btn6});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtHome)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtRoomID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtRoomName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtFloor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtBedNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnBook)
                                    .addComponent(btnUse)
                                    .addComponent(btnOut))
                                .addGap(18, 18, 18)
                                .addComponent(btnNext))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn4ActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        // TODO add your handling code here:
        if (btnBook.getText().equals("Book")) {
            for (Room r : listRoom) {
                if (r.getRoomID() == Integer.parseInt(txtRoomID.getText())) {
                    try {
                        r.setIsBooked(true);
                        String sql = "UPDATE tblRoom SET isBooked = 1 WHERE roomID = ?";
                        Connection conn = DatabaseConnector.getSQLServerConnection();
                        PreparedStatement stmt = conn.prepareStatement(sql);
                        stmt.setInt(1, r.getRoomID());
                        stmt.execute();
                        JOptionPane.showMessageDialog(rootPane, "Booked done");
                        CustomerView cv = new CustomerView();
                        cv.pack();
                        cv.setLocationRelativeTo(null);
                        cv.setVisible(true);
                        dispose();
                        break;
                    } catch (SQLException | ClassNotFoundException ex) {
                        Logger.getLogger(RoomViewFloor1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Phong da duoc dat tu truoc");
        }
    }//GEN-LAST:event_btnBookActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        txtRoomID.setText("1");
        txtRoomName.setText("101");
        txtFloor.setText("1");
        txtBedNumber.setText("1");
        txtPrice.setText("50000");
        for (Room r : listRoom) {
            if (r.getRoomID() == 1) {
                if (r.getIsBooked() == true) {
                    btnBook.setText("Booked");
                } else {
                    btnBook.setText("Book");
                }
            }
            if (r.getRoomID() == 1) {
                if (r.getIsUsed() == true) {
                    btnUse.setText("Used");
                } else {
                    btnUse.setText("Use");
                }
            }
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        txtRoomID.setText("2");
        txtRoomName.setText("102");
        txtFloor.setText("1");
        txtBedNumber.setText("1");
        txtPrice.setText("50000");
        for (Room r : listRoom) {
            if (r.getRoomID() == 2) {
                if (r.getIsBooked() == true) {
                    btnBook.setText("Booked");
                } else {
                    btnBook.setText("Book");
                }
            }
            if (r.getRoomID() == 2) {
                if (r.getIsUsed() == true) {
                    btnUse.setText("Used");
                } else {
                    btnUse.setText("Use");
                }
            }
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        txtRoomID.setText("3");
        txtRoomName.setText("103");
        txtFloor.setText("1");
        txtBedNumber.setText("2");
        txtPrice.setText("120000");
        for (Room r : listRoom) {
            if (r.getRoomID() == 3) {
                if (r.getIsBooked() == true) {
                    btnBook.setText("Booked");
                } else {
                    btnBook.setText("Book");
                }
            }
            if (r.getRoomID() == 3) {
                if (r.getIsUsed() == true) {
                    btnUse.setText("Used");
                } else {
                    btnUse.setText("Use");
                }
            }
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btnUseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUseActionPerformed
        // TODO add your handling code here:
        int roomID = 0;
        if (btnUse.getText().equals("Use")) {
            roomID = Integer.parseInt(txtRoomID.getText());
            for (Room r : listRoom) {
                if (r.getRoomID() == roomID) {
                    try {

                        r.setIsBooked(true);
                        String sql = "UPDATE tblRoom SET isUsed = 1, isBooked = 1 WHERE roomID = ?";
                        Connection conn = DatabaseConnector.getSQLServerConnection();
                        PreparedStatement stmt = conn.prepareStatement(sql);
                        stmt.setInt(1, r.getRoomID());
                        stmt.execute();
                        JOptionPane.showMessageDialog(rootPane, "Used done");
                        CustomerView cv = new CustomerView();
                        cv.pack();
                        cv.setLocationRelativeTo(null);
                        cv.setVisible(true);
                        dispose();
                        break;
                    } catch (SQLException | ClassNotFoundException ex) {
                        Logger.getLogger(RoomViewFloor1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Phong dang duoc su dung");
        }
    }//GEN-LAST:event_btnUseActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        dispose();
        RoomViewFloor2 roomview2 = new RoomViewFloor2();
        roomview2.pack();
        roomview2.setLocationRelativeTo(null);
        roomview2.setVisible(true);
    }//GEN-LAST:event_btnNextActionPerformed

    private void txtHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHomeActionPerformed
        // TODO add your handling code here:
        dispose();
        HomePage homePage = new HomePage();
        homePage.pack();
        homePage.setLocationRelativeTo(null);
        homePage.setVisible(true);
    }//GEN-LAST:event_txtHomeActionPerformed

    private void btnOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutActionPerformed
        // TODO add your handling code here:       
        roomID = Integer.parseInt(txtRoomID.getText());
        Date date3;
        Date date4;
        for (BookRoom br : listBookRoom) {
            if (br.getRoomID() == roomID) {
                int x = 0;
                try {
                    date3 = new SimpleDateFormat("yyyy-MM-dd").parse(br.getDateFrom());
                    date4 = new SimpleDateFormat("yyyy-MM-dd").parse(br.getDateTo());
                    long diff = date4.getTime() - date3.getTime();
                    x = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

                    for (Room r : listRoom) {
                        if (r.getRoomID() == br.getRoomID()) {
                            price = (x + 1) * r.getPrice();
                            break;
                        }
                    }
                    System.out.println(x + " " + price);
                } catch (ParseException ex) {
                    Logger.getLogger(RoomViewFloor1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        for (Room r : listRoom) {
            if (r.getRoomID() == Integer.parseInt(txtRoomID.getText())) {
                r.setIsUsed(false);
                r.setIsBooked(false);
                String sql = "UPDATE tblRoom SET isUsed = 0, isBooked= 0 WHERE roomID = ?";
                Connection conn;
                try {
                    conn = DatabaseConnector.getSQLServerConnection();
                    PreparedStatement stmt = conn.prepareStatement(sql);
                    stmt.setInt(1, r.getRoomID());
                    stmt.execute();
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(RoomViewFloor1.class.getName()).log(Level.SEVERE, null, ex);
                }

                JOptionPane.showMessageDialog(rootPane, "Out done");
            }
        }
        dispose();
        BillView bv = new BillView();
        bv.pack();
        bv.setLocationRelativeTo(null);
        bv.setVisible(true);
    }//GEN-LAST:event_btnOutActionPerformed

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
            java.util.logging.Logger.getLogger(RoomViewFloor1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomViewFloor1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomViewFloor1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomViewFloor1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomViewFloor1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnOut;
    private javax.swing.JButton btnUse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtBedNumber;
    private javax.swing.JTextField txtFloor;
    private javax.swing.JButton txtHome;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtRoomID;
    private javax.swing.JTextField txtRoomName;
    // End of variables declaration//GEN-END:variables
}