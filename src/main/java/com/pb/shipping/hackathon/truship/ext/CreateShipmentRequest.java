package com.pb.shipping.hackathon.truship.ext;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class CreateShipmentRequest {

    private String fromLocation;
    private String toLocation;
    private double volume;
    private double weight;
    private double expectedFare;
    private LocalDate shipmentDate;
    private LocalTime shipmentTime;
}
