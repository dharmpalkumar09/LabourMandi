package com.app.navinbharat.domain;

import com.app.navinbharat.model.Address;
import com.app.navinbharat.model.IdProof;
import com.app.navinbharat.enums.Rating;
import com.app.navinbharat.enums.Workcategory;

import java.sql.Timestamp;

public class Worker {

    private Long id;
    private String firstName;
    private String lastName;
    private Address address;
    private IdProof idproof;
    private String contactNo;
    private Rating rating;
    private Workcategory expertise;
    private Long totalEarning;
    private Long  perDayCost;
    private String emailID;
    private Timestamp updatedTime;
    private Timestamp createdTime;

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", idproof=" + idproof +
                ", contactNo='" + contactNo + '\'' +
                ", rating=" + rating +
                ", expertise=" + expertise +
                ", totalEarning=" + totalEarning +
                ", perDayCost=" + perDayCost +
                ", emailID='" + emailID + '\'' +
                ", updatedTime=" + updatedTime +
                ", createdTime=" + createdTime +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    public IdProof getIdproof() {
        return idproof;
    }

    public String getContactNo() {
        return contactNo;
    }

    public Rating getRating() {
        return rating;
    }

    public Workcategory getExpertise() {
        return expertise;
    }

    public Long getTotalEarning() {
        return totalEarning;
    }

    public Long getPerDayCost() {
        return perDayCost;
    }

    public String getEmailID() {
        return emailID;
    }

    public Timestamp getUpdatedTime() {
        return updatedTime;
    }

    public Timestamp getCreatedTime() {
        return createdTime;
    }
}
