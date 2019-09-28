package com.pb.shipping.hackathon.truship.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by NEX4SXN on 9/28/2019.
 */
@Data
@Entity
@Table(name = "request")
public class Requests {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long requestId;
    @Column
    private long userId;
    @Column
    private long shipmentId;
    @Column // 1=Waiting, 2=Approved
    private int status;
    @Column
    private LocalDateTime requestDate;
    @Column
    private LocalDateTime updatedDate;
    @Column
    private double weight;
    @Column
    private double volume;

}
