package com.pb.shipping.hackathon.truship.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "shipment")
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long shipmentId;

    @Column
    private String fromLocation;
    @Column
    private String toLocation;
    @Column
    private long regNumber;
    @Column
    private LocalDate shipmentDate;
    @Column
    private LocalTime shipmentTime;
    @Column
    @Embedded
    private Capacity capacity;
    @Column
    private double fareEarned;
    @Column
    private long shipperId;

    public long getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(long shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public long getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(long regNumber) {
        this.regNumber = regNumber;
    }

    public LocalDate getShipmentDate() {
        return shipmentDate;
    }

    public void setShipmentDate(LocalDate shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    public LocalTime getShipmentTime() {
        return shipmentTime;
    }

    public void setShipmentTime(LocalTime shipmentTime) {
        this.shipmentTime = shipmentTime;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    public double getFareEarned() {
        return fareEarned;
    }

    public void setFareEarned(double fareEarned) {
        this.fareEarned = fareEarned;
    }

    public long getShipperId() {
        return shipperId;
    }

    public void setShipperId(long shipperId) {
        this.shipperId = shipperId;
    }
}
