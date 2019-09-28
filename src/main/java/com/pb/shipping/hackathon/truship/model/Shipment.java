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
}
