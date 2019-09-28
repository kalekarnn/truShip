package com.pb.shipping.hackathon.truship.model;

import lombok.Data;

import javax.persistence.Id;

@Data
public class Vehicle {
    @Id
    private long regNumber;
    private Capacity totalCapacity;
}
