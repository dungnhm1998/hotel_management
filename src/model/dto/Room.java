package model.dto;

import java.util.ArrayList;
import java.util.List;

public class Room {

    int roomID;
    String roomName;
    boolean isBooked;
    boolean isUsed;

    
    int floor;
    int bedNumber;
    int price;
    List<Customer> listRoomCustomer = new ArrayList<>();
    //String customerName;

    public Room(int roomID, String roomName, boolean isBooked, boolean isUsed,
            int floor, int bedNumber, int price) {
        this.setRoomID(roomID);
        this.setRoomName(roomName);
        this.setIsBooked(isBooked);
        this.setIsUsed(isUsed);
        this.setFloor(floor);
        this.setBedNumber(bedNumber);
        this.setPrice(price);
    }

    public Room() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(int bedNumber) {
        this.bedNumber = bedNumber;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean getIsBooked() {
        return isBooked;
    }

    public void setIsBooked(boolean isBooked) {
        this.isBooked = isBooked;
    }

    public boolean getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(boolean isUsed) {
        this.isUsed = isUsed;
    }
    public List<Customer> getListRoomCustomer() {
        return listRoomCustomer;
    }

    public void setListRoomCustomer(List<Customer> listRoomCustomer) {
        this.listRoomCustomer = listRoomCustomer;
    }

}
