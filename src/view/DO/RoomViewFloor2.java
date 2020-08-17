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
public class RoomViewFloor2 extends javax.swing.JFrame {

    /**
     * Creates new form RoomViewFloor2
     */
    ArrayList<Room> listRoom;
    ArrayList<PayBill> listPayBill;
    ArrayList<BookRoom> listBookRoom;
    static int price2 = 0;
    static int roomID2 = 0;

    public RoomViewFloor2() {
        initComponents();
        this.setLocationRelativeTo(null);
        listRoom = new RoomDAO().getListRoom();
        listPayBill = new PayBillDAO().getLisPaytBill();
        listBookRoom = new BookRoomDAO().getListBookRoom();

        int roomID = 0;
        for (Room room : listRoom) {
            if (room.getIsBooked() == true) {
                roomID = room.getRoomID();
                if (roomID == 4) {
                    btn1.setBackground(Color.red);
                }
                if (roomID == 5) {
                    btn2.setBackground(Color.red);
                }
                if (roomID == 6) {
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

        btn1 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        a = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        d = new javax.swing.JLabel();
        e = new javax.swing.JLabel();
        txtRoomID = new javax.swing.JTextField();
        txtRoomName = new javax.swing.JTextField();
        txtFloor = new javax.swing.JTextField();
        txtBedNumber = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnBook = new javax.swing.JButton();
        btnUse = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        txtHome = new javax.swing.JButton();
        btnOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RoomViewFloor2");

        btn1.setText("Phòng 201");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn3.setText("Phòng 203");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn5.setText("Phòng 205");

        btn7.setText("Phòng 207");

        btn8.setText("Phòng 208");

        btn6.setText("Phòng 206");

        btn4.setText("Phòng 204");

        btn2.setText("Phòng 202");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        a.setText("RoomID");

        b.setText("RoomName");

        c.setText("Floor");

        d.setText("Bed");

        e.setText("Price");

        txtRoomName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoomNameActionPerformed(evt);
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

        btnBack.setText("back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
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
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btn1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtHome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(btn2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn8, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(e)
                            .addComponent(d)
                            .addComponent(c)
                            .addComponent(b))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtFloor)
                            .addComponent(txtBedNumber)
                            .addComponent(txtRoomName)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(a)
                        .addGap(37, 37, 37)
                        .addComponent(txtRoomID, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(btnBack)
                                .addGap(18, 18, 18)
                                .addComponent(btnNext))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(btnBook)
                                .addGap(18, 18, 18)
                                .addComponent(btnUse)
                                .addGap(18, 18, 18)
                                .addComponent(btnOut)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtHome)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBook)
                            .addComponent(btnUse)
                            .addComponent(btnOut)
                            .addComponent(txtBedNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBack)
                            .addComponent(btnNext))
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(e)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b)
                            .addComponent(txtRoomName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a)
                            .addComponent(txtRoomID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c)
                            .addComponent(txtFloor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(134, 134, 134))))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRoomNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoomNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomNameActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        txtRoomID.setText("4");
        txtRoomName.setText("201");
        txtFloor.setText("2");
        txtBedNumber.setText("1");
        txtPrice.setText("60000");
        for (Room r : listRoom) {
            if (r.getRoomID() == 4) {
                if (r.getIsBooked() == true) {
                    btnBook.setText("Booked");
                } else {
                    btnBook.setText("Book");
                }
            }
            if (r.getRoomID() == 4) {
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
        txtRoomID.setText("5");
        txtRoomName.setText("202");
        txtFloor.setText("2");
        txtBedNumber.setText("1");
        txtPrice.setText("60000");
        for (Room r : listRoom) {
            if (r.getRoomID() == 5) {
                if (r.getIsBooked() == true) {
                    btnBook.setText("Booked");
                } else {
                    btnBook.setText("Book");
                }
            }
            if (r.getRoomID() == 5) {
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
        txtRoomID.setText("6");
        txtRoomName.setText("203");
        txtFloor.setText("2");
        txtBedNumber.setText("2");
        txtPrice.setText("150000");
        for (Room r : listRoom) {
            if (r.getRoomID() == 6) {
                if (r.getIsBooked() == true) {
                    btnBook.setText("Booked");
                } else {
                    btnBook.setText("Book");
                }
            }
            if (r.getRoomID() == 6) {
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
        if (btnUse.getText().equals("Use")) {
            for (Room r : listRoom) {
                if (r.getRoomID() == Integer.parseInt(txtRoomID.getText())) {
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

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        dispose();
        RoomViewFloor1 roomview1 = new RoomViewFloor1();
        roomview1.pack();
        roomview1.setLocationRelativeTo(null);
        roomview1.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        dispose();
        RoomViewFloor3 roomview3 = new RoomViewFloor3();
        roomview3.pack();
        roomview3.setLocationRelativeTo(null);
        roomview3.setVisible(true);
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
        roomID2 = Integer.parseInt(txtRoomID.getText());
        Date date3;
        Date date4;
        for (BookRoom br : listBookRoom) {
            if (br.getRoomID() == roomID2) {
                int x = 0;
                try {
                    date3 = new SimpleDateFormat("yyyy-MM-dd").parse(br.getDateFrom());
                    date4 = new SimpleDateFormat("yyyy-MM-dd").parse(br.getDateTo());
                    long diff = date4.getTime() - date3.getTime();
                    x = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
                    for (Room r : listRoom) {
                        if (r.getRoomID() == br.getRoomID()) {
                            price2 = (x + 1) * r.getPrice();
                            break;
                        }
                    }
                    System.out.println(x + " " + price2);
                } catch (ParseException ex) {
                    Logger.getLogger(RoomViewFloor1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        for (Room r : listRoom) {
            if (r.getRoomID() == Integer.parseInt(txtRoomID.getText())) {
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
            java.util.logging.Logger.getLogger(RoomViewFloor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomViewFloor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomViewFloor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomViewFloor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomViewFloor2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a;
    private javax.swing.JLabel b;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnOut;
    private javax.swing.JButton btnUse;
    private javax.swing.JLabel c;
    private javax.swing.JLabel d;
    private javax.swing.JLabel e;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtBedNumber;
    private javax.swing.JTextField txtFloor;
    private javax.swing.JButton txtHome;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtRoomID;
    private javax.swing.JTextField txtRoomName;
    // End of variables declaration//GEN-END:variables

}