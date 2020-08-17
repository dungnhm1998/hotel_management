package model.dto;

public class BookRoom {

    int customerID;
    int roomID;
    String dateFrom;
    String dateTo;
    int isPaid;

    public BookRoom(int customerID, int roomID, String dateFrom, String dateTo) {
        this.setCustomerID(customerID);
        this.setRoomID(roomID);
        this.setDateFrom(dateFrom);
        this.setDateTo(dateTo);
    }

    public int getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(int isPaid) {
        this.isPaid = isPaid;
    }

    public BookRoom() {
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

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

}
