package com.pb.shipping.hackathon.truship.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle")
@Data
@ToString
@EqualsAndHashCode
public class Vehicle {

    @Id
    private long regNumber;

    @Column
    private long licenseNo;

    @Column
    private long shipperId;

    @Column
    private double volume;

    @Column
    private double weight;

    public Vehicle() {
    }

    public Vehicle(long regNumber, long licenseNo, long shipperId, double volume, double weight) {
        this.regNumber = regNumber;
        this.licenseNo = licenseNo;
        this.shipperId = shipperId;
        this.volume = volume;
        this.weight = weight;
    }

    public long getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(long regNumber) {
        this.regNumber = regNumber;
    }

    public long getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(long licenseNo) {
        this.licenseNo = licenseNo;
    }

    public long getShipperId() {
        return shipperId;
    }

    public void setShipperId(long shipperId) {
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
