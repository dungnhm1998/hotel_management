package model.dto;

public class Customer extends Person {

    int customerID;
    int customerRoom;
    Boolean isPaid;

    public Customer(int customerID, String customerName, boolean gender,
            String dateOfBirth, String address, String phoneNumber, String indentityNumber) {
        this.setCustomerID(customerID);
        this.setName(customerName);
        this.setGender(gender);
        this.setDateOfBirth(dateOfBirth);
        this.setAddress(address);
        this.setPhoneNumber(phoneNumber);
        this.setIndentityNumber(indentityNumber);
    }

    public Customer() {
        
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getCustomerRoom() {
        return customerRoom;
    }

    public void setCustomerRoom(int customerRoom) {
        this.customerRoom = customerRoom;
    }
   

    public void checkIn() {
    }

    public void checkOut() {
    }
}
