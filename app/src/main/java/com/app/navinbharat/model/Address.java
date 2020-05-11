package com.app.navinbharat.model;

public class Address {
    private String houseNo;
    private String addressLine1;
    private String getAddressLine2;
    private String city;
    private String district;
    private String state;
    private int pinCode;
    private String landmark;

    @Override
    public String toString() {
        return "Address{" +
                "houseNo='" + houseNo + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", getAddressLine2='" + getAddressLine2 + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", state='" + state + '\'' +
                ", pinCode=" + pinCode +
                ", landmark='" + landmark + '\'' +
                '}';
    }

    public String getHouseNo() {
        return houseNo;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getGetAddressLine2() {
        return getAddressLine2;
    }

    public String getCity() {
        return city;
    }

    public String getDistrict() {
        return district;
    }

    public String getState() {
        return state;
    }

    public int getPinCode() {
        return pinCode;
    }

    public String getLandmark() {
        return landmark;
    }
}
