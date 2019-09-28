package com.pb.shipping.hackathon.truship.ext;

import java.time.LocalDate;
import java.time.LocalTime;

public class CreateShipmentRequest {

    private String fromLocation;
    private String toLocation;
    private double volume;
    private double weight;
    private double expectedFare;
    private LocalDate shipmentDate;
    private LocalTime shipmentTime;
    private long shipperId;


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

    public double getExpectedFare() {
        return expectedFare;
    }

    public void setExpectedFare(double expectedFare) {
        this.expectedFare = expectedFare;
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

    public long getShipperId() {
        return shipperId;
    }

    public void setShipperId(long shipperId) {
        this.shipperId = shipperId;
    }


}
