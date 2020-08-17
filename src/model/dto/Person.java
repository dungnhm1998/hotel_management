package model.dto;

public class Person {

    String name;
    String phoneNumber;
    String address;
    String dateOfBirth;
    Boolean gender;
    String indentityNumber;

    public String getIndentityNumber() {
        return indentityNumber;
    }

    public void setIndentityNumber(String indentityNumber) {
        this.indentityNumber = indentityNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }
    
    
    
}


