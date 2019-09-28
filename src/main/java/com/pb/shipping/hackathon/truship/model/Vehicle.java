package com.pb.shipping.hackathon.truship.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle")
public class Vehicle {

    @Id
    private String regNumber;

    @Column
    private String licenseNo;

    @Column
    private String shipperId;

    @Column
    private double volume;

    @Column
    private double weight;

    public Vehicle() {
    }

    public Vehicle(String regNumber, String licenseNo, String shipperId, double volume, double weight) {
        this.regNumber = regNumber;
        this.licenseNo = licenseNo;
        this.shipperId = shipperId;
        this.volume = volume;
        this.weight = weight;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getShipperId() {
        return shipperId;
    }

    public void setShipperId(String shipperId) {
        this.shipperId = shipperId;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
