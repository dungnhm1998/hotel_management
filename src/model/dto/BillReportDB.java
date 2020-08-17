/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dto;

/**
 *
 * @author Admin
 */
public class BillReportDB {
    int payBillID;
    int billID;
    int customerID;
    int roomID;
    int price;
    String datePay;
    int isPrinted;

    public int getIsPrinted() {
        return isPrinted;
    }

    public void setIsPrinted(int isPrinted) {
        this.isPrinted = isPrinted;
    }
    
    public BillReportDB(){
        
    }

    public int getPayBillID() {
        return payBillID;
    }

    public void setPayBillID(int payBillID) {
        this.payBillID = payBillID;
    }

    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDatePay() {
        return datePay;
    }

    public void setDatePay(String datePay) {
        this.datePay = datePay;
    }
    
    
}
